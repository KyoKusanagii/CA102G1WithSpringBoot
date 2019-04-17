package com.ca102g1.springboot.model;

import java.util.Date;

public class FbOrder {
    private String fbOrderNo;

    private String fbBuyerNo;

    private Date fbOrderTime;

    private Long fbOrderPrc;

    private String fbOrderTrans;

    private String fbOrderStatus;

    private String fbPayStatus;

    private String fbOrderRemark;

    private String fbTransport;

    public String getFbOrderNo() {
        return fbOrderNo;
    }

    public void setFbOrderNo(String fbOrderNo) {
        this.fbOrderNo = fbOrderNo == null ? null : fbOrderNo.trim();
    }

    public String getFbBuyerNo() {
        return fbBuyerNo;
    }

    public void setFbBuyerNo(String fbBuyerNo) {
        this.fbBuyerNo = fbBuyerNo == null ? null : fbBuyerNo.trim();
    }

    public Date getFbOrderTime() {
        return fbOrderTime;
    }

    public void setFbOrderTime(Date fbOrderTime) {
        this.fbOrderTime = fbOrderTime;
    }

    public Long getFbOrderPrc() {
        return fbOrderPrc;
    }

    public void setFbOrderPrc(Long fbOrderPrc) {
        this.fbOrderPrc = fbOrderPrc;
    }

    public String getFbOrderTrans() {
        return fbOrderTrans;
    }

    public void setFbOrderTrans(String fbOrderTrans) {
        this.fbOrderTrans = fbOrderTrans == null ? null : fbOrderTrans.trim();
    }

    public String getFbOrderStatus() {
        return fbOrderStatus;
    }

    public void setFbOrderStatus(String fbOrderStatus) {
        this.fbOrderStatus = fbOrderStatus == null ? null : fbOrderStatus.trim();
    }

    public String getFbPayStatus() {
        return fbPayStatus;
    }

    public void setFbPayStatus(String fbPayStatus) {
        this.fbPayStatus = fbPayStatus == null ? null : fbPayStatus.trim();
    }

    public String getFbOrderRemark() {
        return fbOrderRemark;
    }

    public void setFbOrderRemark(String fbOrderRemark) {
        this.fbOrderRemark = fbOrderRemark == null ? null : fbOrderRemark.trim();
    }

    public String getFbTransport() {
        return fbTransport;
    }

    public void setFbTransport(String fbTransport) {
        this.fbTransport = fbTransport == null ? null : fbTransport.trim();
    }
}