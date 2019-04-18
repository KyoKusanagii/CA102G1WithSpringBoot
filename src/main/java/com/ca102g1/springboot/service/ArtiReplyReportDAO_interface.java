package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.ArtireplyReport;

import java.util.List;

public interface ArtiReplyReportDAO_interface {
	public void insert(ArtireplyReport artiReplyReport);
	public void update(String artiReply_report_no, int artiReply_report_status);
	public void delete(Integer artiReplyReportRepNo);
	public void deleteByArtiNo(String arti_no);
	ArtireplyReport findByPrimaryKey(String artiReplyReportNO);
	public List<ArtireplyReport> getAll();
}
