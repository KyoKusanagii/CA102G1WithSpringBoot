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
// ��ƾڶq�j��fileSizeThreshold�ȮɡA���e�N�Q�g�J�Ϻ�
// �W�ǹL�{���L�׬O��Ӥ��W�LmaxFileSize�ȡA�Ϊ̤W�Ǫ��`�q�j��maxRequestSize �ȳ��|�ߥXIllegalStateException ���`


//@WebServlet("/BackEnd/carousel/carousel.do")
@Controller
@RequestMapping("/carousel")
public class CarouselServlet{
	private static final long serialVersionUID = 1L;
	@Autowired
	CarouselDAO_interface carouselDAO_interface;

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
			errorMsgs.add("�ݭn���Ϥ���");
		}else{
			else {
				Carousel_pic = Base64.getDecoder().decode(Carousel_pic_restore);
			}
		}
		if (StringUtils.isBlank(Carousel_title) {
			errorMsgs.add("�S�g���D��");
		}
		if(StringUtils.isBlank(Carousel_subTitle)) {
			errorMsgs.add("���ڤ@�ӰƼ��D!!");
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
			return; //�{�����_
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
			errorMsgs.add("���D�n�g�r!");
		}
		if(StringUtils.isBlank(Carousel_subTitle)) {
			errorMsgs.add("�ѰO�g�Ƽ��D�o!!");
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
			return; //�{�����_
		}
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String delete(@RequestMapping("Carousel_no") String Carousel_no){
		carouselDAO_interface.delete(Integer.parseInt(Carousel_no));
		String url = "/BackEnd/carousel/getAllCarousel.jsp";
		RequestDispatcher successView = req.getRequestDispatcher(url);// �R�����\��,���^�e�X�R�����ӷ�����
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