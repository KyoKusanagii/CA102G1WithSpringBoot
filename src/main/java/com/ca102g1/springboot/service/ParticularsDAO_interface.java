package com.ca102g1.springboot.service;

import java.util.List;
import java.util.Map;

public interface ParticularsDAO_interface {
	void insert(ParticularsVO particulars);
	void update(ParticularsVO particulars);
	void delete(Integer part_no);
	ParticularsVO findByPK(Integer cat_no, Integer part_no);
	List<ParticularsVO> getAll();
	Map<Integer, String> getNameByNO();
	List<ParticularsVO> getByCagNoAll(Integer cat_no);

}
