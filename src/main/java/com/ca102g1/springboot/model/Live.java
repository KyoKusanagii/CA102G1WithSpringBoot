package com.ca102g1.springboot.model;

import java.util.Date;

public class Live {
    private String liveNo;

    private String liveSellerNo;

    private String liveAddress;

    private Short liveStatus;

    private Date liveStartTime;

    private Date liveEndTime;

    public String getLiveNo() {
        return liveNo;
    }

    public void setLiveNo(String liveNo) {
        this.liveNo = liveNo == null ? null : liveNo.trim();
    }

    public String getLiveSellerNo() {
        return liveSellerNo;
    }

    public void setLiveSellerNo(String liveSellerNo) {
        this.liveSellerNo = liveSellerNo == null ? null : liveSellerNo.trim();
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress == null ? null : liveAddress.trim();
    }

    public Short getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(Short liveStatus) {
        this.liveStatus = liveStatus;
    }

    public Date getLiveStartTime() {
        return liveStartTime;
    }

    public void setLiveStartTime(Date liveStartTime) {
        this.liveStartTime = liveStartTime;
    }

    public Date getLiveEndTime() {
        return liveEndTime;
    }

    public void setLiveEndTime(Date liveEndTime) {
        this.liveEndTime = liveEndTime;
    }
}