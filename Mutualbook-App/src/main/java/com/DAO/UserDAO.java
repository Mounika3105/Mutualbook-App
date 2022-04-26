package com.DAO;
import com.entity.User;

public interface UserDAO {

	public boolean userRegister(User us);
	//to check if login credentials are correct or not
	public User login(String email,String password);
	
	
}
