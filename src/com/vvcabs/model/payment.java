package com.vvcabs.model;

/**
 * @author Venkatesh
 */

public class payment {
	
	private int payment_Id;
	private String payment_type;
	
	
	public int getPayment_Id() {
		return payment_Id;
	}
	public void setPayment_Id(int payment_Id) {
		this.payment_Id = payment_Id;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	@Override
	public String toString() {
		return "payment [payment_Id=" + payment_Id + ", payment_type=" + payment_type + "]";
	}
	public payment(int payment_Id, String payment_type) {
		super();
		this.payment_Id = payment_Id;
		this.payment_type = payment_type;
	}
	
	
	

}
