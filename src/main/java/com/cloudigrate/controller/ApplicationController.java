package com.cloudigrate.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

import com.cloudigrate.domain.Application;
import com.cloudigrate.domain.Key;
import com.cloudigrate.facade.ApplicationFacade;
import com.cloudigrate.facade.KeyFacade;

@Controller
public class ApplicationController {
	
	ApplicationFacade applicationFacade = new ApplicationFacade();
	
	@RequestMapping(value="/application/{applicationId}", method = RequestMethod.GET)
	public ModelAndView getApplication(ModelMap model,
			@PathParam("applicationId") String applicationId){
		System.out.println("inside get Application");
		Application application = applicationFacade.getApplication(Integer.parseInt(applicationId));
		model.addAttribute("application", application);
		return new ModelAndView("viewapp");
	}
	
	@RequestMapping(value="/application", method = RequestMethod.POST)
	public ModelAndView createApplication(ModelMap model, 
			@FormParam("name") String name,
			@FormParam("publisher") String publisher,
			@FormParam("description") String description,
			@FormParam("organization") String organization){
		Application createApplication = new Application();
		createApplication.setName(name);
		createApplication.setPublisher(publisher);
		createApplication.setDescription(description);
		createApplication.setOrganization(organization);
		createApplication.setUserId(1);
		System.out.println("inside create Application: Name "+name);
		Application application = applicationFacade.createApplication(createApplication);
		model.addAttribute("application", application);
		return new ModelAndView("viewapp");
	}
	
	@RequestMapping(value="/application/{appId}", method = RequestMethod.POST)
	public ModelAndView updateApplication(ModelMap model,
			@PathVariable("appId") String applicationId,
			@FormParam("name") String name,
			@FormParam("publisher") String publisher,
			@FormParam("description") String description,
			@FormParam("organization") String organization){
		System.out.println("inside update Application: "+applicationId+" Name: "+name+" Pub: "+publisher);
		Application updateApplication = new Application();
		updateApplication.setId(Integer.parseInt(applicationId));
		updateApplication.setName(name);
		updateApplication.setPublisher(publisher);
		updateApplication.setDescription(description);
		updateApplication.setOrganization(organization);
		applicationFacade.updateApplication(updateApplication);
		return new ModelAndView("viewapp");
	}
	
/*	@RequestMapping(value="/getViewapp", method = RequestMethod.GET)
	public ModelAndView getViewapp(){
		
		String userId = "1"; // This will be taken from Session
		System.out.println("inside getviewapp");
		ArrayList<Application> allApplications = applicationFacade.getAllApplications(Integer.parseInt(userId));
		return new ModelAndView("viewapp", "allApplications", allApplications);
	}*/
	
//	@RequestMapping(value="/allApplication/{userId}", method = RequestMethod.GET)
//	public ModelAndView getAllApplication(ModelMap model,
//			@PathParam("userId") String userId){
//		System.out.println("inside getting all Application");
//		//User id to be passed to getAllApplications
//		ArrayList<Application> allApplications = applicationFacade.getAllApplications(Integer.parseInt(userId));
//		model.addAttribute("allApplications", allApplications);
//		return new ModelAndView("viewapp");
//	}
}
