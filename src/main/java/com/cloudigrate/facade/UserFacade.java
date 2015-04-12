package com.cloudigrate.facade;

import com.cloudigrate.dao.UserDao;
import com.cloudigrate.domain.User;

public class UserFacade {

	
public void createUser(User user){
	
	System.out.println("inside create user facade");
	
	
	UserDao ud = new UserDao();
	ud.signup(user);
}
public boolean loginCheckUser(String fname, String lname){
	
	UserDao ud = new UserDao();
	boolean check = ud.loginCheck(fname, lname);
	return check;
}
}
