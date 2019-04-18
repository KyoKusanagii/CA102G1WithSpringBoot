package com.ca102g1.springboot.service;

import com.article.model.ArticleVO;

import java.util.List;

public interface ArticleDAO_interface {
	public void insert(ArticleVO articleVO);
	public void update(ArticleVO articleVO);
	public void delete(String arti_no);
	public ArticleVO findByPrimaryKey(String arti_no);
	public List<ArticleVO> getAll();
	
	
	public List<ArticleVO> findByTopic(String arti_topic);
}
