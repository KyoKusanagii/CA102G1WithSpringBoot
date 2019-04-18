package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.ArticleReport;

import java.util.List;

public interface Article_reportDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void insert(ArticleReport article_report);
	void update(String article_report_no, int article_report_status);
	void deleteByArtiNo(String arti_no);
	
	ArticleReport findByPK(String article_report_no);
	List<ArticleReport> getAll();

}