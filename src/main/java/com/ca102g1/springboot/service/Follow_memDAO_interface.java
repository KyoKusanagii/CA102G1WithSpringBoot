package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.FollowMem;
import com.ca102g1.springboot.model.Live;
import com.ca102g1.springboot.model.Member;

import java.util.List;

public interface Follow_memDAO_interface {
	public void insert(FollowMem follow_memVO);
	public void delete(String folo_mem_no, String foloed_mem_no);
	public FollowMem findByPrimaryKey(String folo_mem_no, String foloed_mem_no);
	//取得一個會員的所有關注賣家
	public List<FollowMem> getAll(String folo_mem_no);
	public List<Live> getFollowAddress(String FOLLOW_MEM_NO);
	List<Member> getAllFans(String foloed_mem_no);

}
