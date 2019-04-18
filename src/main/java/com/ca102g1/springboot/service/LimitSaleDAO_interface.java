package com.ca102g1.springboot.service;


import java.util.List;

public interface LimitSaleDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	public void add(LimitSaleVO ls);
	public void update(LimitSaleVO ls);
	public void delete(Integer sale_no);
	public LimitSaleVO findByPK(Integer sale_no);
	public List<LimitSaleVO> getAll();
	public LimitSaleVO findOneSale(String item_no);
	public List<LimitSaleVO> findHomePage();
	public void offLimit(Integer sale_no);

}