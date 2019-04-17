package com.ca102g1.springboot.model;

import java.util.Date;

public class MallOrder {
    private String mallOrderNo;

    private String mallBuyerNo;

    private Date mallOrderTime;

    private Long mallOrderPrc;

    private String mallOrderTrans;

    private String mallOrderStatus;

    private String mallPayStatus;

    private String mallOrderRemark;

    private String mallTransport;

    public String getMallOrderNo() {
        return mallOrderNo;
    }

    public void setMallOrderNo(String mallOrderNo) {
        this.mallOrderNo = mallOrderNo == null ? null : mallOrderNo.trim();
    }

    public String getMallBuyerNo() {
        return mallBuyerNo;
    }

    public void setMallBuyerNo(String mallBuyerNo) {
        this.mallBuyerNo = mallBuyerNo == null ? null : mallBuyerNo.trim();
    }

    public Date getMallOrderTime() {
        return mallOrderTime;
    }

    public void setMallOrderTime(Date mallOrderTime) {
        this.mallOrderTime = mallOrderTime;
    }

    public Long getMallOrderPrc() {
        return mallOrderPrc;
    }

    public void setMallOrderPrc(Long mallOrderPrc) {
        this.mallOrderPrc = mallOrderPrc;
    }

    public String getMallOrderTrans() {
        return mallOrderTrans;
    }

    public void setMallOrderTrans(String mallOrderTrans) {
        this.mallOrderTrans = mallOrderTrans == null ? null : mallOrderTrans.trim();
    }

    public String getMallOrderStatus() {
        return mallOrderStatus;
    }

    public void setMallOrderStatus(String mallOrderStatus) {
        this.mallOrderStatus = mallOrderStatus == null ? null : mallOrderStatus.trim();
    }

    public String getMallPayStatus() {
        return mallPayStatus;
    }

    public void setMallPayStatus(String mallPayStatus) {
        this.mallPayStatus = mallPayStatus == null ? null : mallPayStatus.trim();
    }

    public String getMallOrderRemark() {
        return mallOrderRemark;
    }

    public void setMallOrderRemark(String mallOrderRemark) {
        this.mallOrderRemark = mallOrderRemark == null ? null : mallOrderRemark.trim();
    }

    public String getMallTransport() {
        return mallTransport;
    }

    public void setMallTransport(String mallTransport) {
        this.mallTransport = mallTransport == null ? null : mallTransport.trim();
    }
}