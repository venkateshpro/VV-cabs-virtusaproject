package com.vvcabs.model;

public class Driverr {
	private int Id;
	
	private String email;
	private String pass;
	Cab c;
	
	
	public Driverr(int Id,String email, String pass, Cab c) {
		super();
		this.email = email;
		this.pass = pass;
		this.c = c;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Cab getC() {
		return c;
	}
	public void setC(Cab c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Driver [Id=" + Id + ", email=" + email + ", pass=" + pass + ", c=" + c + "]";
	}
	
	
}
