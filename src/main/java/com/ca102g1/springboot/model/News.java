package com.ca102g1.springboot.model;

import java.util.Date;

public class News {
    private Long newsNo;

    private Date newsDate;

    private String newsTitle;

    private String newsContent;

    public Long getNewsNo() {
        return newsNo;
    }

    public void setNewsNo(Long newsNo) {
        this.newsNo = newsNo;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }
}