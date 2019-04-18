package com.ca102g1.springboot.service;

import com.android.model.BuyerOrder;
import com.ca102g1.springboot.model.MallOrder;
import com.mallitem.model.MallItem;

import java.util.List;

public interface MallOrderDAO_interface {
	
	public void insert(MallOrder mallOrder);
	public void update(MallOrder mallOrder);
	public void delete(String mall_order_no);
	public MallOrder findByPrimaryKey(String mall_order_no);
	public List<MallOrder> getAll();
//	public List<BuyerOrder> getAllOrderItem(String mall_order_no);
	public List<MallOrder> getMyMallOrder(String item_owner);
	
	//新增訂單及同時新增訂單細項
//	public void insertMallOrder(MallOrder mallOrder, List<MallItem> list);
	//找一個會員的所有商城訂單(買家)
	public List<MallOrder> getMyOrderForBuyer(String mall_buyer_no);
	//找一張訂單的賣家編號
	public String getOrderSeller(String mall_order_no);

	//找出商品大項的各分類銷售額
	public List<List<Integer>> revenuesByCat();
}
