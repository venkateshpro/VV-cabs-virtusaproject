package com.vvcabs.App;

import java.util.ArrayList;
import java.util.Scanner;

import com.vvcabs.model.user;
import com.vvcabs.service.servicevvcabsImp;

public class Admin {
	
		Scanner sc= new Scanner(System.in);
		
		servicevvcabsImp simpl= new servicevvcabsImp();
		
		public void admin() {
			int ch;
			while(true) {
				 System.out.println();
				 System.out.println("*** welcome to Admin  ***");
				 System.out.println("Choose the option to perform");
				 System.out.println("");
				 System.out.println("Enter 1 Add New Customer");
				 System.out.println("Enter 2 Add new Cab ");
				 System.out.println("Enter 3 view Cab details ");
				 
				 ch=sc.nextInt();
				 switch(ch) {
				 case 1:
					 
					 try {
						simpl.add_newCustomer();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 break;
					 
				
				 case 2:
					 try {
						simpl.add_newCab();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 break;
	
				 case 3:
					 try {
						simpl.getListOfCabs();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.toString();
					}
					 break;
					 
				 case 4:
					 
	
					 
			
				 
			 }
			
		}
	}
}
		
		
		
	

