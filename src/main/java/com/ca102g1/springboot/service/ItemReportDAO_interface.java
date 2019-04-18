package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.ItemReport;

import java.util.List;

public interface ItemReportDAO_interface {
	public void insert(ItemReport itemReport);
	public void update(String itemReportNo, String itemReportHandler, int itemReportStatus);
	public void delete(String itemReportNO);
	ItemReport findByPrimaryKey(String itemReportNO);
	public List<ItemReport> getAll();
	public List<String> getAllName();
}
