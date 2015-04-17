package com.cloudigrate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.domain.User;
import com.cloudigrate.facade.UserFacade;

@Controller
public class UserController {
final static Logger logger = Logger.getLogger(UserController.class);	
UserFacade userFacade = new UserFacade();
@RequestMapping(value="/signup", method = RequestMethod.POST)
public ModelAndView createUser(ModelMap model,
		@FormParam("fname") String fname,
		@FormParam("lname") String lname,
		@FormParam("email") String email,
		@FormParam("password") String password,
		@FormParam("phonenumber") String phonenumber,
		@FormParam("creditcard") String creditcard
		){
	logger.info("inside signup page");
	System.out.println("inside signup controller");
	User user = new User();
	user.setCreditCard(creditcard);
	user.setFirstName(fname);
	user.setLastName(lname);
	user.setPassword(password);
	user.setPhone(phonenumber);
	user.setEmail(email);
	user.setIsAdmin(0);
	UserFacade userfacade = new UserFacade();
	userfacade.createUser(user);
	return new ModelAndView("index");
	
}

@RequestMapping(value="/login", method = RequestMethod.POST)
public ModelAndView loginUser( 
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		HttpSession session
		){
	System.out.println("email " + email);
	System.out.println("pwd " + password);
	ModelAndView model = new ModelAndView();

	UserFacade userFacade = new UserFacade();
	if(email.equals("admin@gmail.com") && password.equals("password")){
		System.out.println("inside admin");
		model.setViewName("admindashboard");
	}
	else
	{
		if(userFacade.loginCheckUser(email, password))
		{
			System.out.println("inside normal user login");
			
			session.setAttribute("user", email);
			session.setAttribute("sessionID", session.getId());
			System.out.println("session details "+session.getId()+" email: "+session.getAttribute("user")+" session id : "+session.getAttribute("sessionID"));
			model.setViewName("index");
		}
		else
		{
			System.out.println("inside normal user login with login failed");
			model.setViewName("home");
		}
	}
	

	return model;
}

	
@RequestMapping(value="/userprofilepage",method = RequestMethod.GET)
public ModelAndView getProfile(HttpSession session, HttpServletRequest request ){
	System.out.println("inside userprofile controller");
	ModelAndView model = new ModelAndView();
	session = request.getSession();
	String userid = (String) session.getAttribute("user");
	System.out.println(" user currently loggied in:"+session.getAttribute("user"));
	User user = userFacade.getUserDetails(userid);

	model.addObject("userdetail",user);
	model.setViewName("userprofile");
	return model;
}


@RequestMapping(value="/userprofileupdate",method = RequestMethod.POST)
public ModelAndView updateProfile( 
		@FormParam("firstname") String firstname,
		@FormParam("lastname") String lastname,
		@FormParam("email") String email,
		@FormParam("phonenumber") String phonenumber,
		@FormParam("creditcard") String creditcard,
		HttpSession session, HttpServletRequest request ){
	System.out.println("inside update profile controler");
	
	System.out.println("email "+email);
	
	session = request.getSession();
	User user = new User();
	user.setCreditCard(creditcard);
	user.setEmail(email);
	user.setFirstName(firstname);
	user.setLastName(lastname);
	user.setPhone(phonenumber);
	
	userFacade.updateUserProfile(user);
	
	ModelAndView model = new ModelAndView();
	model.setViewName("userprofile");
	
	System.out.println("after model set to home");
	return model;
}


@RequestMapping(value="/logout",method = RequestMethod.GET)
public ModelAndView logout(HttpServletRequest request, HttpSession session){
	session = request.getSession();
	session.invalidate();
	return new ModelAndView("home");
}

}
