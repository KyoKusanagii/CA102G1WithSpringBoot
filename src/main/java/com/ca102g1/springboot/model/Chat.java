package com.ca102g1.springboot.model;

public class Chat {
    private String chatMasterNo;

    private String chatFriends;

    public String getChatMasterNo() {
        return chatMasterNo;
    }

    public void setChatMasterNo(String chatMasterNo) {
        this.chatMasterNo = chatMasterNo == null ? null : chatMasterNo.trim();
    }

    public String getChatFriends() {
        return chatFriends;
    }

    public void setChatFriends(String chatFriends) {
        this.chatFriends = chatFriends == null ? null : chatFriends.trim();
    }
}