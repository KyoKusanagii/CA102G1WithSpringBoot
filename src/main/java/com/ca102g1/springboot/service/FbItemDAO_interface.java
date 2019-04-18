package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.FbOrderItem;

import java.util.List;


public interface FbItemDAO_interface {
	public void insert(FbOrderItem fbItem);
	public void update(FbOrderItem fbItem);
	public void delete(String fb_order_no, String item_no);
	public FbOrderItem findByPrimaryKey(String fb_order_no, String item_no);
	public List<FbOrderItem> getAll();

}
