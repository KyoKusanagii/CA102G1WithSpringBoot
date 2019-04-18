package com.ca102g1.springboot.service;

import java.util.List;
import java.util.Map;

public interface MemDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(MemVO mem);
	void update(MemVO mem);
	void delete(String mem_no);
	MemVO findByPK(String mem_no);
	List<MemVO> getAll();
	List<MemVO> getAllDesc();
	void signup(MemVO mem);
	void setAuth(MemVO mem);
	MemVO checkID(String mem_id);
	//�n�J
	MemVO login(String mem_id, String mem_psw);
	
	MemVO findByID(String mem_id);
	
	// 8/1 Hugh�s�W:�M����
	List<MemVO> searchMall(String mem_martname);
	
	String findNewestMember();
	
	// 8/7 Hugh�s�W�H�c����
	void activeMem(MemVO mem);
	
	Map<String, byte[]> getPicByNO();
	Map<String, String> getNameByNO();
	
	//�ק������
	void updateStore(MemVO mem);
	//�ק�|��
	void updateMem(MemVO mem);
	//�ק�K�X
	void updatePsw(MemVO mem);
	
	// 8/10Hugh�s�W�GFB�n�J
	void fbSignup(MemVO mem);
	
	// 8/11Hugh�s�W�G���]FB�W�r�B�Ϥ������L
	void fbNamePicture(MemVO mem);
	
	// 8/14Hugh�s�W�G�T�{�W�r���L���U�L
	MemVO checkFBName(String mem_name);
	
	// 8/14Hugh�s�W�GFB�n�J
	MemVO fbLogin(String mem_name, String mem_psw);
	
	// 8/14Hugh�s�W�GFB�n�J
	void fbFullInfo(MemVO mem);
	
	void updateReceiveadd(MemVO mem);
	
}