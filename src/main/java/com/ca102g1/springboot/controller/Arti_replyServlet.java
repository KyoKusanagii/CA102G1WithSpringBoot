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
			errorMsgs.put("rep_content","回覆內容請勿空白");
		}
		if(!errorMsgs.isEmpty()){
			return "article";
		}
		HttpServletRequest  req = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
		try{
			/***************************2.開始新增資料***************************************/
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

			/***************************2.開始刪除資料***************************************/
			arti_replyDAO_interface.delete(arti_no, rep_no); //留言刪除
			artiReplyReportDAO_interface.delete(rep_no);	//刪除留言時順便刪除討論區檢舉的檢舉留言
			System.out.println("刪除成功");
			/***************************3.刪除完成,準備轉交(Send the Success view)***********/
			String url = req.getContextPath() + "/FrontEnd/forum/article.jsp?arti_no=" + arti_no;
			res.sendRedirect(url);
//				RequestDispatcher successView = req.getRequestDispatcher(url);// 刪除成功後,轉交回送出刪除的來源網頁
//				successView.forward(req, res);

			/***************************其他可能的錯誤處理**********************************/
		} catch (Exception e) {
			errorMsgs.add("刪除資料失敗:"+e.getMessage());
			RequestDispatcher failureView = req
					.getRequestDispatcher("/FrontEnd/forum/forum.jsp");
			failureView.forward(req, res);
		}
	}

}
