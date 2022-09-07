package com.vcabs.Controller;


import java.sql.SQLException;
import java.util.Scanner;
import com.vvcabs.service.Admin;
import com.vvcabs.service.Customertodo;
import com.vvcabs.service.Drivertodo;
import com.vvcabs.service.validations;




public class Login {
	String email;
	String password;
	
	
	public void loginn() throws ClassNotFoundException, SQLException  {
		
		
		Scanner sc= new Scanner(System.in);
		Admin ad = new Admin();
		Drivertodo drtodo= new Drivertodo();
		Customertodo custodo= new Customertodo();
		validations v=new validations();
		
		String ch;
		while(true) {
			
			
			 System.out.println();
			 System.out.println("***  welcome to vv Cabs online booking ***");
			 System.out.println("Choose the option to perform \n");
			 System.out.println("Enter customer for customer Login");
			 System.out.println("Enter driver for driver Login ");
			 System.out.println("Enter admin for Admin Login ");
			 
			 ch=sc.nextLine();
			 
			 switch(ch) {
			 case "customer":
				try {
					v.validate_user();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
					
				 break;
				 
			 case "driver":
				 try {
					v.validate_driver();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 break;
				 
			 case "admin":
				 boolean a= v.validate_admin();	
					if(a) {
						ad.admin();
					}
					else {
						

						System.out.println("-----Wrong  Email or  password of Admin Login-----");
					}
				 break;
				 
				 
			 		
				 
			 }
			 
		//sc.close();	
		}
		
		
	}
	
	

}
