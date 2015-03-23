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
	
}