package com.ca102g1.springboot.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
import com.member.model.MemService;
import com.member.model.MemVO;
import com.news.model.NewsService;
import com.news.model.NewsVO;

@WebServlet("/BackEnd/news.do")
public class NewsServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doPost(req, res);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		
		if ("insert".equals(action)) { // �Ӧ�po_arti.jsp���ШD  
			   
		   Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		   req.setAttribute("errorMsgs", errorMsgs);

		   try {
			    /***********************1.�����ШD�Ѽ� - ��J�榡�����~�B�z*************************/
			    
			    String news_title = req.getParameter("news_title");
			    if (news_title == null || news_title.trim().length() == 0) {
			     errorMsgs.put("news_topic","���D: �ФŪť�");
			    } 
			    
			    String news_content = req.getParameter("news_content");
			    if (news_content == null || news_content.trim().length() == 0) {
			     errorMsgs.put("news_content","�峹���e: �ФŪť�");
			    } 
			    
			    
			    String news_date_day = req.getParameter("news_date_day");
			    System.out.println(news_date_day);
			    String news_date_time = req.getParameter("news_date_time");
			    System.out.println(news_date_time);
			    String hr = news_date_time.substring(0,2);
			    String min = news_date_time.substring(5,7);
			    String sec = news_date_time.substring(10,12);
			    news_date_time = hr + ":" + min + ":" + sec;
			    System.out.println(news_date_time);
			    System.out.println(news_date_time.length());
			    Timestamp news_date = Timestamp.valueOf(news_date_day + " " + news_date_time);
			    System.out.println(news_date);


			    // Send the use back to the form, if there were errors
			    if (!errorMsgs.isEmpty()) {
			     RequestDispatcher failureView = req
			       .getRequestDispatcher("/BackEnd/news/NewsPost.jsp");
			     failureView.forward(req, res);
			     return;
			    }

			    /***************************2.�}�l�s�W���***************************************/
			    NewsService newsSvc = new NewsService();
			    newsSvc.insert(news_date, news_title, news_content);
			    System.out.println("�s�W���\");
			    /***************************3.�s�W����,�ǳ����(Send the Success view)***********/
			    String url = req.getContextPath() + "/BackEnd/news/News.jsp";
			    res.sendRedirect(url);
			    /***************************��L�i�઺���~�B�z**********************************/
			   } catch (Exception e) {
			    errorMsgs.put("Exception",e.getMessage());
			    RequestDispatcher failureView = req
			      .getRequestDispatcher("/BackEnd/news/NewsPost.jsp");
			    failureView.forward(req, res);
			   }
			}



		if ("update".equals(action)) { // �Ӧ�update_arti.jsp���ШD

			Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
				String news_title = req.getParameter("news_title");
			    if (news_title == null || news_title.trim().length() == 0) {
			     errorMsgs.put("news_topic","���D: �ФŪť�");
			    }
			    System.out.println("�ק���DOK");

			    String news_content = req.getParameter("news_content");
			    if (news_content == null || news_content.trim().length() == 0) {
			     errorMsgs.put("news_content","�峹���e: �ФŪť�");
			    }
			    System.out.println("�ק鷺�eOK");

			    String news_date_day = req.getParameter("news_date_day");
			    String news_date_time = req.getParameter("news_date_time");
			    String hr = news_date_time.substring(0,2);
			    String min = news_date_time.substring(5,7);
			    String sec = news_date_time.substring(10,12);
			    news_date_time = hr + ":" + min + ":" + sec;
			    Timestamp news_date = Timestamp.valueOf(news_date_day + " " + news_date_time);
			    System.out.println("�ק�ɶ�OK");

			    
			    Integer news_no = new Integer(req.getParameter("news_no"));
			    System.out.println("�T�{NEWS�s��");
				
				

				NewsVO newsVO = new NewsVO();
				newsVO.setNews_date(news_date);
				newsVO.setNews_title(news_title);
				newsVO.setNews_content(news_content);
				newsVO.setNews_no(news_no);
				System.out.println("���s��VO");
				
				
				/***************************2.�}�l�ק���*****************************************/
				NewsService newsSvc = new NewsService();
				newsVO = newsSvc.update(news_no, news_date, news_title, news_content);
				System.out.println("�ק�OK");
				
				/***************************3.�ק粒��,�ǳ����(Send the Success view)*************/
				req.setAttribute("newsVO", newsVO); // ��Ʈwupdate���\��,���T����articleVO����,�s�Jreq
				String url = "/BackEnd/news/News.jsp";
			    RequestDispatcher successView = req.getRequestDispatcher(url);
			    successView.forward(req, res);

				/***************************��L�i�઺���~�B�z*************************************/
			} catch (Exception e) {
				errorMsgs.put("�ק��ƥ���:",e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/BackEnd/news/News.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		
		if ("delete".equals(action)) { // �Ӧ�article.jsp

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
	
			try {
				/***************************1.�����ШD�Ѽ�***************************************/
				Integer news_no = new Integer(req.getParameter("news_no"));
				
				/***************************2.�}�l�R�����***************************************/
				NewsService newsSvc = new NewsService();
				newsSvc.delete(news_no); //�b�R���峹
				System.out.println("�R�����\");
				/***************************3.�R������,�ǳ����(Send the Success view)***********/								
				String url = "/BackEnd/news/News.jsp";
			    RequestDispatcher successView = req.getRequestDispatcher(url);
			    successView.forward(req, res);
				
				/***************************��L�i�઺���~�B�z**********************************/
			} catch (Exception e) {
				errorMsgs.add("�R����ƥ���:"+e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/BackEnd/news/News.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		if ("findByPK".equals(action)) { // �Ӧ�article.jsp

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
	
			try {
				/***************************1.�����ШD�Ѽ�***************************************/
				Integer news_no = new Integer(req.getParameter("news_no"));
				
				/***************************2.�}�l�R�����***************************************/
				NewsService newsSvc = new NewsService();
				NewsVO newsVO = newsSvc.getOneNews(news_no);
				/***************************3.�R������,�ǳ����(Send the Success view)***********/								
				String url = "/BackEnd/news/NewsUpdate.jsp";
			    RequestDispatcher successView = req.getRequestDispatcher(url);
			    successView.forward(req, res);
				
				/***************************��L�i�઺���~�B�z**********************************/
			} catch (Exception e) {
				errorMsgs.add("�ק異��:"+e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/BackEnd/news/News.jsp");
				failureView.forward(req, res);
			}
		}
		
	}

}
