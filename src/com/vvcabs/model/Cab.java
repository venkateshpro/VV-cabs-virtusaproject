package com.vvcabs.model;
/**
 * @author Venkatesh
 */

public class Cab {
	
	private long cab_no;
	private String cab_type;
	
	
	
	
	
	public Cab(long cab_no, String cab_type) {
		super();
		this.cab_no = cab_no;
		this.cab_type = cab_type;
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
