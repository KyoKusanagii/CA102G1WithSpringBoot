package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Chat;
import com.ca102g1.springboot.model.Member;

import java.util.List;

public interface ChatDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void insert(Chat chat_master);
	void update(Chat chat_master);
	void delete(String chat_maste_no);
	Chat findByPK(String chat_master_no);
	List<Member> getAll(String chat_master_no);	//回傳所有朋友的集合，即為會員的集合

}