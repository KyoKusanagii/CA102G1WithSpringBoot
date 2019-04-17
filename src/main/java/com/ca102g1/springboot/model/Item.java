package com.ca102g1.springboot.model;

public class Item {
    private String itemNo;

    private String itemName;

    private Long itemPrice;

    private Short itemPrimaryClass;

    private Long itemSecondaryClass;

    private String itemOwner;

    private Short isFbLaunch;

    private Short isMallLaunch;

    private Long itemInventory;

    private String itemDescription;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Short getItemPrimaryClass() {
        return itemPrimaryClass;
    }

    public void setItemPrimaryClass(Short itemPrimaryClass) {
        this.itemPrimaryClass = itemPrimaryClass;
    }

    public Long getItemSecondaryClass() {
        return itemSecondaryClass;
    }

    public void setItemSecondaryClass(Long itemSecondaryClass) {
        this.itemSecondaryClass = itemSecondaryClass;
    }

    public String getItemOwner() {
        return itemOwner;
    }

    public void setItemOwner(String itemOwner) {
        this.itemOwner = itemOwner == null ? null : itemOwner.trim();
    }

    public Short getIsFbLaunch() {
        return isFbLaunch;
    }

    public void setIsFbLaunch(Short isFbLaunch) {
        this.isFbLaunch = isFbLaunch;
    }

    public Short getIsMallLaunch() {
        return isMallLaunch;
    }

    public void setIsMallLaunch(Short isMallLaunch) {
        this.isMallLaunch = isMallLaunch;
    }

    public Long getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(Long itemInventory) {
        this.itemInventory = itemInventory;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription == null ? null : itemDescription.trim();
    }
}