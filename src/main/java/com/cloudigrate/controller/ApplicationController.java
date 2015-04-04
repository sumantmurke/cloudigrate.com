package com.cloudigrate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.domain.Application;
import com.cloudigrate.facade.ApplicationFacade;

@Controller
public class ApplicationController {
	
	ApplicationFacade applicationFacade = new ApplicationFacade();
	
	@RequestMapping(value="/application", method = RequestMethod.GET)
	public ModelAndView getApplication(ModelMap model){
		System.out.println("inside get Application");
		Application application = applicationFacade.getApplication();
		model.addAttribute("application", application);
		return new ModelAndView("viewapp");
	}
	
	@RequestMapping(value="/application", method = RequestMethod.POST)
	public ModelAndView createApplication(ModelMap model){
		System.out.println("inside create Application");
		Application application = applicationFacade.createApplication();
		model.addAttribute("application", application);
		return new ModelAndView("instance");
	}
	
	@RequestMapping(value="/application", method = RequestMethod.PUT)
	public ModelAndView updateApplication(ModelMap model){
	
		System.out.println("inside update Application");
		Application application = applicationFacade.updateApplication();
		model.addAttribute("application", application);
		return new ModelAndView("instance");
	}
}
