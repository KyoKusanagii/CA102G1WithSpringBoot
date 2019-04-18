package com.ca102g1.springboot.service;

import java.util.List;

public interface LiveDAO_interface {
	
	public String insert(LiveVO liveVO);
	public void update(LiveVO liveVO);
	public void delete(String live_no);
	public LiveVO findByPrimaryKey(String live_no);
	public List<LiveVO> getAll();
	
	//2018/8/2 Max�s�W�A��X���ӤH�Ҧ����L���v��
	public List<LiveVO> getAllBelongToSeller(String mem_no);
	
	// 8/4 Hugh�s�W�[�ݪ����ϡA��X���b�������v��
	public List<LiveVO> getLiveNow();
}
