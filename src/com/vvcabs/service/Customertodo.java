package com.vvcabs.service;

import java.util.Scanner;

import com.vcabs.Controller.Login;
import com.vvcabs.dao.dao;

public class Customertodo {
	Scanner sc= new Scanner(System.in);
	servicevvcabsImp simpl= new servicevvcabsImp();
	
	validations val= new validations();

	dao d= new dao();
	 
	public void CusLogin() throws Exception {
		int ch2;
		 System.out.println(" Choose 1 For New Customer \n choose 2 for Existing Customer \n choose 3 previous page");
		 ch2=sc.nextInt();
		 if(ch2==1) {
			 d.addnewcustomer();
			 
		 }
		 
		 else if(ch2==2) {

			 if(val.validate_user()) {
				 customertodo();
			 }
			 else {
				 System.out.println("Plz enter Valid Email Or Password");
			 }
		
			 
		 }
		 else {
			 Login l= new Login();
			 l.loginn();
			 
		 }
		
	}

	
	// he request the cab and after getting acceptance he will get driver details
	
	public void customertodo() throws Exception {
		int ch;
		while(true) {
			 System.out.println();
			 System.out.println("*** welcome to customer page  ***");
			 
			
			 System.out.println("Choose the option to perform");
			 System.out.println("");
			 System.out.println("Enter 1 to see the avilable of cabs  for booking");
			 System.out.println("Enter 2 pending request");
			 
			 
			 ch= sc.nextInt();
			 
			 switch(ch) {
			 
			 case 1:
					  simpl.getListOfCabs();
				
					 break;
					 
					 
			 
			 }
			 
			 
			 
		}
	}


}
