package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Particulars;

import java.util.List;
import java.util.Map;

public interface ParticularsDAO_interface {
	void insert(Particulars particulars);
	void update(Particulars particulars);
	void delete(Integer part_no);
	Particulars findByPK(Integer cat_no, Integer part_no);
	List<Particulars> getAll();
	Map<Integer, String> getNameByNO();
	List<Particulars> getByCagNoAll(Integer cat_no);

}
