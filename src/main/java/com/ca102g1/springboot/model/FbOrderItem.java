package com.ca102g1.springboot.model;

public class FbOrderItem extends FbOrderItemKey {
    private Long fbItemCnt;

    private Long fbItemPrc;

    private String fbComment;

    private byte[] fbItemPic;

    public Long getFbItemCnt() {
        return fbItemCnt;
    }

    public void setFbItemCnt(Long fbItemCnt) {
        this.fbItemCnt = fbItemCnt;
    }

    public Long getFbItemPrc() {
        return fbItemPrc;
    }

    public void setFbItemPrc(Long fbItemPrc) {
        this.fbItemPrc = fbItemPrc;
    }

    public String getFbComment() {
        return fbComment;
    }

    public void setFbComment(String fbComment) {
        this.fbComment = fbComment == null ? null : fbComment.trim();
    }

    public byte[] getFbItemPic() {
        return fbItemPic;
    }

    public void setFbItemPic(byte[] fbItemPic) {
        this.fbItemPic = fbItemPic;
    }
}