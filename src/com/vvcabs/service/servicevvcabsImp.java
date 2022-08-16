package com.vvcabs.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.vvcabs.model.Cab;
import com.vvcabs.model.Driver;
import com.vvcabs.model.Customer;

public class servicevvcabsImp implements servicevvcabs {
	
	ArrayList<Cab> cabs= new ArrayList();
	
	ArrayList <Customer> NewUser = new ArrayList();

	Scanner sc= new Scanner(System.in);


	@Override
	public void add_newCab() throws Exception {

		System.out.println("Enter Cab Number ");
		int c_no= sc.nextInt();
		
		System.out.println("Enter Cab Type  ");
		String c_type= sc.next();
		
		System.out.println("Enter Cab Driver Name ");
		String c_DriverName= sc.next();
		
		System.out.println("Enter Driver Phone Number");
		String c_driverPhoneNo= sc.next();
		Cab c= new Cab(c_no,c_type);
		
		Driver dr= new Driver(c_DriverName,c_driverPhoneNo,c);
		
		
		cabs.add(c);
		 
		System.out.println("Cab Added Successfully");
	
	
	}
	
	public void add_newCustomer() throws Exception{
		//System.out.println("Plz enter the details ");
		System.out.println("Enter Customer Id");
		int u_id =sc.nextInt();
		
		System.out.println("Enter Customer Email");
		String u_email= sc.next();
		
		System.out.println("Enter Customer Password");
		String u_psw=sc.next();
		
		System.out.println("Enter Customer Name");
		String u_name =sc.next();
		
		System.out.println("Enter Customer Phone");
		long u_phone =sc.nextLong();
		
		
		
	
		
		Customer u1= new Customer(u_id,u_email,u_name,u_phone,u_psw);
		
		NewUser.add(u1);
		
		System.out.println(" Customer Added successfully");
			
		
	}

	@Override
	public void requestCab() throws Exception {
			
		
//		for(Object Cablist:cabs) {
//			System.out.println(Cablist);
//			
//			
//
//		}
		
	}

	@Override
	public void getListOfCabs() throws Exception{

		for(Object Cablist:cabs) {
			System.out.println(Cablist);

		}
	}
	public void get_user_by_id() {
		
		for(Customer users: NewUser) {
			
			
			
		}
	}
	


	
	
}
