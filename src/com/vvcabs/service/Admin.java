package com.vvcabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.vcabs.Controller.Login;
import com.vvcabs.dao.dao;
import com.vvcabs.model.Customer;

public class Admin {
	
		Scanner sc= new Scanner(System.in);
		dao d= new dao();
		
		servicevvcabsImp simpl= new servicevvcabsImp();
		Login l= new Login();
		
		public void admin() throws ClassNotFoundException, SQLException {
			int ch;
			while(true) {
				 System.out.println();
				 System.out.println("*** welcome to Admin  ***");
				 System.out.println("Choose the option to perform");
				 System.out.println("");
				
				 System.out.println("Enter 1 Add new Cab ");
				 System.out.println("Enter 2 view List of Cab ");
				 System.out.println("Enter 3 view Bookings");
				 System.out.println("Enter 4 list of Customer");
				 
				 ch=sc.nextInt();
				 switch(ch) {
				 
					 
					
				 case 1:
					d.addcab();
					 break;
	
				 case 2:
					 d.getcabdetails();
					 break;
				 case 3:
					 //d.customerslist();
					 break;
				 case 4:
					 d.customerslist();
					 
					 
	
					 
			
				 
			 }
			
		}
	}
}
		
		
		
	

