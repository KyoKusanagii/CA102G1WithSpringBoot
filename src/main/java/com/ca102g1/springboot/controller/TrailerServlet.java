package com.ca102g1.springboot.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.item.model.ItemService;
import com.item.model.ItemVO;
import com.trailer.model.TrailerService;
import com.trailer.model.TrailerVO;
import com.trailerNotify.model.TrailerNotifyDAO;

@WebServlet("/FrontEnd/Trailer.do")
public class TrailerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TrailerServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String action = req.getParameter("action");
		
		
		if("getOneUpdate".equals(action)){
			RequestDispatcher successView = req.getRequestDispatcher("/FrontEnd/live/trailer.jsp");
			successView.forward(req, res);
			
		}

		if ("insert".equals(action)) { // �Ӧ�po_arti.jsp���ШD

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);

			String requestURL = req.getParameter("requestURL"); // �e�X�ק諸�ӷ��������|: �i�ର�i/emp/listAllEmp.jsp�j ��
																// �i/dept/listEmps_ByDeptno.jsp�j �� �i
																// /dept/listAllDept.jsp�j
			req.setAttribute("requestURL", requestURL); // �e�X�ק諸�ӷ��������|, �s�Jreq

			String whichPage = req.getParameter("whichPage"); // �e�X�ק諸�ӷ��������ĴX��(�u�Ω�:istAllEmp.jsp)
			req.setAttribute("whichPage", whichPage);

			try {
				/*********************** 1.�����ШD�Ѽ� - ��J�榡�����~�B�z *************************/

				String trailer_topic = req.getParameter("trailer_topic");
				if (trailer_topic == null || trailer_topic.trim().length() == 0) {
					errorMsgs.add("�����w�i���e: �ФŪť�");
				}

				String trailer_seller_no = req.getParameter("trailer_seller_no");

				String trailer_start_date = req.getParameter("trailer_start_date");
				String trailer_start_time = req.getParameter("trailer_start_time");
				String hr_s = trailer_start_time.substring(0, 2);
				String min_s = trailer_start_time.substring(5, 7);
				String sec_s = trailer_start_time.substring(10, 12);
				trailer_start_time = hr_s + ":" + min_s + ":" + sec_s;

				Timestamp trailer_time = Timestamp.valueOf(trailer_start_date + " " + trailer_start_time);

				TrailerVO trailerVO = new TrailerVO();
				trailerVO.setTrailer_seller_no(trailer_seller_no);
				trailerVO.setTrailer_time(trailer_time);
				trailerVO.setTrailer_topic(trailer_topic);

				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("trailerVO", trailerVO);
					RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
					failureView.forward(req, res);
					return;
				}

				/*************************** 2.�}�l�s�W��� ***************************************/
				TrailerService trailerSvc = new TrailerService();
				trailerSvc.insert(trailer_seller_no, trailer_time, trailer_topic);
				/*************************** 3.�s�W����,�ǳ����(Send the Success view) ***********/
				String url = requestURL + "?whichPage=" + whichPage;
				req.setAttribute("trailerVO", trailerVO);
				RequestDispatcher successView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
				successView.forward(req, res);

				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add(e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
				failureView.forward(req, res);
			}
		}


		if ("update".equals(action) && req.getParameter("trailer_status") == null) {
			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
			try {
				TrailerService trailerSvc = new TrailerService();
				TrailerNotifyDAO trailerNotifyDAO = new TrailerNotifyDAO();
				String trailer_no = req.getParameter("trailer_no");
				trailerNotifyDAO.delete(trailer_no);
				trailerSvc.delete(trailer_no);
	System.out.println("delete ok");
				RequestDispatcher successView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
				successView.forward(req, res);

				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add(e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
				failureView.forward(req, res);
			}

		}

		else if ("update".equals(action)) {
			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);

			String requestURL = req.getParameter("requestURL"); // �e�X�ק諸�ӷ��������|: �i�ର�i/emp/listAllEmp.jsp�j ��
																// �i/dept/listEmps_ByDeptno.jsp�j �� �i
																// /dept/listAllDept.jsp�j
			req.setAttribute("requestURL", requestURL); // �e�X�ק諸�ӷ��������|, �s�Jreq

			String whichPage = req.getParameter("whichPage"); // �e�X�ק諸�ӷ��������ĴX��(�u�Ω�:istAllEmp.jsp)
			req.setAttribute("whichPage", whichPage);

			try {
				/*********************** 1.�����ШD�Ѽ� - ��J�榡�����~�B�z *************************/

				String trailer_no = req.getParameter("trailer_no");
				String trailer_seller_no = req.getParameter("trailer_seller_no");
				String trailer_topic = req.getParameter("trailer_topic");
				if (trailer_topic == null || trailer_topic.trim().length() == 0) {
					errorMsgs.add("�����w�i���e: �ФŪť�");
				}

				String trailer_start_date = req.getParameter("trailer_start_date");
				String trailer_start_time = req.getParameter("trailer_start_time");
				String hr_s = trailer_start_time.substring(0, 2);
				String min_s = trailer_start_time.substring(5, 7);
				String sec_s = trailer_start_time.substring(10, 12);
				trailer_start_time = hr_s + ":" + min_s + ":" + sec_s;

				Timestamp trailer_time = Timestamp.valueOf(trailer_start_date + " " + trailer_start_time);

				TrailerVO trailerVO = new TrailerVO();
				trailerVO.setTrailer_no(trailer_no);
				trailerVO.setTrailer_seller_no(trailer_seller_no);
				trailerVO.setTrailer_time(trailer_time);
				trailerVO.setTrailer_topic(trailer_topic);

				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("trailerVO", trailerVO);
					RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
					failureView.forward(req, res);
					return;
				}

				/*************************** 2.�}�l�s�W��� ***************************************/
				TrailerService trailerSvc = new TrailerService();
				trailerSvc.update(trailer_no, trailer_seller_no, trailer_time, trailer_topic);
				/*************************** 3.�s�W����,�ǳ����(Send the Success view) ***********/
				String url = requestURL + "?whichPage=" + whichPage;
				req.setAttribute("trailerVO", trailerVO);
				RequestDispatcher successView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
				successView.forward(req, res);

				/*************************** ��L�i�઺���~�B�z **********************************/
			} catch (Exception e) {
				errorMsgs.add(e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/live/trailer_show.jsp");
				failureView.forward(req, res);
			}
		}

	}
}