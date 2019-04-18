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

import com.ca102g1.springboot.model.ArtiReply;
import com.ca102g1.springboot.service.ArtiReplyReportDAO_interface;
import com.ca102g1.springboot.service.Arti_replyDAO_interface;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
@RequestMapping("/artiReply")
public class Arti_replyServlet {

	@Autowired
    private Arti_replyDAO_interface arti_replyDAO_interface;
	@Autowired
	private ArtiReplyReportDAO_interface artiReplyReportDAO_interface;

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
		HttpServletRequest  req = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
		try{
			/***************************2.�}�l�s�W���***************************************/
			ArtiReply artiReply = new ArtiReply();
			artiReply.setMemNo(mem_no);
			artiReply.setArtiNo(arti_no);
			artiReply.setRepContent(rep_content);
			arti_replyDAO_interface.insert(artiReply);
		 } catch (Exception e) {
			errorMsgs.put("Exception",e.getMessage());
			RequestDispatcher failureView = req
					.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
			failureView.forward(req, res);
		}
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String insert(@RequestParam("arti_no") String arti_no,
						 @RequestParam("rep_no") String rep_no,
						 Model model){
		HttpServletRequest  req = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
		List<String> errorMsgs = new LinkedList<String>();
		req.setAttribute("errorMsgs", errorMsgs);
		try {

			/***************************2.�}�l�R�����***************************************/
			arti_replyDAO_interface.delete(arti_no, rep_no); //�d���R��
			artiReplyReportDAO_interface.delete(rep_no);	//�R���d���ɶ��K�R���Q�װ����|�����|�d��
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
