package com.cloudigrate.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudigrate.domain.Application;
import com.cloudigrate.facade.ApplicationFacade;
import com.cloudigrate.facade.DashboardFacade;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

@Controller
public class DashboardController {

	DashboardFacade dashboardFacade = new DashboardFacade();

	@RequestMapping(value="/getBillingChart", method = RequestMethod.GET)
	public ModelAndView getBillingDashboardData(){
		
		System.out.println("inside dashboard controller");
		//Application application = applicationFacade.getApplication(Integer.parseInt(applicationId));
		String billingDashboardResult[] = dashboardFacade.getBillingDashboardData();
		System.out.println("Controller: "+billingDashboardResult[0]);
		ModelAndView model = new ModelAndView();
		model.setViewName("flot");
		model.addObject("serviceCostData", billingDashboardResult[0]);
		model.addObject("serviceRateData", billingDashboardResult[1]);
		model.addObject("totalCloudUsageCost", billingDashboardResult[2]);
		
		return model;
	}
	
	@RequestMapping(value="/getPerformanceChart", method = RequestMethod.GET)
	public ModelAndView getPerformanceChartData(){
		
		System.out.println("inside dashboard controller - performance");
		//Application application = applicationFacade.getApplication(Integer.parseInt(applicationId));
		String storagePerformanceData = dashboardFacade.getStoragePerformanceChartData();
		System.out.println("Controller: "+storagePerformanceData);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("morris");
		model.addObject("storagePerformanceData", storagePerformanceData);
		
		return model;
	}
	
	@RequestMapping(value="/getPerformanceDashboardData", method = RequestMethod.GET)
	public ModelAndView getPerformanceDashboardData(){
		
		System.out.println("inside dashboard controller - performance dashboard");
		//Application application = applicationFacade.getApplication(Integer.parseInt(applicationId));
		String serviceAverageData = dashboardFacade.getServiceAverageDashboardData();
		System.out.println("Controller: "+serviceAverageData);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("serviceAverageData", serviceAverageData);
		
		return model;
	}
	
}
