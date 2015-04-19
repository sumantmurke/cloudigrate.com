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
	public ModelAndView getStorage() throws IOException, ParseException{

		ModelAndView model = new ModelAndView();
		System.out.println(" before storage controller");
		JSONObject createbucket = apicontrollerfacade.getStorageAPICreateBucket();
		JSONObject deletebucket = apicontrollerfacade.getStorageAPIDeleteobject();
		JSONObject downloadbucket = apicontrollerfacade.getStorageAPIDownloadobject();
		JSONObject uploadbucket = apicontrollerfacade.getStorageAPIUploadobject();
		System.out.println("inside api storage cntroller");
		model.setViewName("storage");
		model.addObject("StorageAPI", createbucket);
		model.addObject("deletebucket", deletebucket);
		model.addObject("downloadbucket", downloadbucket);
		model.addObject("uploadbucket", uploadbucket);
		System.out.println("after model storage api");
		return model;
	}


	@RequestMapping(value="/nosql", method = RequestMethod.GET)
	public ModelAndView getNOSQL() throws IOException, ParseException{
		ModelAndView model = new ModelAndView();
		JSONObject getitem = apicontrollerfacade.getNosqlAPIGetItem();
		JSONObject insertitem  = apicontrollerfacade.getNosqlAPIInsertItem();
		model.setViewName("nosql");
		model.addObject("getitem", getitem);
		model.addObject("insertitem", insertitem);
		System.out.println("get item "+getitem.toString());
		return model;
	}
	
	@RequestMapping(value="/sql", method = RequestMethod.GET)
	public ModelAndView getSQL() throws IOException, ParseException{
		ModelAndView model = new ModelAndView();
		JSONObject getpassword = apicontrollerfacade.getSqlAPIGetPassword();
		JSONObject getusername  = apicontrollerfacade.getSqlAPIGetUsername();
		JSONObject getconnectionstring  = apicontrollerfacade.getSqlAPIGetConnectionString();
		model.setViewName("sql");
		model.addObject("getpassword", getpassword);
		model.addObject("getusername", getusername);
		model.addObject("getconnectionstring", getconnectionstring);
		//System.out.println("get item "+getitem.toString());
		return model;
	}
	
	
	@RequestMapping(value="/instanceAPI", method = RequestMethod.GET)
	public ModelAndView getInstanceAPI() throws IOException, ParseException{
		ModelAndView model = new ModelAndView();
		JSONObject createvm = apicontrollerfacade.getInstanceCreateAPI();
		JSONObject stopvm  = apicontrollerfacade.getInstanceStopAPI();
		JSONObject terminatevm  = apicontrollerfacade.getInstanceTerminate();
		model.setViewName("instance");
		model.addObject("createvm", createvm);
		model.addObject("stopvm", stopvm);
		model.addObject("terminatevm", terminatevm);
		//System.out.println("get item "+getitem.toString());
		return model;
	}
	
	
	
	
}
