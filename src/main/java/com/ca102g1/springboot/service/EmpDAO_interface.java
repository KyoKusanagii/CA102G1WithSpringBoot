package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Employee;

import java.util.List;

public interface EmpDAO_interface {
	// 此介面定義對資料庫的相關存取抽象方法
	void insert(Employee emp);
	void update(Employee emp);
	void delete(String emp_no);
	Employee findByPK(String emp_no);
	Employee findById(String emp_id);
	List<Employee> getAll();
	Employee empLoginCheck(String login_id, String login_password);

}