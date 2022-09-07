package com.vvcabs.App;

import java.sql.SQLException;

import com.vvcabs.Controller.Login;

public class App {
	public static void main(String[] args) {
		Login l= new Login();
		try {
			l.loginn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
