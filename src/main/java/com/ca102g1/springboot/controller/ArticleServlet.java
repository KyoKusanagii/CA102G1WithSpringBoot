package com.ca102g1.springboot.controller;

import java.io.IOException;
import java.sql.Timestamp;
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

import com.arti_reply.model.Arti_replyService;
import com.article.model.ArticleService;
import com.article.model.ArticleVO;
import com.article_report.model.ArticleReportDAO;
import com.article_report.model.ArticleReportService;
import com.artireply_report.model.ArtiReplyReportService;


/**
 * Servlet implementation class ArticleServlet
 */
@WebServlet("/FrontEnd/forum/article.do")
public class ArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doPost(req, res);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		
		
		if ("findByTopic".equals(action)) { // �Ӧ�forum.jsp���ШD

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
				String arti_topic = req.getParameter("arti_topic");
				if (arti_topic == null || (arti_topic.trim()).length() == 0) {
					errorMsgs.add("�п�J�n�j�M�D�D");
				}
				
				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
					failureView.forward(req, res);
					return;//�{�����_
				}
				
				/***************************2.�}�l�d�߸��*****************************************/
				ArticleService articleSvc = new ArticleService();
				List<ArticleVO> list = articleSvc.getArticle(arti_topic);
				
//				if (list.isEmpty()) {
//					errorMsgs.add("�d�L���");
//				}
//				// Send the use back to the form, if there were errors
//				if (!errorMsgs.isEmpty()) {
//					RequestDispatcher failureView = req
//							.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
//					failureView.forward(req, res);
//					return;//�{�����_
//				}
				
				/***************************3.�d�ߧ���,�ǳ����(Send the Success view)*************/
				req.getSession().setAttribute("list", list);
			
				String url = "/FrontEnd/forum/getArticle.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); // ���\��� getArticle.jsp
				successView.forward(req, res);

				/***************************��L�i�઺���~�B�z*************************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o���:" + e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		if ("insert".equals(action)) { // �Ӧ�po_arti.jsp���ШD  
			   
		   Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		   req.setAttribute("errorMsgs", errorMsgs);

		   try {
		    /***********************1.�����ШD�Ѽ� - ��J�榡�����~�B�z*************************/
		    
		    String arti_topic = req.getParameter("arti_topic");
		    if (arti_topic == null || arti_topic.trim().length() == 0) {
		     errorMsgs.put("arti_topic","���D�ФŪť�");
		    } 
		    
		    String arti_content = req.getParameter("arti_content");
		    if (arti_content == null || arti_content.trim().length() == 0) {
		     errorMsgs.put("arti_content","�峹���e�ФŪť�");
		    } 
		    String mem_no = req.getParameter("mem_no");
		    Timestamp po_time = new Timestamp(System.currentTimeMillis());
		    
		   
		
		    // Send the use back to the form, if there were errors
		    if (!errorMsgs.isEmpty()) {
		    req.setAttribute("arti_topic", arti_topic);
		    req.setAttribute("arti_content", arti_content);
		     RequestDispatcher failureView = req
		       .getRequestDispatcher("/FrontEnd/forum/po_arti.jsp");
		     failureView.forward(req, res);
		     return;
		    }
		    
		    /***************************2.�}�l�s�W���***************************************/
		    ArticleService articleSvc = new ArticleService();
		    articleSvc.addArticle(arti_topic,mem_no, arti_content, po_time);
		    System.out.println("�s�W���\");
		    /***************************3.�s�W����,�ǳ����(Send the Success view)***********/
		    String url = "/FrontEnd/forum/forum.jsp";
		    RequestDispatcher successView = req.getRequestDispatcher(url);
		    successView.forward(req, res);    
		    
		    /***************************��L�i�઺���~�B�z**********************************/
		   } catch (Exception e) {
		    errorMsgs.put("Exception",e.getMessage());
		    RequestDispatcher failureView = req
		      .getRequestDispatcher("/FrontEnd/forum/po_arti.jsp");
		    failureView.forward(req, res);
		   }
		}
		
		if ("update".equals(action)) { // �Ӧ�update_arti.jsp���ШD
			
			Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
			req.setAttribute("errorMsgs", errorMsgs);
		
			try {
				/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
				String arti_no = req.getParameter("arti_no").trim();
				String arti_topic = req.getParameter("arti_topic");
				if (arti_topic == null || arti_topic.trim().length() == 0) {
					errorMsgs.put("arti_topic","���D�ФŪť�");
			    } 
				String arti_content = req.getParameter("arti_content");	
				if (arti_content == null || arti_content.trim().length() == 0) {
					errorMsgs.put("arti_content","�峹���e�ФŪť�");
			    } 
				Timestamp po_time = new Timestamp(System.currentTimeMillis());
				
				

				ArticleVO articleVO = new ArticleVO();
				articleVO.setArti_topic(arti_topic);
				articleVO.setArti_content(arti_content);
				articleVO.setPo_time(po_time);
				articleVO.setArti_no(arti_no);
				

				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("articleVO", articleVO); // �t����J�榡���~��articleVO����,�]�s�Jreq
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/forum/update_arti.jsp");
					failureView.forward(req, res);
					return; //�{�����_
				}
				
				
				
				/***************************2.�}�l�ק���*****************************************/
				ArticleService articleSvc = new ArticleService();
				articleVO = articleSvc.updateArticle(arti_topic, arti_content, po_time, arti_no);
				
				/***************************3.�ק粒��,�ǳ����(Send the Success view)*************/
				req.setAttribute("articleVO", articleVO); // ��Ʈwupdate���\��,���T����articleVO����,�s�Jreq
				String url = "/FrontEnd/forum/article.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); // �ק令�\��,���forum.jsp
				successView.forward(req, res);

				/***************************��L�i�઺���~�B�z*************************************/
			} catch (Exception e) {
				errorMsgs.put("�ק��ƥ���:",e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/update_arti.jsp");
				failureView.forward(req, res);
			}
		}
		
		if ("delete".equals(action)) { // �Ӧ�article.jsp

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
	
			try {
				/***************************1.�����ШD�Ѽ�***************************************/
				String arti_no = req.getParameter("arti_no");
				
				/***************************2.�}�l�R�����***************************************/
				ArticleService articleSvc = new ArticleService();
				Arti_replyService arti_replySvc = new Arti_replyService();
				ArticleReportService arti_reportSvc = new ArticleReportService();
				ArtiReplyReportService arti_reply_reportSvc = new ArtiReplyReportService();
				arti_reply_reportSvc.deleteArtiReplyReportAll(arti_no);	//�R�����|�峹�U�Ҧ����|���d��
				arti_replySvc.deleteAllRep(arti_no); //���N�峹���Ҧ��d���R��
				arti_reportSvc.deleteArticleReport(arti_no);//�R�����|�峹���峹
				articleSvc.deleteArticle(arti_no); //�b�R���峹
				System.out.println("�R�����\");
				/***************************3.�R������,�ǳ����(Send the Success view)***********/								
				String url = req.getContextPath() + "/FrontEnd/forum/forum.jsp";
				res.sendRedirect(url);// �R�����\��,���^�e�X�R�����ӷ�����
				
				/***************************��L�i�઺���~�B�z**********************************/
			} catch (Exception e) {
				errorMsgs.add("�R����ƥ���:"+e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/po_arti.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		
		
	}

}
