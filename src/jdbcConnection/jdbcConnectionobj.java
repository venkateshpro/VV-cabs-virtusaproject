package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnectionobj {
	public static Connection connectionobj() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Url="jdbc:mysql://127.0.0.1:3306/vvcabs";
		String usern ="root";
		String pwd="8186016009";
		Connection con= DriverManager.getConnection(Url, usern, pwd);
		 return con;
		 
		

		 
	}

}
