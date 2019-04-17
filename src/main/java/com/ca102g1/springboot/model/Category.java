package com.ca102g1.springboot.model;

public class Category {
    private Short catNo;

    private String catName;

    public Short getCatNo() {
        return catNo;
    }

    public void setCatNo(Short catNo) {
        this.catNo = catNo;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }
}