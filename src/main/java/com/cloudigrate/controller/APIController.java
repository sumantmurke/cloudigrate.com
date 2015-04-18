/**
 * 
 */
package com.cloudigrate.controller;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.facade.APIControllerFacade;

/**
 * @author sumantmurke
 *
 */
@Controller
public class APIController {

	APIControllerFacade apicontrollerfacade = new APIControllerFacade();

	@RequestMapping(value="/storageAPI", method = RequestMethod.GET)
	public ModelAndView getInstance() throws IOException, ParseException{

		ModelAndView model = new ModelAndView();
		System.out.println(" before storage controller");
		JSONObject storageapi = apicontrollerfacade.getStorageAPI();
		System.out.println("inside api storage cntroller");
		model.setViewName("storage");
		model.addObject("StorageAPI", storageapi);
		System.out.println("after model storage api");
		return model;
	}

}
