package com.ca102g1.springboot.model;

public class LiveNotifyKey {
    private String liveNo;

    private String memNo;

    public String getLiveNo() {
        return liveNo;
    }

    public void setLiveNo(String liveNo) {
        this.liveNo = liveNo == null ? null : liveNo.trim();
    }

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }
}