package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.ArticleReport;

import java.util.List;

public interface Article_reportDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(ArticleReport article_report);
	void update(String article_report_no, int article_report_status);
	void deleteByArtiNo(String arti_no);
	
	ArticleReport findByPK(String article_report_no);
	List<ArticleReport> getAll();

}