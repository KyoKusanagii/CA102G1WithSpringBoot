package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.News;

import java.util.List;

public interface NewsDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void insert(News news);
	void update(News news);
	void delete(int news_no);
	News findByPK(int news_no);
	List<News> getAll();
	List<News> showCustomer();

}