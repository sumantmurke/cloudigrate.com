package com.cloudigrate.controller;

import javax.ws.rs.FormParam;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.domain.User;
import com.cloudigrate.facade.UserFacade;

@Controller
public class UserController {
final static Logger logger = Logger.getLogger(UserController.class);	
	
@RequestMapping(value="/signup", method = RequestMethod.POST)
public ModelAndView createApplication(ModelMap model,
		@FormParam("fname") String fname,
		@FormParam("lname") String lname,
		@FormParam("email") String email,
		@FormParam("password") String password,
		@FormParam("phonenumber") String phonenumber,
		@FormParam("creditcard") String creditcard
		){
	logger.info("inside signup page");
	
	User u = new User();
	u.setCreditCard(creditcard);
	u.setFirstName(fname);
	u.setLastName(lname);
	u.setPassword(password);
	u.setPhone(phonenumber);
	u.setEmail(email);
	u.setIsAdmin(0);
	UserFacade uf = new UserFacade();
	uf.createUser(u);
	
	
	return new ModelAndView("instance");
	
}
	

}
