package com.cisco.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity 
{
   public static void main(String[] args) 
   {
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/employees";
	String username="root";
	String password="Ashok@123!";
	
	//1.load the driver
	try 
	{
		Class.forName(driver);
		
		//2.get connectivity
		Connection conn = DriverManager.getConnection(url, username, password);
		
		//3.check the connection
		if(conn!=null)
		{
			System.out.println("Connnection Established");
		}
		else
		{
			System.out.println("Error while Connecting");
		}
		
	} catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
   }
}
