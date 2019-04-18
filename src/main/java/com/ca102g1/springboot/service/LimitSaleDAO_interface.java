package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.LimitSale;

import java.util.List;

public interface LimitSaleDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	public void add(LimitSale ls);
	public void update(LimitSale ls);
	public void delete(Integer sale_no);
	public LimitSale findByPK(Integer sale_no);
	public List<LimitSale> getAll();
	public LimitSale findOneSale(String item_no);
	public List<LimitSale> findHomePage();
	public void offLimit(Integer sale_no);

}