package com.ca102g1.springboot.model;

import java.util.Date;

public class FollowItem extends FollowItemKey {
    private Date foloTime;

    public Date getFoloTime() {
        return foloTime;
    }

    public void setFoloTime(Date foloTime) {
        this.foloTime = foloTime;
    }
}