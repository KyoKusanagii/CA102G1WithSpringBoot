package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Consulter;

import java.util.List;

public interface ConsulterDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void insert(Consulter consulter);
	void update(Consulter consulter);
	void delete(String consulter_no);
	Consulter findByPK(String consulter_no);
	List<Consulter> getAll();

}