package com.ca102g1.springboot.model;

public class Employee {
    private String empNo;

    private String empId;

    private String empPwd;

    private String empName;

    private Short empStatus;

    private Short empMemAuth;

    private Short empCarouselAuth;

    private Short empReportAuth;

    private Short empChatAuth;

    private Short empLevel;

    private byte[] empIcon;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd == null ? null : empPwd.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Short getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Short empStatus) {
        this.empStatus = empStatus;
    }

    public Short getEmpMemAuth() {
        return empMemAuth;
    }

    public void setEmpMemAuth(Short empMemAuth) {
        this.empMemAuth = empMemAuth;
    }

    public Short getEmpCarouselAuth() {
        return empCarouselAuth;
    }

    public void setEmpCarouselAuth(Short empCarouselAuth) {
        this.empCarouselAuth = empCarouselAuth;
    }

    public Short getEmpReportAuth() {
        return empReportAuth;
    }

    public void setEmpReportAuth(Short empReportAuth) {
        this.empReportAuth = empReportAuth;
    }

    public Short getEmpChatAuth() {
        return empChatAuth;
    }

    public void setEmpChatAuth(Short empChatAuth) {
        this.empChatAuth = empChatAuth;
    }

    public Short getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(Short empLevel) {
        this.empLevel = empLevel;
    }

    public byte[] getEmpIcon() {
        return empIcon;
    }

    public void setEmpIcon(byte[] empIcon) {
        this.empIcon = empIcon;
    }
}