package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.LiveNotifyKey;

import java.util.List;

public interface LiveNotifyDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void add(LiveNotifyKey ln);
	void update(LiveNotifyKey ln);
	void delete(String live_No);
	LiveNotifyKey findByPK(String live_No);
	List<LiveNotifyKey> getAll();

}