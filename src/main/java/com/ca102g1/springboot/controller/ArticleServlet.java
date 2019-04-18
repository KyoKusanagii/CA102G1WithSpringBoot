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
			List<Article> list = articleDAO_interface.findByTopic(arti_topic);

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
			model.addAllAttributes(list);
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

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@RequestParam("arti_topic") String arti_topic,
		 @RequestParam("arti_content") String arti_content,@RequestParam("mem_no") String mem_no, Model model) {

		   Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		   req.setAttribute("errorMsgs", errorMsgs);
		   try {
		    /***********************1.�����ШD�Ѽ� - ��J�榡�����~�B�z*************************/
		    
		    if (StringUtils.isBlank(arti_topic)) {
		     errorMsgs.put("arti_topic","���D�ФŪť�");
		    } 
		    
		    if (StringUtils.isBlank(arti_content) {
		     errorMsgs.put("arti_content","�峹���e�ФŪť�");
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
		    
		    /***************************2.�}�l�s�W���***************************************/
		    Article article = new Article();
		    article.setArtiTopic(arti_topic);
		    article.setMemNo(mem_no);
		    article.setArtiContent(arti_content);
		    article.setPoTime(po_time);
		    articleDAO_interface.insert(arti_topic,mem_no, arti_content, po_time);
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

	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String update(@RequestParam("arti_topic") String arti_topic,
	 @RequestParam("arti_content") String arti_content,@RequestParam("arti_no") String arti_no, Model model) {

			Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
			req.setAttribute("errorMsgs", errorMsgs);
		
			try {
				/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
				if (StringUtils.isBlank(arti_topic)) {
					errorMsgs.put("arti_topic","���D�ФŪť�");
			    } 
				if (StringUtils.isBlank(arti_content)) {
					errorMsgs.put("arti_content","�峹���e�ФŪť�");
			    } 
				Timestamp po_time = new Timestamp(System.currentTimeMillis());

				Article articleVO = new Article();
				articleVO.setArtiTopic(arti_topic);
				articleVO.setArtiContent(arti_content);
				articleVO.setPoTime(po_time);
				articleVO.setArtiNo(arti_no);
				

				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("articleVO", articleVO); // �t����J�榡���~��articleVO����,�]�s�Jreq
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/forum/update_arti.jsp");
					failureView.forward(req, res);
					return; //�{�����_
				}

				/***************************2.�}�l�ק���*****************************************/
				Article article = new Article();
				article.setArtiTopic(arti_topic);
				article.setArtiContent(arti_content);
				article.setPoTime(po_time);
				article.setArtiNo(arti_no);
				articleDAO_interface.update(article);
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

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String update(@RequestParam("arti_no") String arti_no, Model model) {

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);

			try {

				/***************************2.�}�l�R�����***************************************/
				artiReplyReportDAO_interface.deleteByArtiNo(arti_no); //�R�����|�峹�U�Ҧ����|���d��
				article_reportDAO_interface.deleteByArtiNo(arti_no);	//���N�峹���Ҧ��d���R��
				arti_replyDAO_interface.deleteAllRep(arti_no); 		//�R�����|�峹���峹
				articleDAO_interface.delete(arti_no)	//�A�R���峹
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
