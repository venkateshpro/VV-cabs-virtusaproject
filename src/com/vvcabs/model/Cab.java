package com.vvcabs.model;
/**
 * @author Venkatesh
 */

public class Cab {
	
	private long cab_no;
	private String cab_type;
	String driver_name;
	String driver_phonenum;
	
	
	
	
	
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cab(long cab_no, String cab_type, String driver_name, String driver_phonenum) {
		super();
		this.cab_no = cab_no;
		this.cab_type = cab_type;
		this.driver_name = driver_name;
		this.driver_phonenum = driver_phonenum;
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
	
	public long getCab_no() {
		return cab_no;
	}
	public void setCab_no(long cab_no) {
		this.cab_no = cab_no;
	}
	public String getCab_type() {
		return cab_type;
	}
	public void setCab_type(String cab_type) {
		this.cab_type = cab_type;
	}
	
	
	

	@Override
	public String toString() {
		return "cab [cab_no=" + cab_no + ", cab_type=" + cab_type + "]";
	}
	public Cab(long cab_no, String cab_type,  String driver_name, long driver_phoneNo) {
		super();
		this.cab_no = cab_no;
		this.cab_type = cab_type;
		
	}
	
	
	
	

}
