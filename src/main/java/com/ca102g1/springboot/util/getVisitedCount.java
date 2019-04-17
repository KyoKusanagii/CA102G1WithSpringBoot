package com.ca102g1.springboot.util;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Set;

@WebServlet("/getVisitedCount")
public class getVisitedCount implements Filter {
	
	ServletContext context;
	int visitCount;
	//Set<String> visitRemoteIPSet;
	
	public void init(FilterConfig config){
		visitCount = 0;	//���X����
		//visitRemoteIPSet = new HashSet<>(); //�s��Ҧ��ӫ��X��IP
		context=config.getServletContext();
	}

	public void destroy(){
		context=null;
	}

    @SuppressWarnings("unchecked")
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
        throws ServletException, IOException {
    	
    	   String visitIP = req.getRemoteAddr();
		   res.setContentType("text/html; charset=UTF-8");
		   
		   if(!((Set<String>)context.getAttribute("visitRemoteIPSet")).contains(visitIP)) {
			   
			   System.out.println("�ӫ��X��IP�O:"+visitIP);
			   ((Set<String>)context.getAttribute("visitRemoteIPSet")).add(visitIP);
			   
			   System.out.println("����IP���X�L�F:"+(Set<String>)context.getAttribute("visitRemoteIPSet"));
			   context.setAttribute("visitCount",((Set<String>)context.getAttribute("visitRemoteIPSet")).size());
			   System.out.println("�`���X���Ƭ�:"+((Set<String>)context.getAttribute("visitRemoteIPSet")).size());
		   }
		   chain.doFilter(req,res);
    }

}
