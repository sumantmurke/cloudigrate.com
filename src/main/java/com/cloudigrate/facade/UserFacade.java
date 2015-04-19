package com.cloudigrate.facade;

import java.sql.SQLException;

import com.cloudigrate.dao.UserDao;
import com.cloudigrate.domain.User;

public class UserFacade {
	UserDao userdao = new UserDao();
	
public void createUser(User user){
	
	System.out.println("inside create user facade");
	
	

	userdao.signup(user);
}
public int loginCheckUser(String fname, String lname){
	
	return userdao.loginCheck(fname, lname);
	
}
/**
 * @param userid 
 * 
 */
public User getUserDetails(String userid) {
	// TODO Auto-generated method stub
	return userdao.getuserdetails(userid);
}
/**
 * @param user 
 * 
 */
public void updateUserProfile(User user) {
	// TODO Auto-generated method stub
	try {
		userdao.updateUserProfile(user);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
