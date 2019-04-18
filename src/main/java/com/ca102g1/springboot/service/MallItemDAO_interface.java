package com.ca102g1.springboot.service;

import java.sql.Connection;
import java.util.List;


public interface MallItemDAO_interface {

	public void insert(MallItem mallItem);
	public void update(MallItem mallItem);
	public void delete(String mall_order_no, String item_no);
	public MallItem findByPrimaryKey(String mall_order_no, String item_no);
	public List<MallItem> getAll();
	void insertOrder(MallItem mallItem, Connection con2);

}
