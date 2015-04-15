package com.cloudigrate.controller;

import java.util.HashMap;

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
	return new ModelAndView("index");
	
}

@RequestMapping(value="/login", method = RequestMethod.POST)
public ModelAndView loginUser( 
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		HttpSession session
		){
	System.out.print("email" + email);
	System.out.println("pwd" + password);
	ModelAndView model = new ModelAndView();

	UserFacade userFacade = new UserFacade();
	if(email == "admin@gmail.com" && password == "password"){
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
			System.out.println("inside normal user login");
			model.setViewName("home");
		}
	}
	
/*	
	System.out.println(" username inside login controler "+email + " password "+password);
	UserFacade uf = new UserFacade();
	boolean check = uf.loginCheckUser(email, password);

	if(check == true){
		return new ModelAndView("index");
	}
	*/
	return model;
}

	
@RequestMapping(value="/userprofile",method = RequestMethod.GET)
public ModelAndView getProfile(HttpSession session, HttpServletRequest request ){
	
	ModelAndView model = new ModelAndView();
	session = request.getSession();
	String userid = (String) session.getAttribute("user");
	System.out.println(" user currently loggied in:"+session.getAttribute("user"));
	User user = userFacade.getUserDetails(userid);
	
	/*HashMap<String, String> userdetails = new HashMap<String, String>();
	userdetails.put("firstname", user.getFirstName());
	userdetails.put("lastname", user.getLastName());
	userdetails.put("phone", user.getPhone());
	userdetails.put("creditcard", user.getCreditCard());
	userdetails.put("email", user.getEmail());
	model.addAllAttributes(userdetails);
	
*/
	model.addObject("userdetail",user);
	model.setViewName("userprofile");
	return model;
}

@RequestMapping(value="/logout",method = RequestMethod.GET)
public ModelAndView logout(HttpServletRequest request, HttpSession session){
	session = request.getSession();
	session.invalidate();
	return new ModelAndView("home");
}

}
