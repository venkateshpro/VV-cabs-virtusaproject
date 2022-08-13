package com.vvcabs.model;

public class Driver {
	
	String driver_name;
	String driver_phonenum;
	Cab c;
	
	
	
	
	public Driver(String driver_name, String driver_phonenum, Cab c) {
		super();
		this.driver_name = driver_name;
		this.driver_phonenum = driver_phonenum;
		this.c = c;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getDriver_phonenum() {
		return driver_phonenum;
	}
	public void setDriver_phonenum(String driver_phonenum) {
		this.driver_phonenum = driver_phonenum;
	}
	public Cab getC() {
		return c;
	}
	public void setC(Cab c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Driver [driver_name=" + driver_name + ", driver_phonenum=" + driver_phonenum + ", c=" + c + "]";
	}
	
	
	
	

}
