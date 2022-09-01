package com.vcabs.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.vvcabs.model.Customer;
import com.vvcabs.service.Admin;
import com.vvcabs.service.Customertodo;
import com.vvcabs.service.Drivertodo;
import com.vvcabs.service.servicevvcabsImp;
import com.vvcabs.service.validations;



public class Login {
	
	
	public void loginn() {
		
		
		Scanner sc= new Scanner(System.in);
		Admin ad = new Admin();
		Drivertodo drtodo= new Drivertodo();
		Customertodo custodo= new Customertodo();
		Customer cus= new Customer();
		servicevvcabsImp simpl = new servicevvcabsImp();
		
		
		String ch;
		while(true) {
			
			
			 System.out.println();
			 System.out.println("*** welcome to vv Cabs online booking ***");
			 System.out.println("Choose the option to perform");
			 System.out.println("");
			 System.out.println("Enter customer for customer Login");
			 System.out.println("enter driver for Driver Login ");
			 System.out.println("Enter admin for Admin Login ");
			 
			 ch=sc.nextLine();
			 
			 switch(ch) {
			 case "customer":
				try {
					custodo.CusLogin();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 break;
				 
			 case "driver":
				try {
					drtodo.driverLogin();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 break;
				 
			 case "admin":
				 try {
					ad.admin();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 break;
				 
				 
			 		
				 
			 }
			 
			
		}
		
	}
	
	

}
