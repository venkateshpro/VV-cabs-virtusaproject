package com.vvcabs.App;

import java.util.Scanner;

import com.vvcabs.model.Customer;
import com.vvcabs.service.Admin;
import com.vvcabs.service.Customertodo;
import com.vvcabs.service.Drivertodo;



public class Login {
	
	String email;
	String pasword;
	
	public void loginn() {
		
		
		Scanner sc= new Scanner(System.in);
		Admin ad = new Admin();
		Drivertodo dr= new Drivertodo();
		Customertodo custodo= new Customertodo();
		Customer cus= new Customer();
		
		String ch;
		while(true) {
			
			
			 System.out.println();
			 System.out.println("*** welcome to vv Cabs online booking ***");
			 System.out.println("Choose the option to perform");
			 System.out.println("");
			 // here one thing wil add when we have database that is existing customer and new customer 
			 System.out.println("Enter customer for customer Login");
			 System.out.println("enter driver for Driver Login ");
			 System.out.println("Enter admin for Admin Login ");
			 
			 ch=sc.nextLine();
			 
			 switch(ch) {
			 case "customer":
				 System.out.println("Enter Customer email");
				 email=sc.next();
				 System.out.println("enter Customer Password");
				 pasword= sc.next();
					
					if (email.equals(cus.getUser_email()) && pasword.equals(cus.getUser_psw())) {
					//if(true) {	
						try {
							custodo.customertodo();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
						System.out.println("Invalid Credentials");
					}
				 
	
				 break;
			 case "driver":
				 // it will redirect to the driver portal
				 try {
					dr.drivertodo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 
				 
				 
				 
				 break;
				 
			 case "admin":
				 ad.admin();
				 
				 
			 		
				 
			 }
			 
			
		}
		
	}
	
	public static void main(String[] args) {
		Login l= new Login();
		l.loginn();
		
		
		
		
		
		
		
	}

}
