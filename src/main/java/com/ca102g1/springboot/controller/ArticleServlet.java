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
import com.ca102g1.springboot.model.ArtiReply;
import com.ca102g1.springboot.model.Article;
import com.ca102g1.springboot.model.ArticleExample;
import com.ca102g1.springboot.service.ArtiReplyReportDAO_interface;
import com.ca102g1.springboot.service.Arti_replyDAO_interface;
import com.ca102g1.springboot.service.ArticleDAO_interface;
import com.ca102g1.springboot.service.Article_reportDAO_interface;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

//@WebServlet("/FrontEnd/forum/article.do")
@Controller
@RequestMapping("/article")
@SessionAttribute("list")
public class ArticleServlet{
	private static final long serialVersionUID = 1L;

	@Autowired
	ArticleDAO_interface articleDAO_interface;
	@Autowired
	Article_reportDAO_interface article_reportDAO_interface;
	@Autowired
	Arti_replyDAO_interface arti_replyDAO_interface;
	@Autowired
	ArtiReplyReportDAO_interface artiReplyReportDAO_interface;


	@RequestMapping(value = "/findByTopic", method = RequestMethod.POST)
	public String findByTopic(@RequestParam("arti_topic") String arti_topic, Model model) {
		List<String> errorMsgs = new LinkedList<String>();
		req.setAttribute("errorMsgs", errorMsgs);
		try {
			if (StringUtils.isBlank(arti_topic)) {
				errorMsgs.add("請輸入要搜尋主題");
			}

			// Send the use back to the form, if there were errors
			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
				failureView.forward(req, res);
				return;//程式中斷
			}

			/***************************2.開始查詢資料*****************************************/
			List<Article> list = articleDAO_interface.findByTopic(arti_topic);

//				if (list.isEmpty()) {
//					errorMsgs.add("查無資料");
//				}
//				// Send the use back to the form, if there were errors
//				if (!errorMsgs.isEmpty()) {
//					RequestDispatcher failureView = req
//							.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
//					failureView.forward(req, res);
//					return;//程式中斷
//				}

			/***************************3.查詢完成,準備轉交(Send the Success view)*************/
			model.addAllAttributes(list);
			String url = "/FrontEnd/forum/getArticle.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); // 成功轉交 getArticle.jsp
			successView.forward(req, res);

			/***************************其他可能的錯誤處理*************************************/
		} catch (Exception e) {
			errorMsgs.add("無法取得資料:" + e.getMessage());
			RequestDispatcher failureView = req
					.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
			failureView.forward(req, res);
		}
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@RequestParam("arti_topic") String arti_topic,
		 @RequestParam("arti_content") String arti_content,@RequestParam("mem_no") String mem_no, Model model) {

		   Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		   req.setAttribute("errorMsgs", errorMsgs);
		   try {
		    /***********************1.接收請求參數 - 輸入格式的錯誤處理*************************/
		    
		    if (StringUtils.isBlank(arti_topic)) {
		     errorMsgs.put("arti_topic","標題請勿空白");
		    } 
		    
		    if (StringUtils.isBlank(arti_content) {
		     errorMsgs.put("arti_content","文章內容請勿空白");
		    } 
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
		    
		    /***************************2.開始新增資料***************************************/
		    Article article = new Article();
		    article.setArtiTopic(arti_topic);
		    article.setMemNo(mem_no);
		    article.setArtiContent(arti_content);
		    article.setPoTime(po_time);
		    articleDAO_interface.insert(arti_topic,mem_no, arti_content, po_time);
		    System.out.println("新增成功");
		    /***************************3.新增完成,準備轉交(Send the Success view)***********/
		    String url = "/FrontEnd/forum/forum.jsp";
		    RequestDispatcher successView = req.getRequestDispatcher(url);
		    successView.forward(req, res);    
		    
		    /***************************其他可能的錯誤處理**********************************/
		   } catch (Exception e) {
		    errorMsgs.put("Exception",e.getMessage());
		    RequestDispatcher failureView = req
		      .getRequestDispatcher("/FrontEnd/forum/po_arti.jsp");
		    failureView.forward(req, res);
		   }
	}

	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String update(@RequestParam("arti_topic") String arti_topic,
	 @RequestParam("arti_content") String arti_content,@RequestParam("arti_no") String arti_no, Model model) {

			Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
			req.setAttribute("errorMsgs", errorMsgs);
		
			try {
				/***************************1.接收請求參數 - 輸入格式的錯誤處理**********************/
				if (StringUtils.isBlank(arti_topic)) {
					errorMsgs.put("arti_topic","標題請勿空白");
			    } 
				if (StringUtils.isBlank(arti_content)) {
					errorMsgs.put("arti_content","文章內容請勿空白");
			    } 
				Timestamp po_time = new Timestamp(System.currentTimeMillis());

				Article articleVO = new Article();
				articleVO.setArtiTopic(arti_topic);
				articleVO.setArtiContent(arti_content);
				articleVO.setPoTime(po_time);
				articleVO.setArtiNo(arti_no);
				

				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("articleVO", articleVO); // 含有輸入格式錯誤的articleVO物件,也存入req
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/forum/update_arti.jsp");
					failureView.forward(req, res);
					return; //程式中斷
				}

				/***************************2.開始修改資料*****************************************/
				Article article = new Article();
				article.setArtiTopic(arti_topic);
				article.setArtiContent(arti_content);
				article.setPoTime(po_time);
				article.setArtiNo(arti_no);
				articleDAO_interface.update(article);
				/***************************3.修改完成,準備轉交(Send the Success view)*************/
				req.setAttribute("articleVO", articleVO); // 資料庫update成功後,正確的的articleVO物件,存入req
				String url = "/FrontEnd/forum/article.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); // 修改成功後,轉交forum.jsp
				successView.forward(req, res);

				/***************************其他可能的錯誤處理*************************************/
			} catch (Exception e) {
				errorMsgs.put("修改資料失敗:",e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/update_arti.jsp");
				failureView.forward(req, res);
			}
	 }

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String update(@RequestParam("arti_no") String arti_no, Model model) {

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);

			try {

				/***************************2.開始刪除資料***************************************/
				artiReplyReportDAO_interface.deleteByArtiNo(arti_no); //刪除檢舉文章下所有檢舉的留言
				article_reportDAO_interface.deleteByArtiNo(arti_no);	//先將文章內所有留言刪除
				arti_replyDAO_interface.deleteAllRep(arti_no); 		//刪除檢舉文章的文章
				articleDAO_interface.delete(arti_no)	//再刪除文章
				System.out.println("刪除成功");
				/***************************3.刪除完成,準備轉交(Send the Success view)***********/
				String url = req.getContextPath() + "/FrontEnd/forum/forum.jsp";
				res.sendRedirect(url);// 刪除成功後,轉交回送出刪除的來源網頁

				/***************************其他可能的錯誤處理**********************************/
			} catch (Exception e) {
				errorMsgs.add("刪除資料失敗:"+e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/po_arti.jsp");
				failureView.forward(req, res);
			}
		}

	}

}
