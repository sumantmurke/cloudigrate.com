package com.cloudigrate.facade;

import com.cloudigrate.dao.UserDao;
import com.cloudigrate.domain.User;

public class UserFacade {

	
public void createUser(User user){
	
	System.out.println("inside create user facade");
	
	
	UserDao ud = new UserDao();
	ud.signup(user);
}
}
