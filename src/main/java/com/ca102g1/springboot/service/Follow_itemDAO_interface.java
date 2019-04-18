package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.FollowItem;

import java.util.List;

public interface Follow_itemDAO_interface {
	public void insert(FollowItem follow_item);
	public void delete(String mem_no, String item_no);
	public FollowItem findByPrimaryKey(String mem_no, String item_no);
	//取得一個會員的所有關注商品
	public List<FollowItem> getAll(String mem_no);
}
