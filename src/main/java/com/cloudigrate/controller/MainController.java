package com.cloudigrate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/movie")
public class MainController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", name);
		return "list";

	}
	
	@RequestMapping(value="/getInstance", method = RequestMethod.GET)
	public ModelAndView getInstance(){
		
		System.out.println("inside getinstance");
		return new ModelAndView("instance");
	}
	
	@RequestMapping(value="/getSql", method = RequestMethod.GET)
	public ModelAndView getSql(){
		
		System.out.println("inside getsql");
		return new ModelAndView("sql");
	}
	
	@RequestMapping(value="/getNosql", method = RequestMethod.GET)
	public ModelAndView getNosql(){
		
		System.out.println("inside getnosql");
		return new ModelAndView("nosql");
	}
	
	@RequestMapping(value="/getStorage", method = RequestMethod.GET)
	public ModelAndView getStorage(){
		
		System.out.println("inside storage");
		return new ModelAndView("storage");
	}
	
	@RequestMapping(value="/getIndex", method = RequestMethod.GET)
	public ModelAndView getIndex(){
		
		System.out.println("inside index");
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/getAppstatus", method = RequestMethod.GET)
	public ModelAndView getAppstatus(){
		
		System.out.println("inside getappstatus");
		return new ModelAndView("appstatus");
	}
	
	@RequestMapping(value="/getRegisterapp", method = RequestMethod.GET)
	public ModelAndView getRegisterapp(){
		
		System.out.println("inside getregisterapp");
		return new ModelAndView("registerapp");
	}
	
	@RequestMapping(value="/getViewapp", method = RequestMethod.GET)
	public ModelAndView getViewapp(){
		
		System.out.println("inside getviewapp");
		return new ModelAndView("viewapp");
	}
	
	@RequestMapping(value="/getEditapp", method = RequestMethod.GET)
	public ModelAndView getEditapp(){
		
		System.out.println("inside geteditapp");
		return new ModelAndView("editapp");
	}
	
	@RequestMapping(value="/getFlotchart", method = RequestMethod.GET)
	public ModelAndView getFlotchart(){
		
		System.out.println("inside getflotchart");
		return new ModelAndView("flot");
	}
	
	@RequestMapping(value="/getMorrischart", method = RequestMethod.GET)
	public ModelAndView getMorrischart(){
		
		System.out.println("inside getmorrischart");
		return new ModelAndView("morris");
	}
}