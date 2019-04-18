package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Employee;

import java.util.List;

public interface EmpDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(Employee emp);
	void update(Employee emp);
	void delete(String emp_no);
	Employee findByPK(String emp_no);
	Employee findById(String emp_id);
	List<Employee> getAll();
	Employee empLoginCheck(String login_id, String login_password);

}