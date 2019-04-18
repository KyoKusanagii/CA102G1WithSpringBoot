package com.ca102g1.springboot.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.ca102g1.springboot.model.FbShoppingCart;
import com.ca102g1.springboot.model.Item;
import com.ca102g1.springboot.model.Member;
import com.ca102g1.springboot.service.ItemDAO_interface;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.item.model.ItemService;
import com.item.model.ItemVO;
import com.itempic.model.ItempicService;
import com.fbitem.model.FbItemVO;
import com.fborder.model.FbOrderDAO;
import com.fborder.model.FbOrderService;
import com.fborder.model.FbOrderVO;
import com.member.model.MemService;
import com.member.model.MemVO;
import com.shoppingCart.model.FbShoppingCartVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.BASE64Decoder;

/**
 * Servlet implementation class FbLiveServlet
 */
//@WebServlet("/FrontEnd/FbLive.do")
@Controller
@RequestMapping("/fbLive")
public class FbLiveServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	ItemDAO_interface itemDAO_interface;

	@RequestMapping(value = "insert_item",method = RequestMethod.POST)
	public String intertItem(@RequestParam("item_name") String item_name,
	 @RequestParam("item_price") String item_price, @RequestParam("item_owner") String item_owner){
		PrintWriter out = res.getWriter();
		Integer item_primary_class = 1;
		Integer item_secondary_class = 1;
		Integer is_fb_launch = 1; // 預設新增就上架
		Integer is_mall_launch = 0;
		Integer item_inventory = 1;
		String item_description = "暫無商品描述";
		Item item = new Item();
		item.setIsFbLaunch(is_fb_launch);
		item.setIsMallLaunch(is_mall_launch);
		item.setItemDescription(item_description);
		item.setItemInventory(item_inventory);
		item.setItemName(item_name);
		item.setItemPrice(item_price);
		item.setItemOwner(item_owner);
		item.setItemPrimaryClass(item_primary_class);
		item.setItemSecondaryClass(item_secondary_class);
		String next_itemno = itemDAO_interface.insert(item);
		out.println(next_itemno);
	}

	@RequestMapping(value = "/insertOrder",method = RequestMethod.POST)
	public String insertOrder(){
		HttpSession session = req.getSession();
		List<FbShoppingCart> fb_buylist = (Vector<FbShoppingCart>) session.getAttribute("fb_shoppingCart");
		Map<String, String> errorMsgs = new LinkedHashMap<String, String>();
		req.setAttribute("errorMsgs", errorMsgs);
		Member member = new Member();
		Timestamp fb_order_time = new Timestamp(System.currentTimeMillis());
		String fb_order_trans = "未選擇";
		String fb_order_status = "進行中";
		String fb_pay_status = "未付款";
		String fb_transport = "未選擇";
		String fb_order_remark = "無";
		Set<String> buyer_no_set = new HashSet<String>();
		for (int i = 0; i < fb_buylist.size(); i++) {
			FbShoppingCart order = fb_buylist.get(i);
			buyer_no_set.add(order.getFb_buyer_no());
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		String action = req.getParameter("action");
		HttpSession session = req.getSession();
		List<FbShoppingCartVO> fb_buylist = (Vector<FbShoppingCartVO>) session.getAttribute("fb_shoppingCart");
		PrintWriter out = res.getWriter();
		
		
		if("kill".equals(action)) {
			
			session.removeAttribute("fb_shoppingCart");
			System.out.println("清空囉");

		}
		

			try {
				/*********************** 1.接收請求參數 - 輸入格式的錯誤處理 *************************/

				// ItemService itemSvc = new ItemService();
				Set<String> buyer_no_set = new HashSet<String>();
				// 將購物車中商品取出,並寫入FbShoppingCartVO
				// List<FbShoppingCartVO> orderList = new ArrayList<FbShoppingCartVO>();

				// 抓出所有的買家set

				System.out.println("buyer_no=" + buyer_no_set.size());

				// 開始新增訂單交易
				for (int i = 0; i < buyer_no_set.size(); i++) {
					Integer fb_order_prc = 0;
					List<FbShoppingCartVO> list = null;
					String fb_buyer_no = null;
					// 每個買家的訂單list
					List<FbItemVO> orderList = new ArrayList<FbItemVO>();
					// 將shoppingCart塞進fbItemVO
					for (int j = 0; j < fb_buylist.size(); j++) {
						FbShoppingCartVO fbShoppingCartVO = fb_buylist.get(j);

						if (buyer_no_set.toArray()[i].equals(fbShoppingCartVO.getFb_buyer_no())) {
							list = new ArrayList<FbShoppingCartVO>();
							list.add(fbShoppingCartVO);
							fb_order_prc += fbShoppingCartVO.getFb_item_price() * fbShoppingCartVO.getQuantity();
							fb_buyer_no = fbShoppingCartVO.getFb_buyer_no();

							BASE64Decoder dec = new BASE64Decoder();
							FbItemVO fbitemVO = new FbItemVO();
							fbitemVO.setItem_no(fbShoppingCartVO.getFb_item_no());
							fbitemVO.setFb_item_prc(fbShoppingCartVO.getFb_item_price());
							fbitemVO.setFb_item_cnt(fbShoppingCartVO.getQuantity());
							fbitemVO.setFb_comment(fbShoppingCartVO.getFb_comment());
							fbitemVO.setFb_item_pic(dec.decodeBuffer(fbShoppingCartVO.getFb_item_pic()));
							orderList.add(fbitemVO);
						}

					}
					// FbOrder的所有參數+FbOrderItem的List
					FbOrderService fbOrderSvc = new FbOrderService();
					fbOrderSvc.insertFbOrder(fb_buyer_no, fb_order_time, fb_order_prc, fb_order_trans, fb_order_status,
							fb_pay_status, fb_order_remark, fb_transport, orderList);
					System.out.println("FB直播訂單新增成功");
					session.removeAttribute("fb_shoppingCart");
					out.print("FB直播訂單新增成功");

					
				}

				/********************************************/

				if (!errorMsgs.isEmpty()) {
					RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/member/checkout.jsp");
					failureView.forward(req, res);
					return;// 程式中斷
				}

				/*************************** 2.開始新增資料 ***************************************/

				// 寄email確認收到訂單
				/*************************** 3.新增完成,準備轉交(Send the Success view) ***********/

				/*************************** 其他可能的錯誤處理 **********************************/
			} catch (Exception e) {
				errorMsgs.put("Exception", e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/index.jsp");
				failureView.forward(req, res);
			}

		}

		if (action.equals("DELETE")) {
			System.out.println("進來deletete");
			FbShoppingCartVO aItem = getItem(req);
			if (fb_buylist.contains(aItem)) {
				if (fb_buylist.get(fb_buylist.indexOf(aItem)).getQuantity() > 1)
					fb_buylist.get(fb_buylist.indexOf(aItem))
							.setQuantity(fb_buylist.get(fb_buylist.indexOf(aItem)).getQuantity() - aItem.getQuantity());
				else
					fb_buylist.remove(aItem);
				System.out.println("刪除成功");

				// 有商品被刪除時總金額跟著改變
				// int total = 0;
				// for (int i = 0; i < buylist.size(); i++) {
				// ItemVO order = buylist.get(i);
				// Integer price = order.getPrice();
				// Integer quantity = order.getQuantity();
				// total += (price * quantity);
				// }

				// System.out.println("total=" + total);

				// 回傳總金額至ajax
				// PrintWriter out =res.getWriter();
				// out.print(total);

			}
		}

	}

	private FbShoppingCartVO getItem(HttpServletRequest req) {

		MemService memSvc = new MemService();

		Integer quantity = 1;// req.getParameter("quantity");
		String fb_buyer = req.getParameter("fb_buyer");
		String fb_comment = req.getParameter("fb_comment");
		String fb_item_no = req.getParameter("fb_item_no");
		String fb_buyer_no = memSvc.checkFBName(fb_buyer).getMem_no();
		Integer fb_item_price = new Integer(req.getParameter("fb_item_price"));
		String fb_item_pic = req.getParameter("fb_pic");

		FbShoppingCartVO fbShoppingCartVO = new FbShoppingCartVO();

		fbShoppingCartVO.setQuantity(quantity);
		fbShoppingCartVO.setFb_buyer(fb_buyer);
		fbShoppingCartVO.setFb_comment(fb_comment);
		fbShoppingCartVO.setFb_buyer_no(fb_buyer_no);
		fbShoppingCartVO.setFb_item_no(fb_item_no);
		fbShoppingCartVO.setFb_item_price(fb_item_price);
		fbShoppingCartVO.setFb_item_pic(fb_item_pic);

		return fbShoppingCartVO;

	}
}
