package com.ca102g1.springboot.service;

import com.member.model.MemVO;

import java.util.List;

public interface ChatDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(ChatVO chat_master);
	void update(ChatVO chat_master);
	void delete(String chat_maste_no);
	ChatVO findByPK(String chat_master_no);
	List<MemVO> getAll(String chat_master_no);	//�^�ǩҦ��B�ͪ����X�A�Y���|�������X

}