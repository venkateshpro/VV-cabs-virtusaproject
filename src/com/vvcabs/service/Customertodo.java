package com.vvcabs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import com.vvcabs.Controller.Login;
import com.vvcabs.dao.dao;
import com.vvcabs.model.Cab;
import com.vvcabs.model.Customer;
import com.vvcabs.model.booking;

import jdbcConnection.jdbcConnectionobj;



public class Customertodo extends Customer{
	Scanner sc= new Scanner(System.in);
	booking b= new booking();
	Set<Cab> cabs= new LinkedHashSet<Cab>();
	//validations val= new validations();

	jdbcConnectionobj c_ojt= new jdbcConnectionobj();	
	ResultSet rs;
	
	

	
	// he request the cab and after getting acceptance he will get driver details
	
	public void customertodo(int id,String user_name) throws Exception {
		Connection con = c_ojt.connectionobj();
		int ch;
		while(true) {
			 System.out.println();
			 System.out.println("*** welcome to customer page  ***");
			 
			
			 System.out.println("Choose the option to perform");
			 System.out.println("");
			 System.out.println("Enter 1 request a cab");
			 System.out.println("Enter 2 pending request");
			 System.out.println("enter 3 for login page");
			 
			 System.out.println(id);
			 System.out.println(user_name);
			 ch= sc.nextInt();
			 
			 switch(ch) {
			 
			 case 1:
				
				 PreparedStatement pst1= con.prepareStatement("select * from driver ");
				 	ResultSet rst= pst1.executeQuery();
				 	if(rst.next()==false) {
				 		System.out.println("Currently No Cab is available for booking.\\\\nPlease try again after few minutes.");
				 	}
				 	else {
				 		
				 		System.out.println("---plz Enter Pickup location---");
				 		String pickup_location = sc.next() ;
				 		System.out.println("---plz Enter Drop location---");
				 		String drop_location = sc.next() ;

				 		PreparedStatement pst2= con.prepareStatement("insert into request  values(?,?,?,?,?)");
				 		System.out.println("enter reuest  id");
						int req_id=sc.nextInt();
						pst2.setInt(1,req_id);
						pst2.setInt(2, id);
						pst2.setInt(3, 0);
						pst2.setString(4,pickup_location );
						pst2.setString(5,drop_location );
						pst2.execute();
						System.out.println("A cab is requested");
				 	}
				break;
					 
			 
			 case 2:
				PreparedStatement pst = con.prepareStatement("select * from request where request_status=0");
				ResultSet rs= pst.executeQuery();
				System.out.println("request id   user_id  user_name  ");
				while(rs.next()) {
					
					System.out.println(rs.getInt("r_id")+"\t "+"\t"+rs.getInt("user_Id")+"\t "+user_name);
					
				}
			 case 3:
				 Login l = new Login();
				 l.loginn();
				 break;
			 
			 }
		}
			 
		
	}



}
