package com.vvcabs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.vcabs.Controller.Login;
import com.vvcabs.dao.dao;

import jdbcConnection.jdbcConnectionobj;

public class Drivertodo {
	
	Scanner sc= new Scanner(System.in);
	//dao d= new dao();
	Login l= new Login();
	jdbcConnectionobj c_ojt= new jdbcConnectionobj();	
	ResultSet rs;
	Connection con;


		
		// it will check the request and accept driver gets user details
	
		public void drivertodo(int d_id,String d_name,int c_no,String d_phone) throws Exception{
			con = c_ojt.connectionobj();
			int ch;
			while(true) {
				 System.out.println();
				 System.out.println("*** welcome to Driver page  ***");
				 System.out.println("Choose the option to perform");
				 System.out.println("");
				 System.out.println("Enter 1 for the Request rised by user ");
				 System.out.println("Enter 2 login page");
				 
				 System.out.println("driver Id:"+" "+d_id+"\t"+"driver name:\t"+d_name);
				 ch= sc.nextInt();
				 
				 switch(ch) {
				 
				 case 1:
					 PreparedStatement pst1 = con.prepareStatement("select * from request where request_status=0");
					 ResultSet rs= pst1.executeQuery();
					 
					 if(rs.next()==true) {
						// System.out.println("heloo");
						 int user_id=rs.getInt(2);
						 String pickup_l=rs.getString(4);
						 String drop_l=rs.getString(5);
						 //while(rs.next()) {
								System.out.println("these are pending request ");
								System.out.println(rs.getInt("r_id")+"\t "+"\t"+rs.getInt("user_Id")+"\t"+rs.getString("pickup_location")+"\t"+rs.getString("drop_location"));
								System.out.println("---Press y to accept the request and y to cancel the request---");
								char ch1=sc.next().charAt(0);
								if(ch1=='y') {
									System.out.println("pickup location is :"+"  "+pickup_l );
									System.out.println("Drop locatione is :"+" "+ drop_l);
									System.out.println("enter Price to the ride");
									int price=sc.nextInt();
									System.out.println("booking id");
							 		int b_id= sc.nextInt();
							 		PreparedStatement pst2=con.prepareStatement("insert into booking values(?,?,?,?,?,?)");
									pst2.setInt(1, b_id);
									pst2.setInt(2, user_id);
									pst2.setInt(3,d_id);
									pst2.setString(4,pickup_l);
									pst2.setString(5, drop_l);
									pst2.setInt(6,price);
									pst2.execute();
									PreparedStatement pst3=con.prepareStatement("update request set request_status=? where user_id=?");
									pst3.setInt(1, 1);
									pst3.setInt(2,user_id);
									pst3.executeUpdate();
									
								}
								else {
									System.out.println("driver cancled your request");
								}
								
								
								
							}
					 //}
					 else  {
						 System.out.println("----No request ----");
					 }
					
					 
					
					break;
				 case 2:
					l.loginn(); 
						 
						 
				 
				 }
				 
				 
				 
			}
		}
	
	
	

}
