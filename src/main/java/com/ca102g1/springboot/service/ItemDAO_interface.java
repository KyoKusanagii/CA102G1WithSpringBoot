package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Item;

import java.util.List;

public interface ItemDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	String insert(Item item);
	void update(Item item);
	void delete(String item_no);
	Item findByPK(String item_no);
	List<String> findItemPics(String item_no);
	List<Item> getAll(String login_mem);
	void updateLaunch(Item item);
	List<Item> findByCat(Integer item_primary_class);
	List<Item> findByPart(Integer item_secondary_class);
	List<Item> findByKeyWord(String item_name);

}