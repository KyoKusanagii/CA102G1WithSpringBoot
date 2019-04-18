package com.ca102g1.springboot.service;


import java.util.List;

public interface LiveNotifyDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(LiveNotifyVO ln);
	void update(LiveNotifyVO ln);
	void delete(String live_No);
	LiveNotifyVO findByPK(String live_No);
	List<LiveNotifyVO> getAll();

}