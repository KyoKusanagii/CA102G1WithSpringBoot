package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.LimitSale;

import java.util.Set;

public interface LimitSaleSubDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void add(LimitSale ls);
	void update(LimitSale ls);
	void delete(Integer sale_no);
	LimitSale findByPK(Integer sale_no);

	LimitSale findByItemNo(String item_no);
	LimitSale getRandomOne();
	Set<LimitSale> findBySeller(String memNo);
	Set<LimitSale> findByKeyword(String search);
	Set<LimitSale> getRandomFive();
	Set<LimitSale> getAll();

}