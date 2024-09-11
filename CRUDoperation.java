package com.cisco.demo;

import java.sql.Connection;

public class CRUDoperation 
{

	public static void main(String[] args) 
	{
		Connection conn = DBconfig.getConnection();
		
		if(conn!=null)
		{
			System.out.println("connection established");
		}
		else
		{
			System.out.println("Error in Connection not established");
		}

	}

}
