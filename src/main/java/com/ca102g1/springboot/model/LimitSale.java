package com.ca102g1.springboot.model;

import java.util.Base64;
import java.util.Date;

public class LimitSale {
    private Long saleNo;

    private String itemNo;

    private Date saleStart;

    private Date saleEnd;

    private Long salePrice;

    private Short saleStatus;

    private String saleRemark;

    //以下非原生limitSale表格欄位, join item and itempic後出現
    private byte[] itemPic;

    private String itemOwner;

    private String itemName;

    private Integer itemPrice;

    public Long getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(Long saleNo) {
        this.saleNo = saleNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public Date getSaleStart() {
        return saleStart;
    }

    public void setSaleStart(Date saleStart) {
        this.saleStart = saleStart;
    }

    public Date getSaleEnd() {
        return saleEnd;
    }

    public void setSaleEnd(Date saleEnd) {
        this.saleEnd = saleEnd;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Short getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Short saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getSaleRemark() {
        return saleRemark;
    }

    public void setSaleRemark(String saleRemark) {
        this.saleRemark = saleRemark == null ? null : saleRemark.trim();
    }

    public String getByteString() throws Exception {
        if (itemPic != null) {
            byte[] encodeBase64 = Base64.getEncoder().encode(itemPic);
            String base64DataString = new String(encodeBase64 , "UTF-8");
            return base64DataString;
        }
        else {
            return null;
        }

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = result + Integer.parseInt(itemNo.substring(1));
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof LimitSale)  ) {
            return false;
        }else {
            LimitSale lsVO = (LimitSale) obj;
            if(this.getItemNo().equals(lsVO.getItemNo())) {
                return true;
            }else {
                return false;
            }
        }
    }

}