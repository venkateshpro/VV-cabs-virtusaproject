package com.vvcabs.model;

/**
 * @author Venkatesh
 */

public class user {
	private int user_Id;
	private String user_psw;
	long user_phone;
	String user_name;
	
	
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_psw() {
		return user_psw;
	}
	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}
	public long getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(long l) {
		this.user_phone = l;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "user [user_Id=" + user_Id + ", user_psw=" + user_psw + ", user_phone=" + user_phone + ", user_name="
				+ user_name + "]";
	}
	public user(int user_Id, String user_psw, long user_phone, String user_name) {
		super();
		this.user_Id = user_Id;
		this.user_psw = user_psw;
		this.user_phone = user_phone;
		this.user_name = user_name;
	}
	
	
	
	
}
