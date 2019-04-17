package com.ca102g1.springboot.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

import com.carousel.model.CarouselJDBCDAO;
import com.carousel.model.CarouselService;
import com.carousel.model.CarouselVO;


@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 10 * 1024 * 1024, maxRequestSize = 50 * 5 * 1024 * 1024)
// ��ƾڶq�j��fileSizeThreshold�ȮɡA���e�N�Q�g�J�Ϻ�
// �W�ǹL�{���L�׬O��Ӥ��W�LmaxFileSize�ȡA�Ϊ̤W�Ǫ��`�q�j��maxRequestSize �ȳ��|�ߥXIllegalStateException ���`


@WebServlet("/BackEnd/carousel/carousel.do")
public class CarouselServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//InputStream��Byte
	public static byte[] getPictureByteArray(Part part) throws IOException {
		InputStream in = part.getInputStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int i;
		while ((i = in.read(buffer)) != -1) {
			baos.write(buffer, 0, i);
		}
		baos.flush();
		baos.close();
		in.close();

		return baos.toByteArray();
	}	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		
		req.setCharacterEncoding("UTF-8"); // �B�z�����ɦW
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		String action = req.getParameter("action");
		
		if ("add".equals(action)) {
			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
//==================================================================================================
			byte[] Carousel_pic = null;			
			if (req.getPart("Carousel_pic").getSize() > 0) {
				Part pic = req.getPart("Carousel_pic");
				Carousel_pic = getPictureByteArray(pic);
			
			}else {
				if(req.getParameter("Carousel_pic_restore").length() == 0 ) {
					errorMsgs.add("�ݭn���Ϥ���");
				}
				else {
					Carousel_pic = Base64.getDecoder().decode(req.getParameter("Carousel_pic_restore"));
				}
			}
			
			String Carousel_title = "";			
			if (req.getParameter("Carousel_title").isEmpty()) {
				errorMsgs.add("�S�g���D��");
			}else {
				Carousel_title = req.getParameter("Carousel_title");
			}
			
			String Carousel_subTitle = "";
			if(req.getParameter("Carousel_subTitle").isEmpty()) {
				errorMsgs.add("���ڤ@�ӰƼ��D!!");
			}else {
				Carousel_subTitle = req.getParameter("Carousel_subTitle");
			}
						
			CarouselVO thisVO = new CarouselVO();
			thisVO.setCarousel_pic(Carousel_pic);
			thisVO.setCarousel_title(Carousel_title);
			thisVO.setCarousel_subTitle(Carousel_subTitle);
			
			if (errorMsgs.isEmpty()) {
				CarouselService carouselSvc = new CarouselService();
				thisVO = carouselSvc.add(Carousel_pic, Carousel_title, Carousel_subTitle);
				req.setAttribute("carouselVO", thisVO); 
				String url = "/BackEnd/carousel/getOneCarousel.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); 
				successView.forward(req, res);			
			}else {
				req.setAttribute("carouselVO", thisVO); 
				RequestDispatcher failureView = req
						.getRequestDispatcher("/BackEnd/carousel/addCarousel.jsp");
				failureView.forward(req, res);
				return; //�{�����_			
			}
			
			
		}
		
		if ("update".equals(action)) {
			Integer Carousel_no = Integer.parseInt(req.getParameter("Carousel_no"));

			CarouselService carouselSVC = new CarouselService();
			CarouselVO thisVO = carouselSVC.getOne(Carousel_no);
			req.setAttribute("carouselVO", thisVO);
			String url = "/BackEnd/carousel/updateCarousel.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
			
		}
		
		if ("updateGO".equals(action)) {
			
			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
//==================================================================================================			
			Integer Carousel_no = Integer.parseInt(req.getParameter("Carousel_no"));
			
			byte[] Carousel_pic = null;			
			if (req.getPart("Carousel_pic").getSize() > 0) {
				Part pic = req.getPart("Carousel_pic");
				Carousel_pic = getPictureByteArray(pic);
			}else {
				CarouselService carouselSvc = new CarouselService();
				CarouselVO oldVO = carouselSvc.getOne(Carousel_no);
				Carousel_pic = oldVO.getCarousel_pic();
			}
			
			String Carousel_title = "";
			if(req.getParameter("Carousel_title").isEmpty()) {
				errorMsgs.add("���D�n�g�r!");
			}else {
				Carousel_title = req.getParameter("Carousel_title");
			}
					
			String Carousel_subTitle = "";
			if(req.getParameter("Carousel_subTitle").isEmpty()) {
				errorMsgs.add("�ѰO�g�Ƽ��D�o");
			}else {
				Carousel_subTitle = req.getParameter("Carousel_subTitle");
			}
			
			CarouselVO thisVO = new CarouselVO();
			thisVO.setCarousel_no(Carousel_no);
			thisVO.setCarousel_pic(Carousel_pic);
			thisVO.setCarousel_title(Carousel_title);
			thisVO.setCarousel_subTitle(Carousel_subTitle);
			
			if (errorMsgs.isEmpty()) {			
				CarouselService carouselSvc = new CarouselService();
				thisVO = carouselSvc.update(Carousel_no, Carousel_pic, Carousel_title, Carousel_subTitle);
				req.setAttribute("carouselVO", thisVO); 
				String url = "/BackEnd/carousel/getOneCarousel.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); 
				successView.forward(req, res);
			}else {
				req.setAttribute("carouselVO", thisVO); 
				RequestDispatcher failureView = req
						.getRequestDispatcher("/BackEnd/carousel/updateCarousel.jsp");
				failureView.forward(req, res);
				return; //�{�����_
			}
			
			
			
		}
		
		if ("delete".equals(action)) {
			Integer Carousel_no = Integer.parseInt(req.getParameter("Carousel_no"));
			
			CarouselService carouselSVC = new CarouselService();
			carouselSVC.delete(Carousel_no);		
			
			String url = "/BackEnd/carousel/getAllCarousel.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);// �R�����\��,���^�e�X�R�����ӷ�����
			successView.forward(req, res);
			
			}
		
		if ("getOne".equals(action)) {
			Integer Carousel_no = Integer.parseInt(req.getParameter("Carousel_no"));
			CarouselService carouselSVC = new CarouselService();
			CarouselVO thisVO = carouselSVC.getOne(Carousel_no);
			
			req.setAttribute("carouselVO", thisVO); 
			String url = "/BackEnd/carousel/getOneCarousel.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); 
			successView.forward(req, res);
			
			}
		
		if ("search".equals(action)) {
			String Carousel_title = req.getParameter("Carousel_title");
			CarouselService carouselSVC = new CarouselService();
			List<CarouselVO> thisVO = carouselSVC.getSomeByKeyword(Carousel_title);
			
			req.setAttribute("carouselVO", thisVO); 
			String url = "/BackEnd/carousel/searchCarousels.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); 
			successView.forward(req, res);
			
			}
		
	}
	
}