package com.ca102g1.springboot.service.impl;


import com.ca102g1.springboot.mapper.CarouselMapper;
import com.ca102g1.springboot.model.Carousel;
import com.ca102g1.springboot.model.CarouselExample;
import com.ca102g1.springboot.service.CarouselDAO_interface;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 此類別實作DAO interface，並將資料庫操作細節封裝起來
public class CarouselDAO implements CarouselDAO_interface {


	@Autowired
	CarouselMapper carouselMapper;
//
//	private static final String INSERT_STMT =
//	"INSERT INTO CAROUSEL(CAROUSEL_NO, CAROUSEL_PIC, CAROUSEL_TITLE, CAROUSEL_SUBTITLE)"
//	+ "VALUES(CAROUSEL_SEQ.nextval, ?, ?, ?)";
//
//	private static final String UPDATE_STMT =
//	"UPDATE CAROUSEL SET CAROUSEL_PIC = ?, CAROUSEL_TITLE = ?, CAROUSEL_SUBTITLE = ? WHERE CAROUSEL_NO = ?";
//
//	private static final String DELETE_STMT =
//	"DELETE FROM CAROUSEL WHERE CAROUSEL_NO = ?";
//	private static final String FIND_BY_PK =
//	"SELECT * FROM CAROUSEL WHERE CAROUSEL_NO = ?";
//
//	private static final String Find_BY_TITLE = "SELECT * FROM CAROUSEL WHERE UPPER(CAROUSEL_TITLE) LIKE ?";
//	private static final String GET_ALL = "SELECT * FROM CAROUSEL";
	
	
	//InputStream轉Byte
	public static byte[] getPictureByteArray(String path) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[8192];
		int i;
		while ((i = fis.read(buffer)) != -1) {
			baos.write(buffer, 0, i);
		}
		baos.close();
		fis.close();

		return baos.toByteArray();
	}
	
	public void add(Carousel cv) {
		carouselMapper.insert(cv);
		// Handle any driver errors
	}
	
	@Override
	public void update(Carousel cv) {
		carouselMapper.updateByPrimaryKey(cv);
	}

	public void delete(Integer carousel_no) {
		carouselMapper.deleteByPrimaryKey(carousel_no);
	}
	
	@Override
	public Carousel findByPK(Integer CAROUSEL_No) {
		return carouselMapper.selectByPrimaryKey(CAROUSEL_No);
	}

	
	@Override
	public List<Carousel> findByTitle(String Carousel_title) {

		CarouselExample carouselExample = new CarouselExample();
		CarouselExample.Criteria cCarouselExample = carouselExample.createCriteria();
		cCarouselExample.andCarouselTitleLike(Carousel_title.toUpperCase());
		return carouselMapper.selectByExample(carouselExample);
	}
	
	
	@Override
	public List<Carousel> getAll() {
		return carouselMapper.selectByExample(new CarouselExample());
	}

}
