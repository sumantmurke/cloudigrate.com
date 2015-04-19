package com.cloudigrate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.domain.AdminPreference;
import com.cloudigrate.facade.DashboardFacade;

@Controller
public class AdminController {
	
	DashboardFacade dashboardFacade = new DashboardFacade();
	
	@RequestMapping(value="/adminpreference",method = RequestMethod.POST)
	public ModelAndView updatePreference( 
			@FormParam("instance_value") String instance_value,
			@FormParam("sql_value") String sql_value,
			@FormParam("nosql_value") String nosql_value,
			@FormParam("storage_value") String storage_value,
			HttpSession session, HttpServletRequest request ){
		System.out.println("inside update admin prefer controler");
		session = request.getSession();

		AdminPreference adminPreference = new AdminPreference();
		adminPreference.setInstance_value(instance_value);
		adminPreference.setNosql_value(nosql_value);
		adminPreference.setSql_value(nosql_value);
		adminPreference.setStorage_value(storage_value);

		//userFacade.updateUserProfile(user);
		dashboardFacade.updatePreference(adminPreference);
		ModelAndView model = new ModelAndView();
		model.setViewName("adminsettings");
		model.addObject("adminPreference",adminPreference);
		System.out.println("after model set to home");
		return model;
	}

	@RequestMapping(value="/adminpreference",method = RequestMethod.GET)
	public ModelAndView getPreference(HttpSession session, HttpServletRequest request ){
		System.out.println("inside getPreference controller");
		ModelAndView model = new ModelAndView();
		AdminPreference adminPreference =  dashboardFacade.getPreference();

		model.addObject("adminPreference",adminPreference);
		model.setViewName("adminsettings");
		return model;
	}

}
