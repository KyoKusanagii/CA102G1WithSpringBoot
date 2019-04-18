package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Live;

import java.util.List;

public interface LiveDAO_interface {
	
	public String insert(Live live);
	public void update(Live live);
	public void delete(String live_no);
	public Live findByPrimaryKey(String live_no);
	public List<Live> getAll();
	
	//2018/8/2 Max新增，找出那個人所有播過的影片
	public List<Live> getAllBelongToSeller(String mem_no);
	
	// 8/4 Hugh新增觀看直播區，找出正在直播的影片
	public List<Live> getLiveNow();
}
