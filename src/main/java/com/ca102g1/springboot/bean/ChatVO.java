package com.ca102g1.springboot.bean;

public class ChatVO {
	
	//Oracle�s�B�ͪ��򥻸�T�A��ܰT���sRedis
	private String chat_master_no;
	private String chat_friends;
	
	public ChatVO() {
		
	}
	
	public String getChat_master_no() {
		return chat_master_no;
	}

	public void setChat_master_no(String chat_master_no) {
		this.chat_master_no = chat_master_no;
	}

	public String getChat_friends() {
		return chat_friends;
	}

	public void setChat_friends(String chat_friends) {
		this.chat_friends = chat_friends;
	}

	
	
}
