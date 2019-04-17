package com.ca102g1.springboot.model;

import java.util.Date;

public class FollowMem extends FollowMemKey {
    private Date foloTime;

    public Date getFoloTime() {
        return foloTime;
    }

    public void setFoloTime(Date foloTime) {
        this.foloTime = foloTime;
    }
}