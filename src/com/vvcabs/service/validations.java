package com.vvcabs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.vvcabs.Controller.Login;
import com.vvcabs.dao.dao;
import com.vvcabs.model.Customer;

import jdbcConnection.jdbcConnectionobj;

public class validations {
	String email;
	String password;
	Scanner sc= new Scanner(System.in);
	Customertodo cus= new Customertodo();
	dao d= new dao();
	jdbcConnectionobj c_ojt= new jdbcConnectionobj();	

	Drivertodo div=new Drivertodo();
	
	
	public void validate_user() throws SQLException, ClassNotFoundException {
		 int ch2;
		
		 System.out.println(" Choose 1 For New Customer \n choose 2 for Existing Customer \n choose 3 previous page");
		 ch2=sc.nextInt();
		 if(ch2==1) {
			 d.addnewcustomer();
			 
		 }
		 
		 else if(ch2==2) {
			 validations cus1=new validations();
				cus1.getEmailPass();
				Connection con =c_ojt.connectionobj();
				
				PreparedStatement cpt = con.prepareStatement("select * from customer where user_email=? and user_psw=? ");
				cpt.setString(1, cus1.email);
				cpt.setString(2, cus1.password);
				ResultSet crs = cpt.executeQuery();
				if(crs.next()) {
					//System.out.println();
					  int id=crs.getInt(1);
					  String user_name=crs.getString(5);
					  try {
						cus.customertodo(id,user_name);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
							
					System.out.println("-----Wrong  Email or  password of Customer Login-----");
					validate_user();
				}
			 
		
			 
		 }
		 else {
			 Login l= new Login();
			 l.loginn();
			 
		 }
		
			 //return true;
			 
		
		
		
	}
	public boolean validate_admin() throws SQLException, ClassNotFoundException {

		validations cus1=new validations();
		cus1.getEmailPass();
		Connection con =c_ojt.connectionobj();
		
		PreparedStatement cpt = con.prepareStatement("select * from customer where user_email=? and user_psw=? ");
		cpt.setString(1, cus1.email);
		cpt.setString(2, cus1.password);
		ResultSet crs = cpt.executeQuery();
		
		if(crs.next()) {
			
			 return true;
		}
		else {
			

			return false;
		}
		
		
	}
	public void validate_driver() throws ClassNotFoundException, SQLException {
		int ch2;
		 System.out.println(" Choose 1 For New Driver \n choose 2 for Existing Driver \n choose 3 for login page");
		 ch2=sc.nextInt();
		 if(ch2==1) {
			d.add_driver_cab();
		 }
		 else if(ch2==2){
			validations cus1=new validations();
			cus1.getEmailPass();
			Connection con =c_ojt.connectionobj();
			
			PreparedStatement cpt = con.prepareStatement("select * from driver where email=? and psw=? ");
			cpt.setString(1, cus1.email);
			cpt.setString(2, cus1.password);
			ResultSet crs = cpt.executeQuery();
			if(crs.next()) {
				int  dr_id= crs.getInt(1);
				 String dr_name=crs.getString(4);
				 int c_no= crs.getInt(5);
				 String d_phone= crs.getString(7);
				 try {
					div.drivertodo(dr_id,dr_name,c_no,d_phone);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("-----Wrong  Email or  password of Driver Login-----");
				validate_driver();
				
	
	
			}
		 }
		
	}
		void getEmailPass() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email :");
		this.email = sc.nextLine();
		System.out.println("Enter your Password :");
		this.password = sc.nextLine();
		
		
	}
	
}
