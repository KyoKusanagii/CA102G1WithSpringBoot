package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Category;

import java.util.List;
import java.util.Map;

public interface CategoryDAO_interface {
	void insert(Category category);
	void update(Category category);
	void delete(Integer cat_no);
	Category findByPK(Integer cat_no);
	List<Category> getAll();
	Map<Integer, String> getNameByNO();

}
