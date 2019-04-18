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
	
	//�s�W�q��ΦP�ɷs�W�q��Ӷ�
//	public void insertMallOrder(MallOrder mallOrder, List<MallItem> list);
	//��@�ӷ|�����Ҧ��ӫ��q��(�R�a)
	public List<MallOrder> getMyOrderForBuyer(String mall_buyer_no);
	//��@�i�q�檺��a�s��
	public String getOrderSeller(String mall_order_no);

	//��X�ӫ~�j�����U�����P���B
	public List<List<Integer>> revenuesByCat();
}
