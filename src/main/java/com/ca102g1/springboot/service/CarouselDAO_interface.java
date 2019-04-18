package com.ca102g1.springboot.service;


import java.util.List;

public interface CarouselDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(CarouselVO cv);
	void update(CarouselVO cv);
	void delete(Integer carousel_no);
	CarouselVO findByPK(Integer carousel_no);
	List<CarouselVO> findByTitle(String Carousel_title);
	List<CarouselVO> getAll();

}