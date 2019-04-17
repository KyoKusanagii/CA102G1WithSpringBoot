package com.ca102g1.springboot.model;

public class MallOrderItem extends MallOrderItemKey {
    private Short isItemSale;

    private Long mallItemCnt;

    private Long mallItemPrc;

    public Short getIsItemSale() {
        return isItemSale;
    }

    public void setIsItemSale(Short isItemSale) {
        this.isItemSale = isItemSale;
    }

    public Long getMallItemCnt() {
        return mallItemCnt;
    }

    public void setMallItemCnt(Long mallItemCnt) {
        this.mallItemCnt = mallItemCnt;
    }

    public Long getMallItemPrc() {
        return mallItemPrc;
    }

    public void setMallItemPrc(Long mallItemPrc) {
        this.mallItemPrc = mallItemPrc;
    }
}