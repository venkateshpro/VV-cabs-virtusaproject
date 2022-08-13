package com.vvcabs.model;

/**
 * @author Venkatesh
 */
public class booking {
	
	private int b_Id;
	private String pickup_location;
	private String drop_location;
	
	public int getB_Id() {
		return b_Id;
	}
	public void setB_Id(int b_Id) {
		this.b_Id = b_Id;
	}
	public String getPickup_location() {
		return pickup_location;
	}
	public void setPickup_location(String pickup_location) {
		this.pickup_location = pickup_location;
	}
	public String getDrop_location() {
		return drop_location;
	}
	public void setDrop_location(String drop_location) {
		this.drop_location = drop_location;
	}
	@Override
	public String toString() {
		return "booking [b_Id=" + b_Id + ", pickup_location=" + pickup_location + ", drop_location=" + drop_location
				+ "]";
	}
	public booking(int b_Id, String pickup_location, String drop_location) {
		super();
		this.b_Id = b_Id;
		this.pickup_location = pickup_location;
		this.drop_location = drop_location;
	}
	
	//driver details from cab.java class;
	
	

}
