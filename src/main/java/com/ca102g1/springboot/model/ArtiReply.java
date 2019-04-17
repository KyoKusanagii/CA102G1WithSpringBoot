package com.ca102g1.springboot.model;

import java.util.Date;

public class ArtiReply extends ArtiReplyKey {
    private String memNo;

    private String repContent;

    private Date repTime;

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    public String getRepContent() {
        return repContent;
    }

    public void setRepContent(String repContent) {
        this.repContent = repContent == null ? null : repContent.trim();
    }

    public Date getRepTime() {
        return repTime;
    }

    public void setRepTime(Date repTime) {
        this.repTime = repTime;
    }
}