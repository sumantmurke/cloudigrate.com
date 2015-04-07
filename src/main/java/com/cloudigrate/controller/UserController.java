package com.cloudigrate.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
final static Logger logger = Logger.getLogger(UserController.class);	
	
@RequestMapping(value="/SignUp", method = RequestMethod.POST)
public ModelAndView createApplication(ModelMap model){
	logger.info("inside signup page");
	
	return new ModelAndView("instance");
	
}
	

}
