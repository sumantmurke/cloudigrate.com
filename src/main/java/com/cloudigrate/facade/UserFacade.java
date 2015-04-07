package com.cloudigrate.facade;

import com.cloudigrate.dao.UserDao;
import com.cloudigrate.domain.User;

public class UserFacade {

	
public void createUser(){
	
	System.out.println("inside db");
	User u = new User();
	u.setCreditCard("VISA");
	u.setFirstName("sumant");
	u.setLastName("Murke");
	u.setPassword("asd");
	u.setPhone("408");
	u.setEmail("asdasd");
	u.setIsAdmin(0);;
	
	UserDao ud = new UserDao();
	ud.signup(u);
}
}
