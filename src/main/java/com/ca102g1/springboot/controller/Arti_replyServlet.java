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
import com.artireply_report.model.ArtiReplyReportService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@WebServlet("/FrontEnd/forum/arti_reply.do")
@Controller
@RequestMapping("ArtiReply")
public class Arti_replyServlet {

	@Autowired
    private Arti_replyService arti_replySvc;
	@Autowired
	private ArtiReplyReportService artireply_reportSvc;

	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insert(@RequestParam("mem_no") String mem_no,
	 @RequestParam("arti_no") String arti_no,@RequestParam("rep_content") String rep_content,
	 Model model){
		Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		if(StringUtils.isBlank(rep_content)){
			errorMsgs.put("rep_content","�^�Ф��e�ФŪť�");
		}
		if(!errorMsgs.isEmpty()){
			return "article";
		}

	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String insert(@RequestParam("arti_no") String arti_no,
						 @RequestParam("rep_no") String rep_no,
						 Model model){
		Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
		if(StringUtils.isBlank(rep_content)){
			errorMsgs.put("rep_content","�^�Ф��e�ФŪť�");
		}
		if(!errorMsgs.isEmpty()){
			return "article";
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		System.out.println(action);
		
		if ("insert".equals(action)) { // �Ӧ�article.jsp���ШD  
			   

			    /***************************2.�}�l�s�W���***************************************/
			    Arti_replyService arti_replySvc = new Arti_replyService();
			    arti_replySvc.addRep(mem_no,rep_content, rep_time, arti_no);
			    System.out.println("�s�W���\");
			    
			    /***************************3.�s�W����,�ǳ����(Send the Success view)***********/
			    String url = req.getContextPath() + "/FrontEnd/forum/article.jsp?arti_no=" + arti_no;
			    res.sendRedirect(url);
			    
			    /***************************��L�i�઺���~�B�z**********************************/
			   } catch (Exception e) {
			    errorMsgs.put("Exception",e.getMessage());
			    RequestDispatcher failureView = req
			      .getRequestDispatcher("/FrontEnd/forum/forum.jsp");
			    failureView.forward(req, res);
			   }
			}
		
		
		if ("delete".equals(action)) { // �Ӧ�article.jsp

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
	
			try {
				/***************************1.�����ШD�Ѽ�***************************************/
				String arti_no = req.getParameter("arti_no");
				Integer rep_no =Integer.parseInt(req.getParameter("rep_no"));
				
				/***************************2.�}�l�R�����***************************************/
				Arti_replyService arti_replySvc = new Arti_replyService();	
				ArtiReplyReportService artireply_reportSvc = new ArtiReplyReportService();
				arti_replySvc.deleteRep(arti_no, rep_no); //�d���R��
				artireply_reportSvc.deleteArtiReplyReport(rep_no);	//�R���d���ɶ��K�R���Q�װ����|�����|�d��
				System.out.println("�R�����\");
				/***************************3.�R������,�ǳ����(Send the Success view)***********/								
				String url = req.getContextPath() + "/FrontEnd/forum/article.jsp?arti_no=" + arti_no;
				res.sendRedirect(url);
//				RequestDispatcher successView = req.getRequestDispatcher(url);// �R�����\��,���^�e�X�R�����ӷ�����
//				successView.forward(req, res);
				
				/***************************��L�i�઺���~�B�z**********************************/
			} catch (Exception e) {
				errorMsgs.add("�R����ƥ���:"+e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
				failureView.forward(req, res);
			}
		}
		
		
	}

}
