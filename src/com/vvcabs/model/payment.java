package com.vvcabs.model;

/**
 * @author Venkatesh
 */

public class payment {
	
	private int payment_Id;
	private String payment_type;
	private boolean payment_status;
	
	public payment(int payment_Id, String payment_type,boolean payment_status) {
		super();
		this.payment_Id = payment_Id;
		this.payment_type = payment_type;
	}
	
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
	
	public boolean isPayment_status() {
		return payment_status;
	}
	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}

	@Override
	public String toString() {
		return "payment [payment_Id=" + payment_Id + ", payment_type=" + payment_type + ", payment_status="
				+ payment_status + "]";
	}
	
	
	
	
	

}
