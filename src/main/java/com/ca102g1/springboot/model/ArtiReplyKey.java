package com.ca102g1.springboot.model;

public class ArtiReplyKey {
    private String artiNo;

    private Long repNo;

    public String getArtiNo() {
        return artiNo;
    }

    public void setArtiNo(String artiNo) {
        this.artiNo = artiNo == null ? null : artiNo.trim();
    }

    public Long getRepNo() {
        return repNo;
    }

    public void setRepNo(Long repNo) {
        this.repNo = repNo;
    }
}