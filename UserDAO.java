package com.cisco.management;

import java.util.List;

public interface UserDAO 
{
	public int createUser(User User);
	public List<User> getAllUsers();
	public User updateUser(User user,int id);
	public boolean deleteUser(int id);
	public User getUserById(int id);
}
