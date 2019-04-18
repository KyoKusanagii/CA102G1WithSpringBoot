package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.News;

import java.util.List;

public interface NewsDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(News news);
	void update(News news);
	void delete(int news_no);
	News findByPK(int news_no);
	List<News> getAll();
	List<News> showCustomer();

}