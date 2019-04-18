package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.Carousel;

import java.util.List;

public interface CarouselDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void add(Carousel cv);
	void update(Carousel cv);
	void delete(Integer carousel_no);
	Carousel findByPK(Integer carousel_no);
	List<Carousel> findByTitle(String Carousel_title);
	List<Carousel> getAll();

}