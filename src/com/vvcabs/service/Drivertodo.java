package com.vvcabs.service;

import java.util.Scanner;

public class Drivertodo {
	
	Scanner sc= new Scanner(System.in);
	servicevvcabsImp simpl= new servicevvcabsImp();

	validations val= new validations();
	public void driverLogin() throws Exception {
		int ch2;
		 System.out.println(" Choose 1 For New Cab \n choose 2 for Existing Cab");
		 ch2=sc.nextInt();
		 if(ch2==1) {
			simpl.add_newCab();
		 }
		 else {
			drivertodo();
			 
		 }
		
	}


		
		// it will check the request and accept driver gets user details
	
		public void drivertodo() throws Exception {
			int ch;
			while(true) {
				 System.out.println();
				 System.out.println("*** welcome to Driver page  ***");
				 System.out.println("Choose the option to perform");
				 System.out.println("");
				 System.out.println("Enter 1 for the Request rised by user ");
				 System.out.println("Enter 2 cancel request");
				 
				 
				 ch= sc.nextInt();
				 
				 switch(ch) {
				 
				 case 1:
					 
					 
					break;
						 
						 
				 
				 }
				 
				 
				 
			}
		}
	
	
	

}
