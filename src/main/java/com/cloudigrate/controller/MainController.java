package com.cloudigrate.controller;


import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.domain.CloudService;
import com.cloudigrate.facade.DashboardFacade;
import com.cloudigrate.facade.UserFacade;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
//@RequestMapping("/movie")
public class MainController {
/*
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", name);
		return "list";
	}
	*/
	
	DashboardFacade dashboardFacade = new DashboardFacade();
	
	@RequestMapping(value="/getInstance", method = RequestMethod.GET)
	public ModelAndView getInstance(){
		
		/*
		 * Try for database
		 */

		
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
		
		
		System.out.println("inside Main controller - getIndex()");
		//Application application = applicationFacade.getApplication(Integer.parseInt(applicationId));
		String serviceAverageData = dashboardFacade.getServiceAverageDashboardData();
		JSONObject serviceAverageDataObj = new JSONObject(serviceAverageData);
		int serviceAverage[] = new int[3];
		serviceAverage[0] = serviceAverageDataObj.getInt("storage");
		serviceAverage[1] = serviceAverageDataObj.getInt("sql");
		serviceAverage[2] = serviceAverageDataObj.getInt("nosql");
		System.out.println("Testing String to JSON: "+serviceAverage[1]);
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		//model.addObject("serviceAverageData", serviceAverageData);
		model.addObject("storageServiceAverage", serviceAverage[0]);
		model.addObject("sqlServiceAverage", serviceAverage[1]);
		model.addObject("nosqlServiceAverage", serviceAverage[2]);
		
		ArrayList<CloudService> serviceCountList = new ArrayList<CloudService>();
		serviceCountList = dashboardFacade.getServiceCountDashboardData();
		ObjectMapper objMapper = new ObjectMapper();
		String jsonServiceCountList=null;;
		try {
			jsonServiceCountList = objMapper.writeValueAsString(serviceCountList);
			System.out.println("Testing Service Count List: "+jsonServiceCountList.toString());
			model.addObject("jsonServiceCountList", jsonServiceCountList.toString());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<CloudService> levelCountList = dashboardFacade.getLevelCountDashboardData();		
		ObjectMapper levelObjMapper = new ObjectMapper();		
		try {
			String jsonLevelCountList = levelObjMapper.writeValueAsString(levelCountList);
			System.out.println("Testing Service Count List: "+jsonLevelCountList.toString());
			model.addObject("jsonLevelCountList", jsonLevelCountList.toString());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
		
		/*System.out.println("inside index");
		return new ModelAndView("index");*/
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
	
	/*@RequestMapping(value="/getViewapp", method = RequestMethod.GET)
	public ModelAndView getViewapp(){
		
		System.out.println("inside getviewapp");
		return new ModelAndView("viewapp");
	}*/
	
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
	
	@RequestMapping(value="/getUserprofile", method = RequestMethod.GET)
	public ModelAndView getUserprofile(){
		
		System.out.println("inside getuserprofile");
		return new ModelAndView("userprofile");
	}
	
	@RequestMapping(value="/getHome", method = RequestMethod.GET)
	public ModelAndView getHome(){
		
		System.out.println("inside gethome");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/getLogin", method = RequestMethod.GET)
	public ModelAndView getLogin(){
		
		System.out.println("inside getlogin");
		return new ModelAndView("login");
	}	
	
	@RequestMapping(value="/getSignup", method = RequestMethod.GET)
	public ModelAndView getSignup(){
		
		System.out.println("inside getsignup");
		return new ModelAndView("signup");
	}
	
	@RequestMapping(value="/getAdmindashboard", method = RequestMethod.GET)
	public ModelAndView getAdmindashboard(){
		
		System.out.println("inside getadmindashboard");
		return new ModelAndView("admindashboard");
	}
	
	@RequestMapping(value="/getAdminsettings", method = RequestMethod.GET)
	public ModelAndView getAdminsettings(){
		
		System.out.println("inside getadminsettings");
		return new ModelAndView("adminsettings");
	}
	
	@RequestMapping(value="/getAdminprofile", method = RequestMethod.GET)
	public ModelAndView getAdminprofile(){
		
		System.out.println("inside getadminprofile");
		return new ModelAndView("adminprofile");
	}
}