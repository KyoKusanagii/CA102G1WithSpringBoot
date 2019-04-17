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
		visitCount = 0;	//拜訪次數
		//visitRemoteIPSet = new HashSet<>(); //存放所有來拜訪的IP
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
			   
			   System.out.println("來拜訪的IP是:"+visitIP);
			   ((Set<String>)context.getAttribute("visitRemoteIPSet")).add(visitIP);
			   
			   System.out.println("哪些IP拜訪過了:"+(Set<String>)context.getAttribute("visitRemoteIPSet"));
			   context.setAttribute("visitCount",((Set<String>)context.getAttribute("visitRemoteIPSet")).size());
			   System.out.println("總拜訪次數為:"+((Set<String>)context.getAttribute("visitRemoteIPSet")).size());
		   }
		   chain.doFilter(req,res);
    }

}
