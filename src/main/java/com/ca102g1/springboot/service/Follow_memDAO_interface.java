package com.ca102g1.springboot.service;

import com.live.model.LiveVO;
import com.member.model.MemVO;

import java.util.List;

public interface Follow_memDAO_interface {
	public void insert(Follow_memVO follow_memVO);
	public void delete(String folo_mem_no, String foloed_mem_no);
	public Follow_memVO findByPrimaryKey(String folo_mem_no, String foloed_mem_no);
	//取得一個會員的所有關注賣家
	public List<Follow_memVO> getAll(String folo_mem_no); 
	public List<LiveVO> getFollowAddress(String FOLLOW_MEM_NO);
	List<MemVO> getAllFans(String foloed_mem_no);

}
