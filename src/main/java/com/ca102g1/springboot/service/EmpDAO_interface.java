package com.ca102g1.springboot.service;

import java.util.List;

public interface EmpDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(EmpVO emp);
	void update(EmpVO emp);
	void delete(String emp_no);
	EmpVO findByPK(String emp_no);
	EmpVO findById(String emp_id);
	List<EmpVO> getAll();
	EmpVO empLoginCheck(String login_id, String login_password);

}