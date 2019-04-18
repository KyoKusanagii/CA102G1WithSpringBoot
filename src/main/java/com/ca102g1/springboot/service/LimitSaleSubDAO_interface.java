package com.ca102g1.springboot.service;


import java.util.Set;

public interface LimitSaleSubDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(LimitSaleSubVO ls);
	void update(LimitSaleSubVO ls);
	void delete(Integer sale_no);
	LimitSaleSubVO findByPK(Integer sale_no);
	
	LimitSaleSubVO findByItemNo(String item_no);
	LimitSaleSubVO getRandomOne();
	Set<LimitSaleSubVO> findBySeller(String memNo);
	Set<LimitSaleSubVO> findByKeyword(String search);
	Set<LimitSaleSubVO> getRandomFive();
	Set<LimitSaleSubVO> getAll();

}