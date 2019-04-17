package com.ca102g1.springboot.model;

public class FbOrderItemKey {
    private String fbOrderNo;

    private String itemNo;

    public String getFbOrderNo() {
        return fbOrderNo;
    }

    public void setFbOrderNo(String fbOrderNo) {
        this.fbOrderNo = fbOrderNo == null ? null : fbOrderNo.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }
}