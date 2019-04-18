package com.ca102g1.springboot.model;

public class ArtiReplyKey {
    private String artiNo;

    private Integer repNo;

    public String getArtiNo() {
        return artiNo;
    }

    public void setArtiNo(String artiNo) {
        this.artiNo = artiNo == null ? null : artiNo.trim();
    }

    public Integer getRepNo() {
        return repNo;
    }

    public void setRepNo(Integer repNo) {
        this.repNo = repNo;
    }
}