package com.ca102g1.springboot.model;

public class Particulars {
    private Long partNo;

    private Short catNo;

    private String partName;

    public Long getPartNo() {
        return partNo;
    }

    public void setPartNo(Long partNo) {
        this.partNo = partNo;
    }

    public Short getCatNo() {
        return catNo;
    }

    public void setCatNo(Short catNo) {
        this.catNo = catNo;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }
}