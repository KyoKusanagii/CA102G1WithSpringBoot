package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Itempic;

import java.util.List;

public interface ItempicDAO_interface {
	void insert(Itempic itempic);
	void update(Itempic itempic);
	void delete(String item_pic_no);
	Itempic findByPK(String item_no, String item_pic_no);
	List<Itempic> getOneItemAllPic(String item_no);
	List<Itempic> getAll();
	Itempic findThumbnail(String item_no);

}
