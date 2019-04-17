package com.ca102g1.springboot.model;

import java.util.Date;

public class Trailer {
    private String trailerNo;

    private String trailerSellerNo;

    private Date trailerTime;

    private String trailerTopic;

    public String getTrailerNo() {
        return trailerNo;
    }

    public void setTrailerNo(String trailerNo) {
        this.trailerNo = trailerNo == null ? null : trailerNo.trim();
    }

    public String getTrailerSellerNo() {
        return trailerSellerNo;
    }

    public void setTrailerSellerNo(String trailerSellerNo) {
        this.trailerSellerNo = trailerSellerNo == null ? null : trailerSellerNo.trim();
    }

    public Date getTrailerTime() {
        return trailerTime;
    }

    public void setTrailerTime(Date trailerTime) {
        this.trailerTime = trailerTime;
    }

    public String getTrailerTopic() {
        return trailerTopic;
    }

    public void setTrailerTopic(String trailerTopic) {
        this.trailerTopic = trailerTopic == null ? null : trailerTopic.trim();
    }
}