package com.ca102g1.springboot.model;

public class MallOrderItemKey {
    private String mallOrderNo;

    private String itemNo;

    public String getMallOrderNo() {
        return mallOrderNo;
    }

    public void setMallOrderNo(String mallOrderNo) {
        this.mallOrderNo = mallOrderNo == null ? null : mallOrderNo.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }
}