package com.ca102g1.springboot.controller;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

import com.chat.model.ChatService;
import com.item.model.ItemVO;
import com.member.model.*;
import com.randomNewItem.model.RandomItemService;
import com.shoppingCart.model.FbShoppingCartVO;

@MultipartConfig()
@WebServlet("/FrontEnd/member/fb.do")
public class FBServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		String action = req.getParameter("action");
		// �n�X�}�l
		HttpSession session = req.getSession();

		if ("logout".equals(action)) {
			session.removeAttribute("memVO"); // code inserted by Amber
			session.removeAttribute("shoppingcart");
			res.sendRedirect(req.getContextPath() + "/FrontEnd/index.jsp");
		}
		// �n�X����

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		String action = req.getParameter("action");
		HttpSession session = req.getSession();
		List<FbShoppingCartVO> fb_buylist = (Vector<FbShoppingCartVO>) session.getAttribute("fb_shoppingCart");

		// FB�n�J
		if ("fb_login".equals(action)) {

			// ���oFB ID
			String mem_id = req.getParameter("mem_id");
			System.out.println("FB ID�G" + mem_id);
			// ���w�]�K�X
			String mem_psw = "123456";
			System.out.println("FB PSW�G" + mem_psw);

			// ���oFB �W�r�A���쪺����s�XFB API�w�]��UTF-8�A�ন�s�边���u�@���ҽs�X
			String mem_name1 = req.getParameter("mem_name");
			byte[] ms950Bytes = mem_name1.getBytes("MS950");
			String mem_name = new String(ms950Bytes, "MS950");
			System.out.println("FB NAME�G" + mem_name);

			MemDAO dao = new MemDAO();
			MemVO memCheckVO = dao.checkFBName(mem_name);

			if (memCheckVO == null) { // �p�GFB�S�����U�L---�����U

				// ���oFB E-MAIL
				String mem_email = req.getParameter("mem_email");
				System.out.println("FB EMAIL�G" + mem_email);

				String mem_fbid = mem_id;

				// ���oFB �j�Y�K
				String picurl = req.getParameter("mem_picture");
				System.out.println("FB PIC SRC�G" + picurl);
				byte[] mem_profilepic = getImageFromNetByUrl(picurl);

				// ���w�]����ʭ�
				@SuppressWarnings("deprecation")
				File martcover = new File(req.getRealPath("/FrontEnd/images/NewMember/mart_pic.png"));
				BufferedImage martcoverImage = ImageIO.read(martcover);
				ByteArrayOutputStream martcoverBaos = new ByteArrayOutputStream();
				ImageIO.write(martcoverImage, "png", martcoverBaos);
				martcoverBaos.flush();
				byte[] mem_martcover = martcoverBaos.toByteArray();

				MemService memSvc = new MemService();
				MemVO memFBVO = memSvc.fbSignup(mem_id, mem_name, mem_psw, mem_email, mem_fbid, mem_profilepic,
						mem_martcover);

				ChatService chatSvc = new ChatService();
				chatSvc.addFrined(memSvc.findNewestMember(), "E00000");
			} else if (memCheckVO.getMem_email() == null || memCheckVO.getMem_fbid() == null) {
				// �p�G�OFB�o�Ъ�(FB�ֳt���U)�A�⧹��FB��T�[�J��Ʈw

				// ���oFB E-MAIL
				String mem_email = req.getParameter("mem_email");

				// ���oFB ID
				String mem_fbid = mem_id;

				// ���oFB �j�Y�K
				String picurl = req.getParameter("mem_picture");
				System.out.println("FB PIC SRC�G" + picurl);
				byte[] mem_profilepic = getImageFromNetByUrl(picurl);

				MemService memSvc = new MemService();
				MemVO memFbFullInfoVO = memSvc.fbFullInfo(mem_name, mem_id, mem_email, mem_fbid, mem_profilepic);
			} else {
				// �C���n�J���ק�Ϥ�>.^(�N�O����)
				// ���oFB �j�Y�K
				String picurl = req.getParameter("mem_picture");
				System.out.println("FB PIC SRC�G" + picurl);
				byte[] mem_profilepic = getImageFromNetByUrl(picurl);

				MemService memSvc = new MemService();
				MemVO memFbPictureVO = memSvc.fbNamePicture(mem_name, mem_profilepic);
			}

			// �p�GFB�w�g���U�L---�۷��n�J
			MemVO memVO = allowFbUser(mem_name, mem_psw);
			String mem_Id = memVO.getMem_id();
			String session_id = session.getId();
			session.setAttribute(session_id, mem_Id); // *�u�@1: �~�bsession�����w�g�n�J�L������

			session.setAttribute("login_state", true); // �|���n�J�����A��true

			session.setAttribute("memVO", memVO); // session�]�۷|����ƨ�

			/* 8/16 �qMemVO�h�L�� */
			RandomItemService riSvc = new RandomItemService();

			try {
				String location = (String) session.getAttribute("location");
				if (location != null) {
					session.removeAttribute("location"); // *�u�@2: �ݬݦ��L�ӷ����� (-->�p���ӷ�����:�h���ɦܨӷ�����)
					res.sendRedirect(location);
					return;
				}
			} catch (Exception ignored) {

			}
			res.sendRedirect(req.getContextPath() + "/FrontEnd/index.jsp"); // *�u�@3: (-->�p�L�ӷ�����:�h���ɦܭ���)
		}

		/***************************
		 * FB�����o�Ъֳ̧t���U
		 ***************************************/
		// 8/14 FB�|���DInstaBuy�|���ֳt���U (For CY)
		if ("fb_register".equals(action)) {
			PrintWriter out = res.getWriter();
			// ���oFB �W�r�A���쪺����s�XFB API�w�]��UTF-8�A�ন�s�边���u�@���ҽs�X
			String mem_name1 = req.getParameter("fb_buyer");
			String fb_id = req.getParameter("fb_id");
			byte[] ms950Bytes = mem_name1.getBytes("MS950");
			String mem_name = new String(ms950Bytes, "MS950");

			MemDAO dao = new MemDAO();
			MemVO memCheckVO = dao.checkFBName(mem_name);

			if (memCheckVO == null) { // �p�G�o��FB�R�a�٨S���UInstaBuy�A�j����U

				// FB�R�a��ID(��FB_ID ���N)
				String mem_id = fb_id;

				// ���w�]�K�X
				String mem_psw = "123456";
				System.out.println("FB PSW�G" + mem_psw);

				// FB�R�a��EMAIL
				String mem_email = "FB buyer";

				// FB�R�a��FBID
				String mem_fbid = fb_id;

				// ���w�]�j�Y�K
				@SuppressWarnings("deprecation")
				File profilepic = new File(req.getRealPath("/FrontEnd/images/NewMember/member_pic.png"));
				BufferedImage profilepicImage = ImageIO.read(profilepic);
				ByteArrayOutputStream profilepicBaos = new ByteArrayOutputStream();
				ImageIO.write(profilepicImage, "png", profilepicBaos);
				profilepicBaos.flush();
				byte[] mem_profilepic = profilepicBaos.toByteArray();
				System.out.println(mem_profilepic);
				profilepicBaos.close();

				// ���w�]����ʭ�
				@SuppressWarnings("deprecation")
				File martcover = new File(req.getRealPath("/FrontEnd/images/NewMember/mart_pic.png"));
				BufferedImage martcoverImage = ImageIO.read(martcover);
				ByteArrayOutputStream martcoverBaos = new ByteArrayOutputStream();
				ImageIO.write(martcoverImage, "png", martcoverBaos);
				martcoverBaos.flush();
				byte[] mem_martcover = martcoverBaos.toByteArray();

				MemService memSvc = new MemService();
				MemVO memFBVO = memSvc.fbSignup(mem_id, mem_name, mem_psw, mem_email, mem_fbid, mem_profilepic,
						mem_martcover);
			}

			/***************************
			 * �H�UCY�s�W�q�檺��k
			 ***************************************/
			// ���o��ӷs�W���ӫ~
			FbShoppingCartVO aItem = getItem(req);

			if (fb_buylist == null) {
				fb_buylist = new Vector<FbShoppingCartVO>();
				fb_buylist.add(aItem);
				out.println("�ʪ����s�W���\");
			}

			else {
				if (fb_buylist.contains(aItem)) {
					FbShoppingCartVO innerItem = fb_buylist.get(fb_buylist.indexOf(aItem));
					innerItem.setQuantity(innerItem.getQuantity() + aItem.getQuantity());
				} else {
					fb_buylist.add(aItem);
				}
			}

			for (FbShoppingCartVO i : fb_buylist)
				
				System.out.println(i.getFb_item_no() + " " + i.getFb_item_price() + " " + i.getQuantity() + " "
						+ i.getFb_buyer() + " " + i.getFb_comment() + " " + i.getFb_buyer_no()

				);
				System.out.println("----------------------------");
		}
		session.setAttribute("fb_shoppingCart", fb_buylist);

	}

	// 8/11 Hugh�s�W�G�N�����W���Ϥ�SRC�নbyte[]
	public static byte[] getImageFromNetByUrl(String strUrl) {
		try {
			URL url = new URL(strUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5 * 1000);
			InputStream inStream = conn.getInputStream();
			byte[] btImg = readInputStream(inStream);
			return btImg;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 8/11 Hugh�s�W�Gbyte[]�� ByteArrayOutputStream
	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, len);
		}
		inStream.close();
		return outStream.toByteArray();
	}

	// 8/14 Hugh�s�W�GFB�n�J�ΦW�r�n�J
	private MemVO allowFbUser(String mem_name, String mem_psw) {

		MemService memSvc = new MemService();
		MemVO memVO = memSvc.fbLogin(mem_name, mem_psw);
		if (memVO != null) {
			return memVO;
		} else {
			return null;
		}
	}

	// 8/15�ʪ����M��
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