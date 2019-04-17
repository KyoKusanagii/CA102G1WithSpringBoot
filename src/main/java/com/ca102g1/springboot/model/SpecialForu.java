package com.ca102g1.springboot.model;

public class SpecialForu {
    private String memNo;

    private Long clothCnts;

    private Long foodCnts;

    private Long gameCnts;

    private Long outdoorCnts;

    private Long homeelecCnts;

    private Long threecCnts;

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    public Long getClothCnts() {
        return clothCnts;
    }

    public void setClothCnts(Long clothCnts) {
        this.clothCnts = clothCnts;
    }

    public Long getFoodCnts() {
        return foodCnts;
    }

    public void setFoodCnts(Long foodCnts) {
        this.foodCnts = foodCnts;
    }

    public Long getGameCnts() {
        return gameCnts;
    }

    public void setGameCnts(Long gameCnts) {
        this.gameCnts = gameCnts;
    }

    public Long getOutdoorCnts() {
        return outdoorCnts;
    }

    public void setOutdoorCnts(Long outdoorCnts) {
        this.outdoorCnts = outdoorCnts;
    }

    public Long getHomeelecCnts() {
        return homeelecCnts;
    }

    public void setHomeelecCnts(Long homeelecCnts) {
        this.homeelecCnts = homeelecCnts;
    }

    public Long getThreecCnts() {
        return threecCnts;
    }

    public void setThreecCnts(Long threecCnts) {
        this.threecCnts = threecCnts;
    }
}