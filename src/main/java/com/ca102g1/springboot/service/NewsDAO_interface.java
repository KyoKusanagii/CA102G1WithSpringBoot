package com.ca102g1.springboot.service;

import java.util.List;

public interface NewsDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(NewsVO news);
	void update(NewsVO news);
	void delete(int news_no);
	NewsVO findByPK(int news_no);
	List<NewsVO> getAll();
	List<NewsVO> showCustomer();

}