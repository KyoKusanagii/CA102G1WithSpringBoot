package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Article;

import java.util.List;

public interface ArticleDAO_interface {
	public void insert(Article article);
	public void update(Article article);
	public void delete(String arti_no);
	public Article findByPrimaryKey(String arti_no);
	public List<Article> getAll();
	public List<Article> findByTopic(String arti_topic);
}
