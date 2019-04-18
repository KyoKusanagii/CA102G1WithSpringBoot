package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.Carousel;

import java.util.List;

public interface CarouselDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(Carousel cv);
	void update(Carousel cv);
	void delete(Integer carousel_no);
	Carousel findByPK(Integer carousel_no);
	List<Carousel> findByTitle(String Carousel_title);
	List<Carousel> getAll();

}