package com.ca102g1.springboot.model;

public class FbShoppingCart {

    private Integer quantity;
    private String fb_buyer;
    private String fb_buyer_no;
    private String fb_item_no;
    private String fb_comment;
    private Integer fb_item_price;
    private String fb_item_pic;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getFb_buyer() {
        return fb_buyer;
    }

    public void setFb_buyer(String fb_buyer) {
        this.fb_buyer = fb_buyer;
    }

    public String getFb_buyer_no() {
        return fb_buyer_no;
    }

    public void setFb_buyer_no(String fb_buyer_no) {
        this.fb_buyer_no = fb_buyer_no;
    }

    public String getFb_item_no() {
        return fb_item_no;
    }

    public void setFb_item_no(String fb_item_no) {
        this.fb_item_no = fb_item_no;
    }

    public String getFb_comment() {
        return fb_comment;
    }

    public void setFb_comment(String fb_comment) {
        this.fb_comment = fb_comment;
    }

    public Integer getFb_item_price() {
        return fb_item_price;
    }

    public void setFb_item_price(Integer fb_item_price) {
        this.fb_item_price = fb_item_price;
    }

    public String getFb_item_pic() {
        return fb_item_pic;
    }

    public void setFb_item_pic(String fb_item_pic) {
        this.fb_item_pic = fb_item_pic;
    }
}
