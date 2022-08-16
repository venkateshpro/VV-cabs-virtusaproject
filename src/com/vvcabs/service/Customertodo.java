package com.vvcabs.service;

import java.util.Scanner;

public class Customertodo {
	Scanner sc= new Scanner(System.in);
	servicevvcabsImp simpl= new servicevvcabsImp();


	
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
