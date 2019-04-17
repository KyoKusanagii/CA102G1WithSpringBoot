package com.ca102g1.springboot.model;

public class FollowMemKey {
    private String foloMemNo;

    private String foloedMemNo;

    public String getFoloMemNo() {
        return foloMemNo;
    }

    public void setFoloMemNo(String foloMemNo) {
        this.foloMemNo = foloMemNo == null ? null : foloMemNo.trim();
    }

    public String getFoloedMemNo() {
        return foloedMemNo;
    }

    public void setFoloedMemNo(String foloedMemNo) {
        this.foloedMemNo = foloedMemNo == null ? null : foloedMemNo.trim();
    }
}