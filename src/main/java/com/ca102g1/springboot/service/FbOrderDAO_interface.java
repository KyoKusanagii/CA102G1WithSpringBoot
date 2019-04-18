package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.FbOrder;
import com.ca102g1.springboot.model.FbOrderItem;

import java.util.List;


public interface FbOrderDAO_interface {
	public void insert(FbOrder fbOrder);
	public void update(FbOrder fbOrder);
	public void delete(String fb_order_no);
	public FbOrder findByPrimaryKey(String fb_order_no);
	public List<FbOrder> getAll();
	public List<FbOrder> getMyFBOrder(String item_owner);
//	public List<BuyerOrder> getAllOrderItem(String fb_order_no);
	public void insertFbOrder(FbOrder fbOrder, List<FbOrderItem> list);
	//取得會員所有fb訂單(買家)
	public List<FbOrder> getMyOrderForBuyer(String buyerNo);
	//取得訂單的賣家編號
	public String getOrderSeller(String fb_order_no);

}
