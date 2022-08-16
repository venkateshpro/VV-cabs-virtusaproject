package com.vvcabs.service;

import java.util.Scanner;

import com.vvcabs.model.Customer;

public class validations {
	String email;
	String pasword;
	Scanner sc= new Scanner(System.in);

	
	Customer cus= new Customer();
	
	public void validate_user() {
		
		email=sc.next();
		pasword= sc.next();
		
		if (email.equals(cus.getUser_email()) && pasword.equals(cus.getUser_psw())) {
			
		}
		
		
		
		
	}

}
