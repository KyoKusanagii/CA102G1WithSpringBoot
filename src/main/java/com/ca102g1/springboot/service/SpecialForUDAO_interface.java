package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.SpecialForu;

import java.util.List;

public interface SpecialForUDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void add(SpecialForu sf);
	void update(SpecialForu sf);
	void delete(String mem_no);
	SpecialForu findByPK(String mem_no);
	List<SpecialForu> getAll();
	void updateMemPreferenceCode(Integer code, String mem_no);
}