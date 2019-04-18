package com.ca102g1.springboot.service;

import com.item.model.ItemVO;

import java.util.List;

public interface RandomItem_interface {
		public List<ItemVO> findRandomItem();
		public List<ItemVO> getRandomFiveItemsByCategory(Integer category);
}
