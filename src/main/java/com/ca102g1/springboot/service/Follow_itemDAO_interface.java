package com.ca102g1.springboot.service;

import java.util.List;

public interface Follow_itemDAO_interface {
	public void insert(Follow_itemVO follow_itemVO);
	public void delete(String mem_no, String item_no);
	public Follow_itemVO findByPrimaryKey(String mem_no, String item_no);
	//���o�@�ӷ|�����Ҧ����`�ӫ~
	public List<Follow_itemVO> getAll(String mem_no);
}
