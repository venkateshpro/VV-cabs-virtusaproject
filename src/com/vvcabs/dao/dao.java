package com.vvcabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.vvcabs.model.Cab;
import com.vvcabs.model.Customer;
import com.vvcabs.model.Driverr;
import com.vvcabs.service.Drivertodo;

import jdbcConnection.jdbcConnectionobj;

public class dao {
	Drivertodo div = new Drivertodo();
	
	private Set<Cab> cabs=new LinkedHashSet<>(); //available cabs
	private Set<Customer> users=new LinkedHashSet<>(); 
	private Set<Driverr> drivers=new LinkedHashSet<>();//available cabs
	//Drivertodo dt= new Drivertodo();

	Scanner sc= new Scanner(System.in);
	jdbcConnectionobj c_ojt= new jdbcConnectionobj();

	public void add_driver_cab() throws ClassNotFoundException, SQLException {
		
		Connection con = c_ojt.connectionobj();
		PreparedStatement pst = con.prepareStatement("insert into driver values (?,?,?,?,?,?,?,?);");
		System.out.println("Enter Driver Id");
		int d_id =sc.nextInt();
		
		System.out.println("Enter Driver Email");
		String d_email= sc.next();
		
		System.out.println("Enter Driver Password");
		String d_psw=sc.next();
		
		System.out.println("Enter Cab Driver Name ");
		String d_name= sc.next();
		
		System.out.println("Enter Cab Number ");
		int c_no= sc.nextInt();
		
		System.out.println("Enter Cab Type  ");
		int c_type= sc.nextInt();
	
		System.out.println("Enter Driver Phone Number");
		String d_phone= sc.next();
		
		System.out.println("enter Status");
		int c_status=sc.nextInt();
		pst.setInt(1, d_id);
		pst.setString(2, d_email);
		pst.setString(3, d_psw);
		pst.setString(4, d_name);
		pst.setInt(5,c_no);
		pst.setInt(6,c_type);
		pst.setString(7, d_phone);
		pst.setInt(8,0);
		pst.execute();
		
		Cab c= new Cab (c_no,c_type,d_name,d_phone,c_status);
		
		Driverr dr= new Driverr(d_id,d_email,d_psw,c);


		cabs.add(c);
		drivers.add(dr);
	
		System.out.println("Cab And driver Added SccessFully");
		
		
	}
	
	public void get_driver_cab_details() throws ClassNotFoundException, SQLException {
		Set<Cab> arr= new LinkedHashSet<Cab>();

		
		String returncab="select * from driver";
		
		Connection con = c_ojt.connectionobj();
		
		PreparedStatement ps= con.prepareStatement(returncab);
		
		ResultSet rs= ps.executeQuery();
		
		//System.out.println("cabNo  cabType  driverName  driverPhone");
		while(rs.next()) {
			
			int d_id= rs.getInt(1);
			String d_email= rs.getString(2);
			String d_psw= rs.getString(3);

			String d_name= rs.getString(4);
			int c_no= rs.getInt(5);
			int c_type = rs.getInt(6);
			String d_phone= rs.getString(7);
			int c_status =rs.getInt(8);
			System.out.println(d_id);
			
			
			
		}
		
		
	
		
		
		
	}
	
	public void addnewcustomer() throws ClassNotFoundException, SQLException {
		
		Connection con = c_ojt.connectionobj();
		PreparedStatement pst = con.prepareStatement("insert into customer(user_Id,user_email,user_psw,user_phone,user_name) values (?,?,?,?,?);");
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
		
		pst.setInt(1, u_id);
		pst.setString(2, u_email);
		pst.setString(3, u_psw);
		pst.setLong(4, u_phone);
		pst.setString(5, u_name);
		pst.execute();
		
		Customer u= new Customer(u_id,u_email,u_psw,u_phone,u_name);
		users.add(u);
		System.out.println("Customer Added Succesfully");
		
		
	}
		
	public void customerslist() throws ClassNotFoundException, SQLException {
		Connection con = c_ojt.connectionobj();
		Statement st = con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from customer");
		System.out.println("user_Id  user_email  user_psw  user_phone    user_name \n");
		while(rs.next()) {
			  System.out.println(rs.getInt("user_Id")+"\t"+" "+rs.getString("user_email")+"\t"+"\t"+rs.getString("user_psw")+"\t"+rs.getLong("user_phone")+"\t"+"\t"+rs.getString("user_name"));
		}
		
	}
	
	public void listof_bookings() throws ClassNotFoundException, SQLException {
		Connection con = c_ojt.connectionobj();
		
		PreparedStatement pst = con.prepareStatement("select * from booking");
		ResultSet rs= pst.executeQuery();
		System.out.println("b_id  user_id  d_id  pickup       drop       price");
		while(rs.next()) {
			System.out.println(rs.getInt("b_id")+"\t"
								+rs.getInt("user_Id")+"\t"
								+rs.getInt("d_id")+"\t"
								+rs.getString("pickup_location")+"\t"
								+rs.getString("drop_location")+"\t"
								+rs.getInt("price"));
		}
		

	}

}
