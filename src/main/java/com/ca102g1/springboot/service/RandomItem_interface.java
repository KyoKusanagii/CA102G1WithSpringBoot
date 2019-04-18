package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Item;
import com.item.model.Item;

import java.util.List;

public interface RandomItem_interface {
		public List<Item> findRandomItem();
		public List<Item> getRandomFiveItemsByCategory(Integer category);
}
