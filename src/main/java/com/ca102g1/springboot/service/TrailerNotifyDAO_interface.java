package com.ca102g1.springboot.service;


import java.util.List;

public interface TrailerNotifyDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(TrailerNotify tn);
	void update(TrailerNotify tn);
	void delete(String trailer_No);
	TrailerNotify findByPK(String trailer_No);
	List<TrailerNotify> getAll();

}