package com.ca102g1.springboot.model;

public class TrailerNotifyKey {
    private String trailerNo;

    private String memNo;

    public String getTrailerNo() {
        return trailerNo;
    }

    public void setTrailerNo(String trailerNo) {
        this.trailerNo = trailerNo == null ? null : trailerNo.trim();
    }

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }
}