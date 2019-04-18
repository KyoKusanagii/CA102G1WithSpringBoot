package com.ca102g1.springboot.service;

import java.util.List;

public interface ConsulterDAO_interface {
	// �������w�q���Ʈw�������s����H��k
	void insert(ConsulterVO consulter);
	void update(ConsulterVO consulter);
	void delete(String consulter_no);
	ConsulterVO findByPK(String consulter_no);
	List<ConsulterVO> getAll();

}