package com.ca102g1.springboot.service;


import java.util.List;

public interface SpecialForUDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(SpecialForUVO sf);
	void update(SpecialForUVO sf);
	void delete(String mem_no);
	SpecialForUVO findByPK(String mem_no);
	List<SpecialForUVO> getAll();
	void updateMemPreferenceCode(Integer code, String mem_no);
}