package com.ca102g1.springboot.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

import com.ca102g1.springboot.model.Carousel;
import com.ca102g1.springboot.service.CarouselDAO_interface;
import com.carousel.model.CarouselJDBCDAO;
import com.carousel.model.CarouselService;
import com.carousel.model.CarouselVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 10 * 1024 * 1024, maxRequestSize = 50 * 5 * 1024 * 1024)
// 當數據量大於fileSizeThreshold值時，內容將被寫入磁碟
// 上傳過程中無論是單個文件超過maxFileSize值，或者上傳的總量大於maxRequestSize 值都會拋出IllegalStateException 異常


//@WebServlet("/BackEnd/carousel/carousel.do")
@Controller
@RequestMapping("/carousel")
public class CarouselServlet{
	private static final long serialVersionUID = 1L;
	@Autowired
	CarouselDAO_interface carouselDAO_interface;

	//InputStream轉Byte
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

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@RequestParam("Carousel_pic_restore") String Carousel_pic_restore,
	@RequestParam("Carousel_title") String Carousel_title,@RequestParam("Carousel_subTitle") String Carousel_subTitle){
		List<String> errorMsgs = new LinkedList<String>();
		HttpServletRequest  req = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
		req.setAttribute("errorMsgs", errorMsgs);
		byte[] Carousel_pic = null;
		if (req.getPart("Carousel_pic").getSize() > 0) {
			Part pic = req.getPart("Carousel_pic");
			Carousel_pic = getPictureByteArray(pic);
		}
		if(StringUtils.isBlank(Carousel_pic_restore)){
			errorMsgs.add("需要有圖片唷");
		}else{
			else {
				Carousel_pic = Base64.getDecoder().decode(Carousel_pic_restore);
			}
		}
		if (StringUtils.isBlank(Carousel_title) {
			errorMsgs.add("沒寫標題喔");
		}
		if(StringUtils.isBlank(Carousel_subTitle)) {
			errorMsgs.add("給我一個副標題!!");
		}

		Carousel thisVO = new Carousel();
		thisVO.setCarouselPic(Carousel_pic);
		thisVO.setCarouselTitle(Carousel_title);
		thisVO.setCarouselSubtitle(Carousel_subTitle);

		if (errorMsgs.isEmpty()) {
			thisVO = carouselDAO_interface.add(thisVO);
			req.setAttribute("carouselVO", thisVO);
			String url = "/BackEnd/carousel/getOneCarousel.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}else {
			req.setAttribute("carouselVO", thisVO);
			RequestDispatcher failureView = req
					.getRequestDispatcher("/BackEnd/carousel/addCarousel.jsp");
			failureView.forward(req, res);
			return; //程式中斷
		}
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(@RequestParam("Carousel_no") String Carousel_no){
			Carousel thisVO = carouselDAO_interface.findByPK(Integer.parseInt(Carousel_no)){
			req.setAttribute("carouselVO", thisVO);
			String url = "/BackEnd/carousel/updateCarousel.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}
	}

	@RequestMapping(value = "/updateGO",method = RequestMethod.POST)
	public String updateGO(@RequestParam("Carousel_no") String Carousel_no,
	   @RequestParam("Carousel_title") String Carousel_title,@RequestParam("Carousel_subTitle") String Carousel_subTitle) {
		List<String> errorMsgs = new LinkedList<String>();
		req.setAttribute("errorMsgs", errorMsgs);
		byte[] Carousel_pic = null;
		if (req.getPart("Carousel_pic").getSize() > 0) {
			Part pic = req.getPart("Carousel_pic");
			Carousel_pic = getPictureByteArray(pic);

		}else {
			Carousel carousel = carouselDAO_interface.findByPK(Integer.parseInt(Carousel_no));
			Carousel_pic = carousel.getCarouselPic();
		}

		if (StringUtils.isBlank(Carousel_title) {
			errorMsgs.add("標題要寫呀!");
		}
		if(StringUtils.isBlank(Carousel_subTitle)) {
			errorMsgs.add("忘記寫副標題囉!!");
		}

		if (errorMsgs.isEmpty()) {
			Carousel thisVO = new Carousel();
			thisVO.setCarouselNo(Carousel_no);
			thisVO.setCarouselPic(Carousel_pic);
			thisVO.setCarouselTitle(Carousel_title);
			thisVO.setCarouselSubtitle(Carousel_subTitle);
			carouselDAO_interface.update(thisVO);
			req.setAttribute("carouselVO", thisVO);
			String url = "/BackEnd/carousel/getOneCarousel.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}else {
			req.setAttribute("carouselVO", thisVO);
			RequestDispatcher failureView = req
					.getRequestDispatcher("/BackEnd/carousel/updateCarousel.jsp");
			failureView.forward(req, res);
			return; //程式中斷
		}
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String delete(@RequestMapping("Carousel_no") String Carousel_no){
		carouselDAO_interface.delete(Integer.parseInt(Carousel_no));
		String url = "/BackEnd/carousel/getAllCarousel.jsp";
		RequestDispatcher successView = req.getRequestDispatcher(url);// 刪除成功後,轉交回送出刪除的來源網頁
		successView.forward(req, res);
	}

	@RequestMapping(value = "/getOne",method = RequestMethod.POST)
	public String getOne(@RequestParam("Carousel_no") String Carousel_no){
		Carousel carousel = carouselDAO_interface.findByPK(Integer.parseInt(Carousel_no));
		req.setAttribute("carouselVO", carousel);
		String url = "/BackEnd/carousel/getOneCarousel.jsp";
		RequestDispatcher successView = req.getRequestDispatcher(url);
		successView.forward(req, res);
	}

	@RequestMapping(value = "/search",method = RequestMethod.POST)
	public String search(@RequestParam("Carousel_title") String Carousel_title){
		List<Carousel> thisVO = carouselDAO_interface.findByTitle(Carousel_title);
		req.setAttribute("carouselVO", thisVO);
		String url = "/BackEnd/carousel/searchCarousels.jsp";
		RequestDispatcher successView = req.getRequestDispatcher(url);
		successView.forward(req, res);
	}

}