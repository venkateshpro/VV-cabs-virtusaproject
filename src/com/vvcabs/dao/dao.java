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

public class dao {
	
	private Set<Cab> cabs=new LinkedHashSet<>(); //available cabs
	private Set<Customer> users=new LinkedHashSet<>(); //available cabs


	Scanner sc= new Scanner(System.in);
	
	public static Connection connectionobj() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Url="jdbc:mysql://127.0.0.1:3306/vvcabs";
		String usern ="root";
		String pwd="8186016009";
		Connection con= DriverManager.getConnection(Url, usern, pwd);
		 return con;
		 
		

		 
	}
	public void addcab() throws ClassNotFoundException, SQLException {
		dao d=new dao();
		Connection con = d.connectionobj();
		PreparedStatement pst = con.prepareStatement("insert into cab(cab_no,cab_type,driver_name,driver_phonenum) values (?,?,?,?);");
		System.out.println("Enter Cab Number ");
		int c_no= sc.nextInt();
		
		System.out.println("Enter Cab Type  ");
		String c_type= sc.next();
		
		System.out.println("Enter Cab Driver Name ");
		String c_driverName= sc.next();
		
		System.out.println("Enter Driver Phone Number");
		String c_driverPhone= sc.next();
		pst.setLong(1, c_no);
		pst.setString(2, c_type);
		pst.setString(3, c_driverName);
		pst.setString(4, c_driverPhone);
		pst.execute();
		Cab c=  new Cab(c_no,c_type,c_driverName,c_driverPhone);

		cabs.add(c);
		System.out.println("Cab Added SccessFully");
		
		
	}
	
	public void getcabdetails() throws ClassNotFoundException, SQLException {
		dao d=new dao();
		Connection con = d.connectionobj();
		Statement st = con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from cab");
		System.out.println("cabNo  cabType  driverName  driverPhone");
		while(rs.next()) {
			  System.out.println(rs.getLong("cab_no")+"\t"+rs.getString("cab_type")+"\t"+rs.getString("driver_name")+"\t"+"\t"+rs.getString("driver_phonenum"));
		}
		
		
	}
	
	public void addnewcustomer() throws ClassNotFoundException, SQLException {
		dao d=new dao();
		Connection con = d.connectionobj();
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
		dao d=new dao();
		Connection con = d.connectionobj();
		Statement st = con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from customer");
		System.out.println("user_Id  user_email  user_psw  user_phone    user_name \n");
		while(rs.next()) {
			  System.out.println(rs.getInt("user_Id")+"\t"+" "+rs.getString("user_email")+"\t"+"\t"+rs.getString("user_psw")+"\t"+rs.getLong("user_phone")+"\t"+"\t"+rs.getString("user_name"));
		}
		
	}
}
