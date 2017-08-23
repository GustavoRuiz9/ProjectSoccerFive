package com.soccerFive.beans;

public class User {

	String id;
	String user_name;
	String password;
	byte[] img_user;
	
	
	public User(String id, String user_name, String password, byte[] img_user) {
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.img_user = img_user;
	}
	
	public User(){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getImg_user() {
		return img_user;
	}
	public void setImg_user(byte[] img_user) {
		this.img_user = img_user;
	}
	
	
	
}
