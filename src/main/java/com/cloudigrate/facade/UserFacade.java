package com.cloudigrate.facade;

import com.cloudigrate.dao.UserDao;
import com.cloudigrate.domain.User;

public class UserFacade {
	UserDao userdao = new UserDao();
	
public void createUser(User user){
	
	System.out.println("inside create user facade");
	
	

	userdao.signup(user);
}
public boolean loginCheckUser(String fname, String lname){
	
	
	boolean check = userdao.loginCheck(fname, lname);
	return check;
}
/**
 * @param userid 
 * 
 */
public User getUserDetails(String userid) {
	// TODO Auto-generated method stub
	return userdao.getuserdetails(userid);
}
}
