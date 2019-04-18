package com.ca102g1.springboot.service;


import java.util.List;

public interface TrailerNotifyDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void add(TrailerNotify tn);
	void update(TrailerNotify tn);
	void delete(String trailer_No);
	TrailerNotify findByPK(String trailer_No);
	List<TrailerNotify> getAll();

}