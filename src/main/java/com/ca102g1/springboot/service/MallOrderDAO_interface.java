package com.ca102g1.springboot.service;

import com.android.model.BuyerOrderVO;
import com.mallitem.model.MallItemVO;

import java.util.List;

public interface MallOrderDAO_interface {
	
	public void insert(MallOrderVO mallOrderVO);
	public void update(MallOrderVO mallOrderVO);
	public void delete(String mall_order_no);
	public MallOrderVO findByPrimaryKey(String mall_order_no);
	public List<MallOrderVO> getAll();
	public List<BuyerOrderVO> getAllOrderItem(String mall_order_no);
	public List<MallOrderVO> getMyMallOrder(String item_owner);
	
	//�s�W�q��ΦP�ɷs�W�q��Ӷ�
	public void insertMallOrder(MallOrderVO mallOrderVO, List<MallItemVO> list);
	//��@�ӷ|�����Ҧ��ӫ��q��(�R�a)
	public List<MallOrderVO> getMyOrderForBuyer(String mall_buyer_no);
	//��@�i�q�檺��a�s��
	public String getOrderSeller(String mall_order_no);

	//��X�ӫ~�j�����U�����P���B
	public List<List<Integer>> revenuesByCat();
}
