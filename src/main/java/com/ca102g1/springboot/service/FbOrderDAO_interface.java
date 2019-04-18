package com.ca102g1.springboot.service;

import com.android.model.BuyerOrderVO;
import com.fbitem.model.FbItemVO;

import java.util.List;


public interface FbOrderDAO_interface {
	public void insert(FbOrderVO fbOrderVO);
	public void update(FbOrderVO fbOrderVO);
	public void delete(String fb_order_no);
	public FbOrderVO findByPrimaryKey(String fb_order_no);
	public List<FbOrderVO> getAll();
	public List<FbOrderVO> getMyFBOrder(String item_owner);
	public List<BuyerOrderVO> getAllOrderItem(String fb_order_no);
	public void insertFbOrder(FbOrderVO fbOrderVO, List<FbItemVO> list);
	
	//���o�|���Ҧ�fb�q��(�R�a)
	public List<FbOrderVO> getMyOrderForBuyer(String buyerNo);
	//���o�q�檺��a�s��
	public String getOrderSeller(String fb_order_no);

}
