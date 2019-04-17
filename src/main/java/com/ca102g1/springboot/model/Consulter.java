package com.ca102g1.springboot.model;

public class Consulter {
    private String consulterNo;

    private String consulterName;

    private byte[] consulterIcon;

    public String getConsulterNo() {
        return consulterNo;
    }

    public void setConsulterNo(String consulterNo) {
        this.consulterNo = consulterNo == null ? null : consulterNo.trim();
    }

    public String getConsulterName() {
        return consulterName;
    }

    public void setConsulterName(String consulterName) {
        this.consulterName = consulterName == null ? null : consulterName.trim();
    }

    public byte[] getConsulterIcon() {
        return consulterIcon;
    }

    public void setConsulterIcon(byte[] consulterIcon) {
        this.consulterIcon = consulterIcon;
    }
}