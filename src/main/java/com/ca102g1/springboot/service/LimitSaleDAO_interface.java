package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.LimitSale;

import java.util.List;

public interface LimitSaleDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	public void add(LimitSale ls);
	public void update(LimitSale ls);
	public void delete(Integer sale_no);
	public LimitSale findByPK(Integer sale_no);
	public List<LimitSale> getAll();
	public LimitSale findOneSale(String item_no);
	public List<LimitSale> findHomePage();
	public void offLimit(Integer sale_no);

}