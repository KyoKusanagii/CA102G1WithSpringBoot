package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Chat;
import com.ca102g1.springboot.model.Member;

import java.util.List;

public interface ChatDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(Chat chat_master);
	void update(Chat chat_master);
	void delete(String chat_maste_no);
	Chat findByPK(String chat_master_no);
	List<Member> getAll(String chat_master_no);	//�^�ǩҦ��B�ͪ����X�A�Y���|�������X

}