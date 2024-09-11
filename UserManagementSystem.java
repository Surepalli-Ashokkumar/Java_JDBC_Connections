package com.cisco.management;

import java.util.Scanner;

public class UserManagementSystem 
{

    public static void main(String[] args) {
		
	
	UserDAO dao= new UserDaoImpl();
	
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("enter your name");
	String name=sc.nextLine();
	

	System.out.println("enter your email");
	String email=sc.nextLine();
	
 
	System.out.println("enter your username");
	String username=sc.nextLine();
	
	int res=dao.createUser(new User(name, email, username));
	
	if(res>0) {
		System.out.println("User Inserted Successfully");
	}
	else {
		System.out.println("User Not Inserted");
	}
    }

}
