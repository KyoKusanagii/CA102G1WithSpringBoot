package com.ca102g1.springboot.model;

public class Itempic {
    private String itemPicNo;

    private String itemNo;

    private byte[] itemPic;

    public String getItemPicNo() {
        return itemPicNo;
    }

    public void setItemPicNo(String itemPicNo) {
        this.itemPicNo = itemPicNo == null ? null : itemPicNo.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public byte[] getItemPic() {
        return itemPic;
    }

    public void setItemPic(byte[] itemPic) {
        this.itemPic = itemPic;
    }
}