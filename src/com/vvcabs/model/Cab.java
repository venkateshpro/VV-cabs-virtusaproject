package com.vvcabs.model;
/**
 * @author Venkatesh
 */

public class Cab {
	
	private int cab_no;
	private int cab_type;
	String driver_name;
	String driver_phonenum;
	int status;
	
	
	
	
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cab(int cab_no, int c_type, String driver_name, String driver_phonenum,int status) {
		super();
		this.cab_no = cab_no;
		this.cab_type = c_type;
		this.driver_name = driver_name;
		this.driver_phonenum = driver_phonenum;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
	
	public int getCab_no() {
		return cab_no;
	}
	public void setCab_no(int cab_no) {
		this.cab_no = cab_no;
	}
	public int getCab_type() {
		return cab_type;
	}
	public void setCab_type(int cab_type) {
		this.cab_type = cab_type;
	}

	@Override
	public String toString() {
		return "Cab [cab_no=" + cab_no + ", cab_type=" + cab_type + ", driver_name=" + driver_name
				+ ", driver_phonenum=" + driver_phonenum + ", status=" + status + "]";
	}
	
	
	

	
	
	
	
	

}
