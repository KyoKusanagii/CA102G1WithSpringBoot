package com.ca102g1.springboot.controller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fborder.model.FbOrderDAO;
import com.fborder.model.FbOrderService;
import com.fborder.model.FbOrderVO;
import com.member.model.MemDAO;
import com.member.model.MemService;
import com.member.model.MemVO;

@WebServlet("/FrontEnd/fborder/fbOrder.do")
public class FbOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		HttpSession session = req.getSession();
	

		if ("cancel_order".equals(action)) { // �Ӧ�listAllEmp.jsp���ШD
			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*************************** 1.�����ШD�Ѽ� ****************************************/
				String fb_order_no = new String(req.getParameter("fb_order_no"));
				String fb_seller = new String(req.getParameter("fb_seller"));
				/*************************** 2.�}�l�d�߸�� ****************************************/
				FbOrderService fbOrderSvc = new FbOrderService();
				FbOrderVO fbOrderVO = fbOrderSvc.getOneOrder(fb_order_no);
				fbOrderVO.setFb_order_status("����");

				FbOrderDAO dao = new FbOrderDAO();
				dao.update(fbOrderVO);

				/*************************** 3.�d�ߧ���,�ǳ����(Send the Success view) ************/
				req.setAttribute("fbOrderVO", fbOrderVO); // ��Ʈw���X��fbOrderVO����,�s�Jreq

				MemDAO memdao = new MemDAO();
				String buyer_ch_name = memdao.findByPK(fbOrderVO.getFb_buyer_no()).getMem_name();
				String to_buyer = memdao.findByPK(fbOrderVO.getFb_buyer_no()).getMem_email();
				String seller_ch_name = memdao.findByPK(fb_seller).getMem_name();
				String to_seller = memdao.findByPK(fb_seller).getMem_email();

				String subject = "InstaBuy���q��������n�q��";
				String content = "�z��facebook�������q��:"+ fbOrderVO.getFb_order_no() +"�w�Q����,�еn�JInstaBuy�d�ݽT�{�A����!!";
				String buyer_website = "<a href='https://ca102g1.tk/CA102G1/FrontEnd/member/mem_fbOrder.jsp'>"
						+ "���ڽT�{</a>";
				String seller_website = "<a href='https://ca102g1.tk/CA102G1/FrontEnd/fborder/fbOrder.jsp'>"
						+ "���ڽT�{</a>";
				String buyer_messageText = "Hello! " + buyer_ch_name + "<br>" + content + "<br>" + buyer_website;
				String seller_messageText = "Hello! " + seller_ch_name + "<br>" + content + "<br>" + seller_website;

				MailService mailService = new MailService();
				mailService.sendMail(to_buyer, subject, buyer_messageText);
				mailService.sendMail(to_seller, subject, seller_messageText);

				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o�n�ק諸���:" + e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/fborder/fbOrder.jsp");
				failureView.forward(req, res);
			}
		}

		

		if ("delete".equals(action)) { // �Ӧ�listAllEmp.jsp

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*************************** 1.�����ШD�Ѽ� ***************************************/
				String fb_order_no = new String(req.getParameter("fb_order_no"));

				/*************************** 2.�}�l�R����� ***************************************/
				FbOrderService fbOrderSvc = new FbOrderService();
				fbOrderSvc.deleteOrder(fb_order_no);

				/*************************** 3.�R������,�ǳ����(Send the Success view) ***********/
				String url = "/FrontEnd/fborder/listAllEmp.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url);// �R�����\��,���^�e�X�R�����ӷ�����
				successView.forward(req, res);

				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add("�R����ƥ���:" + e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/fborder/listAllEmp.jsp");
				failureView.forward(req, res);
			}
		}
		
		if ("buyer_cancel_order".equals(action)) {

			List<String> errorMsgs = new LinkedList<String>();
		
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*************************** 1.�����ШD�Ѽ� ****************************************/
				String fb_order_no = req.getParameter("fb_order_no");
				String fb_buyer_no = req.getParameter("fb_buyer_no");
				System.out.println(fb_order_no);
				System.out.println(fb_buyer_no);
				/*************************** 2.�}�l�d�߸�� ****************************************/
				FbOrderService fbOrderSvc = new FbOrderService();
				FbOrderVO fbOrderVO = fbOrderSvc.getOneOrder(fb_order_no);
				fbOrderVO.setFb_order_status("����");
				

				FbOrderDAO dao = new FbOrderDAO();
				dao.update(fbOrderVO);

				/*************************** 3.�d�ߧ���,�ǳ����(Send the Success view) ************/
				req.setAttribute("fbOrderVO", fbOrderVO); // ��Ʈw���X��fbOrderVO����,�s�Jreq
//				MemDAO memdao = new MemDAO();
//				MallOrderService mallorderSvc = new MallOrderService();
//				String buyer_ch_name = memdao.findByPK(mall_buyer_no).getMem_name();
//				String to_buyer = memdao.findByPK(mall_buyer_no).getMem_email();
//				String seller_ch_name = memdao.findByPK(mallorderSvc.getOrderSeller(mall_order_no)).getMem_name();
//				String to_seller = memdao.findByPK(mallorderSvc.getOrderSeller(mall_order_no)).getMem_email() ;
//				
//				String subject = "InstaBuy���q��������n�q��";
//				String content = "�z��InstaBuy�ӫ��ʪ��q��:" + mallOrderVO.getMall_order_no() + "�w�Q����,�еn�JInstaBuy�d�ݽT�{�A����!!";
//				String website = "<a href='https://www.ca102g1.tk/CA102G1/FrontEnd/mallorder/mallOrder.jsp'>"
//								+ "���ڽT�{</a>";
//				String buyer_messageText = "Hello! " + buyer_ch_name + "<br>" + content + "<br>" + website;
//				String seller_messageText = "Hello! " + seller_ch_name + "<br>" + content + "<br>" + website;
//
//				MailService mailService = new MailService();
//				mailService.sendMail(to_buyer, subject, buyer_messageText);
//				mailService.sendMail(to_seller, subject, seller_messageText);
				
		
				
				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o�n�ק諸���:" + e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/mallorder/mallOrder.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		if(action.equals("checkFbOrder")) {
			
		    Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		    req.setAttribute("errorMsgs", errorMsgs);

		   try {
			    /***********************1.�����ШD�Ѽ� - ��J�榡�����~�B�z*************************/
				MemVO memVO = (MemVO)session.getAttribute("memVO");
				String fb_buyer_no = memVO.getMem_no();
				String fb_order_no = req.getParameter("fb_order_no");
				String fb_order_trans = req.getParameter("fb_order_trans");

				if(fb_order_trans == null || fb_order_trans.trim().length() == 0) {
					errorMsgs.put("mall_order_trans","�п�ܥI�ڤ覡");
				}
				
				String fb_pay_status = "";
				if("�H�Υd".equals(fb_order_trans)) {
					fb_pay_status = "�w�I��";
				}else {
					fb_pay_status = "���I��";
				}
				 
				String fb_order_remark = req.getParameter("fb_order_remark");
				String fb_transport = req.getParameter("fb_transport");
				
				
				String county = req.getParameter("county");
//				System.out.println("county = " + county);
				String district = req.getParameter("district");
//				System.out.println("district = " + district);
				String zipcode = req.getParameter("zipcode");
//				System.out.println("zip = " + zipcode);
				if(county == null || district == null || zipcode == null) {
					errorMsgs.put("add","�ж�J����a�}");
				}
				
				String add = req.getParameter("add");
				if(add == null || add.trim().length() == 0 ) {
					errorMsgs.put("add","�п�J�a�}");
				}
				
				String receiveadd = zipcode +" "+ county + district + add;
				
				/******************************************************************/
				String receiver = req.getParameter("receiver");
				if(receiver == null || receiver.trim().length() == 0) {
					errorMsgs.put("receiver","�п�J����H");
				}
				
				String phone = req.getParameter("phone");
				String mem_PhoneReg = "^(0)(9)([0-9]{8})$";
				if(phone == null || phone.trim().length() == 0) {
					errorMsgs.put("phone","�п�J�q��");
				}else if(!(phone.trim()).matches(mem_PhoneReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.put("phone","����榡�����T");
	            }
				req.setAttribute("phone", phone);
				
				
				if("�H�Υd".equals(fb_order_trans)) {
					String cardowner = req.getParameter("cardowner");
					if(cardowner == null || cardowner.trim().length() == 0) {
						errorMsgs.put("cardowner","�п�J���d�H�m�W");
					}
					
					
					String cdno1 = req.getParameter("cdno1");
					String cdno2 = req.getParameter("cdno2");
					String cdno3 = req.getParameter("cdno3");
					String cdno4 = req.getParameter("cdno4");
					String check = "^([0-9]{4})$";
					if(cdno1.trim().length() == 0 || cdno2.trim().length() == 0 || cdno3.trim().length() == 0 || cdno4.trim().length() == 0){
						errorMsgs.put("cdno","�ж�g�H�Υd��");
					}else if(!(cdno1.trim().matches(check)) || !(cdno2.trim().matches(check)) || !(cdno3.trim().matches(check)) || !(cdno4.trim().matches(check))) {
						errorMsgs.put("cdno","�H�Υd�������T");
					}
					String expire_month = req.getParameter("expire_month");
					String expire_year = req.getParameter("expire_year");
					if(expire_month.trim().length() == 0  || expire_year.trim().length() == 0) {
						errorMsgs.put("expire","�ж��H�Υd�I���");
					}
					req.setAttribute("expire_month", expire_month);
					req.setAttribute("expire_year", expire_year);
					String expire_safe = req.getParameter("expire_safe");
					String check_safe = "^([0-9]{3})$";
					if(expire_safe == null || expire_safe.trim().length() != 3 || !(expire_safe.trim().matches(check_safe))) {
						errorMsgs.put("safe","�w���X�����T�X�Ʀr");
					}
				}
				/******************************************************************/
				
				if (!errorMsgs.isEmpty()) {
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/member/fbCheckOut.jsp");
					failureView.forward(req, res);
					return;//�{�����_
				}
				
			
				/***************************2.�}�l�ק���***************************************/
			
				FbOrderService fbOrderSvc = new FbOrderService();
				FbOrderVO fbOrderVO = fbOrderSvc.getOneOrder(fb_order_no);
				fbOrderVO.setFb_order_trans(fb_order_trans);
				fbOrderVO.setFb_pay_status(fb_pay_status);
				fbOrderVO.setFb_order_remark(fb_order_remark);
				fbOrderVO.setFb_order_trans(fb_order_trans);
				fbOrderVO.setFb_transport("�l�H");
				
				FbOrderDAO dao = new FbOrderDAO();
				dao.update(fbOrderVO);
					
				//��²�T���R�a
				
//				Send se = new Send();
//				String[] tel = {phone};
//				if("�Ȧ���b".equals(mall_order_trans)) {
//					String message = memVO.getMem_name() + "�z�n�A�w����z���q��A�Щ�24�p�ɤ��N�ڶ��ש�Instabuy���w�b��A����";			
//					se.sendMessage(tel , message);
//				}else {
//					String message = memVO.getMem_name() + "�z�n�A�w����z���q��A�P�±z���ϥ�!!" ;
//					se.sendMessage(tel , message);
//				}
				
				MemService memSvc = new MemService();
				memSvc.updateReceiveAdd(receiveadd, fb_buyer_no);
				session.setAttribute("memVO", memVO); // ��Ʈwupdate���\��,���T����memVO����,�s�Jreq
	//			System.out.println("�ק�a�}���\");
				session.removeAttribute("shoppingCart");
					
				Thread.sleep(1500);
			    /***************************3.�s�W����,�ǳ����(Send the Success view)***********/  
				//���F����ܭq��I�ڪ��A
				
				req.setAttribute("fb_order_no", fb_order_no);
				String url = "/FrontEnd/member/fbOrderInfo.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url);
				successView.forward(req, res);
		    
	
		    /***************************��L�i�઺���~�B�z**********************************/
		   }  catch (Exception e) {
		    errorMsgs.put("Exception",e.getMessage());
		    RequestDispatcher failureView = req
		      .getRequestDispatcher("/FrontEnd/index.jsp");
		    failureView.forward(req, res);
		   }
		
	
		}
		
		if("check".equals(action)) {
			String fb_order_no = req.getParameter("fb_order_no");
			System.out.println(fb_order_no);
			req.setAttribute("fb_order_no", fb_order_no);
			String url = "/FrontEnd/member/fbCheckOut.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}
		
		if ("confirmCheck".equals(action)) {

			List<String> errorMsgs = new LinkedList<String>();
		
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*************************** 1.�����ШD�Ѽ� ****************************************/
				

				String fb_order_no = req.getParameter("fb_order_no");
				String fb_buyer_no = req.getParameter("fb_buyer_no");
				
				/*************************** 2.�}�l�d�߸�� ****************************************/
				FbOrderService fbOrderSvc = new FbOrderService();
				FbOrderVO fbOrderVO = fbOrderSvc.getOneOrder(fb_order_no);
				fbOrderVO.setFb_pay_status("�w�I��");
				

				FbOrderDAO dao = new FbOrderDAO();
				dao.update(fbOrderVO);

				/*************************** 3.�d�ߧ���,�ǳ����(Send the Success view) ************/
				req.setAttribute("fbOrderVO", fbOrderVO); // ��Ʈw���X��mallOrderVO����,�s�Jreq
//				MemDAO memdao = new MemDAO();
//				MallOrderService mallorderSvc = new MallOrderService();
//				String buyer_ch_name = memdao.findByPK(mall_buyer_no).getMem_name();
//				String to_buyer = memdao.findByPK(mall_buyer_no).getMem_email();
//				String seller_ch_name = memdao.findByPK(mallorderSvc.getOrderSeller(mall_order_no)).getMem_name();
//				String to_seller = memdao.findByPK(mallorderSvc.getOrderSeller(mall_order_no)).getMem_email() ;
//				
//				String subject = "InstaBuy���q��������n�q��";
//				String content = "�z��InstaBuy�ӫ��ʪ��q��:" + mallOrderVO.getMall_order_no() + "�w�Q����,�еn�JInstaBuy�d�ݽT�{�A����!!";
//				String website = "<a href='https://www.ca102g1.tk/CA102G1/FrontEnd/mallorder/mallOrder.jsp'>"
//								+ "���ڽT�{</a>";
//				String buyer_messageText = "Hello! " + buyer_ch_name + "<br>" + content + "<br>" + website;
//				String seller_messageText = "Hello! " + seller_ch_name + "<br>" + content + "<br>" + website;
//
//				MailService mailService = new MailService();
//				mailService.sendMail(to_buyer, subject, buyer_messageText);
//				mailService.sendMail(to_seller, subject, seller_messageText);
				
		
				
				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o�n�ק諸���:" + e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/mmember/fbOrderInfo.jsp");
				failureView.forward(req, res);
			}
		}
		
		if ("confirmReceive".equals(action)) {

			List<String> errorMsgs = new LinkedList<String>();
		
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*************************** 1.�����ШD�Ѽ� ****************************************/
				String fb_order_no = req.getParameter("fb_order_no");
				String fb_buyer_no = req.getParameter("fb_buyer_no");
			
				/*************************** 2.�}�l�d�߸�� ****************************************/
				FbOrderService fbOrderSvc = new FbOrderService();
				FbOrderVO fbOrderVO = fbOrderSvc.getOneOrder(fb_order_no);
				fbOrderVO.setFb_order_status("�w����");
				

				FbOrderDAO dao = new FbOrderDAO();
				dao.update(fbOrderVO);

				/*************************** 3.�d�ߧ���,�ǳ����(Send the Success view) ************/
				req.setAttribute("fbOrderVO", fbOrderVO); // ��Ʈw���X��mallOrderVO����,�s�Jreq
//				MemDAO memdao = new MemDAO();
//				MallOrderService mallorderSvc = new MallOrderService();
//				String buyer_ch_name = memdao.findByPK(mall_buyer_no).getMem_name();
//				String to_buyer = memdao.findByPK(mall_buyer_no).getMem_email();
//				String seller_ch_name = memdao.findByPK(mallorderSvc.getOrderSeller(mall_order_no)).getMem_name();
//				String to_seller = memdao.findByPK(mallorderSvc.getOrderSeller(mall_order_no)).getMem_email() ;
//				
//				String subject = "InstaBuy���q��������n�q��";
//				String content = "�z��InstaBuy�ӫ��ʪ��q��:" + mallOrderVO.getMall_order_no() + "�w�Q����,�еn�JInstaBuy�d�ݽT�{�A����!!";
//				String website = "<a href='https://www.ca102g1.tk/CA102G1/FrontEnd/mallorder/mallOrder.jsp'>"
//								+ "���ڽT�{</a>";
//				String buyer_messageText = "Hello! " + buyer_ch_name + "<br>" + content + "<br>" + website;
//				String seller_messageText = "Hello! " + seller_ch_name + "<br>" + content + "<br>" + website;
//
//				MailService mailService = new MailService();
//				mailService.sendMail(to_buyer, subject, buyer_messageText);
//				mailService.sendMail(to_seller, subject, seller_messageText);
				
		
				
				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o�n�ק諸���:" + e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/mmember/fbOrderInfo.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		
		if("showOneFbOrder".equals(action)) {
			String fb_order_no = req.getParameter("fb_order_no");
			req.setAttribute("fb_order_no", fb_order_no);
			String url = "/FrontEnd/member/fbOrderInfo.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}
		
		if("showSellerFbOrder".equals(action)) {
			String fb_order_no = req.getParameter("fb_order_no");
			req.setAttribute("fb_order_no", fb_order_no);
			String url = "/FrontEnd/fborder/sellerFbOrderInfo.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}

	}

}
