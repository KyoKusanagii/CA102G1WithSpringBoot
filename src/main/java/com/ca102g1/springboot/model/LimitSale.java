package com.ca102g1.springboot.model;

import java.util.Date;

public class LimitSale {
    private Long saleNo;

    private String itemNo;

    private Date saleStart;

    private Date saleEnd;

    private Long salePrice;

    private Short saleStatus;

    private String saleRemark;

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
}