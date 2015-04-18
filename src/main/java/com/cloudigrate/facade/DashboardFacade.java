package com.cloudigrate.facade;

import java.util.ArrayList;

import com.cloudigrate.dao.DashboardDao;
import com.cloudigrate.domain.CloudService;

public class DashboardFacade {
	
	DashboardDao dashboardDao = new DashboardDao();
	
	
	public String[] getBillingDashboardData() {
		return dashboardDao.getBillingDashboardData();
		
	}
	
	public String getStoragePerformanceChartData() {
		return dashboardDao.getStoragePerformanceChartData();
	}
	
	public String getServiceAverageDashboardData() {
		return dashboardDao.getServiceAverageDashboardData();
	}
	
	public ArrayList<CloudService> getServiceCountDashboardData() {
		return dashboardDao.getServiceCountDashboardData();
	}
	
	public ArrayList<CloudService> getLevelCountDashboardData() {
		return dashboardDao.getLevelCountDashboardData();
	}
}
