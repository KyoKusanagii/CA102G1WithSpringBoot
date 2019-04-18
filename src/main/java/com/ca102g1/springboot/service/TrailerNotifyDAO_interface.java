package com.ca102g1.springboot.service;


import java.util.List;

public interface TrailerNotifyDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(TrailerNotifyVO tn);
	void update(TrailerNotifyVO tn);
	void delete(String trailer_No);
	TrailerNotifyVO findByPK(String trailer_No);
	List<TrailerNotifyVO> getAll();

}