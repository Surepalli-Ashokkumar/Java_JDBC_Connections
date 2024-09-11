package com.cisco.config;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert
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
//				String sql = "insert into eproduct(name, price) value('lenovo',6678)";
//				Statement stm = conn.createStatement();
//				stm.executeUpdate(sql);
				
//				String sql = "Delete table eproduct";
//				Statement stm = conn.createStatement();
 //  			stm.executeUpdate(sql);
				
//				String sql ="update employees set price=678";
//				Statement stm = conn.createStatement();
//				stm.executeUpdate(sql);
				
				
				String sql = "Select * from eproduct";
				Statement stm = conn.createStatement();
				stm.executeUpdate(sql);	
				
				ResultSet rs =stm.executeQuery(sql);
				System.out.println("Data fetch successfully");
				
				while(rs.next())
				{
					int id = rs.getInt("id");
					String name = rs.getString("name");
					double price = rs.getDouble("price");
					Date date = rs.getDate("date_added");
					System.out.println("id: "+id+"name: "+name+"price: "+price+"date_added: "+date);
				}
				
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
