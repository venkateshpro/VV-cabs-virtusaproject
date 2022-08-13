package com.vvcabs.App;

import java.util.Scanner;



public class Login {
	
	String email;
	String pasword;
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Admin ad = new Admin();
		Drivertodo dr= new Drivertodo();
		
		
		String ch;
		while(true) {
			
			
			 System.out.println();
			 System.out.println("*** welcome to vv cabs online booking ***");
			 System.out.println("Choose the option to perform");
			 System.out.println("");
			 // here one thing wil add when we have database that is existing customer and new customer 
			 System.out.println("Enter customer for customer Login");
			 System.out.println("enter driver for Driver Login ");
			 System.out.println("Enter admin for Admin Login ");
			 
			 ch=sc.nextLine();
			 
			 switch(ch) {
			 case "customer":
				 
				 if (true) {//when we have data base we will validate credentails
					 
					 //Customer cus= new Customer();
					 
					 
					 
				 }
				 
				 break;
			 case "driver":
				 // it will redirect to the driver portal
				 
				 
				 break;
				 
			 case "admin":
				 ad.admin();
				 
				 
			 		
				 
			 }
			 
			
		}
		
		
		
		
		
		
	}

}
