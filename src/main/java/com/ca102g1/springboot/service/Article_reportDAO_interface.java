package com.ca102g1.springboot.service;

import java.util.List;

public interface Article_reportDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(ArticleReportVO article_report);
	void update(String article_report_no, int article_report_status);
	void delete(String arti_no);
	
	ArticleReportVO findByPK(String article_report_no);
	List<ArticleReportVO > getAll();

}