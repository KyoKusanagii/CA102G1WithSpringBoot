package com.ca102g1.springboot.service;


import com.ca102g1.springboot.model.LiveNotifyKey;

import java.util.List;

public interface LiveNotifyDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void add(LiveNotifyKey ln);
	void update(LiveNotifyKey ln);
	void delete(String live_No);
	LiveNotifyKey findByPK(String live_No);
	List<LiveNotifyKey> getAll();

}