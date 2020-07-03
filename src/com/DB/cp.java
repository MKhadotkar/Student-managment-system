package com.DB;
import java.sql.Connection;
import java.sql.DriverManager;
public class cp {
	
	static Connection con;
	
	public static Connection createC()
	{
		try
		{
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create the connection
			String user="system";
			String pass="mayank";
			String url="jdbc:oracle:thin:@localhost:1521:mayank";
			
			con = DriverManager.getConnection(url, user, pass);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
	}
	

}
