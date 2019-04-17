package com.ca102g1.springboot.model;

import java.util.Date;

public class Member {
    private String memNo;

    private String memId;

    private String memPsw;

    private String memEmail;

    private String memFbid;

    private String memName;

    private String memSex;

    private Date memBirth;

    private String memMobile;

    private String memPost;

    private String memAddress;

    private String memReceiveadd;

    private String memActivecode;

    private Short memCondition;

    private Short memArtauth;

    private String memMartname;

    private String memMartinfo;

    private String memRecommend;

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId == null ? null : memId.trim();
    }

    public String getMemPsw() {
        return memPsw;
    }

    public void setMemPsw(String memPsw) {
        this.memPsw = memPsw == null ? null : memPsw.trim();
    }

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail == null ? null : memEmail.trim();
    }

    public String getMemFbid() {
        return memFbid;
    }

    public void setMemFbid(String memFbid) {
        this.memFbid = memFbid == null ? null : memFbid.trim();
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    public String getMemSex() {
        return memSex;
    }

    public void setMemSex(String memSex) {
        this.memSex = memSex == null ? null : memSex.trim();
    }

    public Date getMemBirth() {
        return memBirth;
    }

    public void setMemBirth(Date memBirth) {
        this.memBirth = memBirth;
    }

    public String getMemMobile() {
        return memMobile;
    }

    public void setMemMobile(String memMobile) {
        this.memMobile = memMobile == null ? null : memMobile.trim();
    }

    public String getMemPost() {
        return memPost;
    }

    public void setMemPost(String memPost) {
        this.memPost = memPost == null ? null : memPost.trim();
    }

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress == null ? null : memAddress.trim();
    }

    public String getMemReceiveadd() {
        return memReceiveadd;
    }

    public void setMemReceiveadd(String memReceiveadd) {
        this.memReceiveadd = memReceiveadd == null ? null : memReceiveadd.trim();
    }

    public String getMemActivecode() {
        return memActivecode;
    }

    public void setMemActivecode(String memActivecode) {
        this.memActivecode = memActivecode == null ? null : memActivecode.trim();
    }

    public Short getMemCondition() {
        return memCondition;
    }

    public void setMemCondition(Short memCondition) {
        this.memCondition = memCondition;
    }

    public Short getMemArtauth() {
        return memArtauth;
    }

    public void setMemArtauth(Short memArtauth) {
        this.memArtauth = memArtauth;
    }

    public String getMemMartname() {
        return memMartname;
    }

    public void setMemMartname(String memMartname) {
        this.memMartname = memMartname == null ? null : memMartname.trim();
    }

    public String getMemMartinfo() {
        return memMartinfo;
    }

    public void setMemMartinfo(String memMartinfo) {
        this.memMartinfo = memMartinfo == null ? null : memMartinfo.trim();
    }

    public String getMemRecommend() {
        return memRecommend;
    }

    public void setMemRecommend(String memRecommend) {
        this.memRecommend = memRecommend == null ? null : memRecommend.trim();
    }
}