package com.vvcabs.service;

import java.util.Scanner;

import com.vvcabs.model.Customer;

public class validations {
	String email;
	String pasword;
	Scanner sc= new Scanner(System.in);

	
	
	public boolean validate_user() {
		
		 System.out.println("Enter Customer email");
		 String email=sc.next();
		 System.out.println("enter Customer Password");
		 String pasword= sc.next();
		 if (email.equals("v@12") && pasword.equals("1111")) {
			return true;
		 }
		 else
		 {
			return false;	
		}
		
		
		
	}

	public boolean validate_driver() {

		 System.out.println("Enter Driver  email");
		 String email=sc.next();
		 System.out.println("enter Driver Password");
		 String pasword= sc.next();
		 if (email.equals("d@12") && pasword.equals("1111")) {
			return true;
		 }
		 else
		 {
			return false;	
		}
		
		
	}
}
