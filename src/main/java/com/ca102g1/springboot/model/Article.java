package com.ca102g1.springboot.model;

import java.util.Date;

public class Article {
    private String artiNo;

    private String artiTopic;

    private String memNo;

    private Date poTime;

    private String artiContent;

    public String getArtiNo() {
        return artiNo;
    }

    public void setArtiNo(String artiNo) {
        this.artiNo = artiNo == null ? null : artiNo.trim();
    }

    public String getArtiTopic() {
        return artiTopic;
    }

    public void setArtiTopic(String artiTopic) {
        this.artiTopic = artiTopic == null ? null : artiTopic.trim();
    }

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    public Date getPoTime() {
        return poTime;
    }

    public void setPoTime(Date poTime) {
        this.poTime = poTime;
    }

    public String getArtiContent() {
        return artiContent;
    }

    public void setArtiContent(String artiContent) {
        this.artiContent = artiContent == null ? null : artiContent.trim();
    }
}