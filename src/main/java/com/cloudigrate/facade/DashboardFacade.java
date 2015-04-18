package com.cloudigrate.facade;

import com.cloudigrate.dao.DashboardDao;

public class DashboardFacade {
	
	DashboardDao dashboardDao = new DashboardDao();
	
	
	public String[] getBillingDashboardData() {
		return dashboardDao.getBillingDashboardData();
		
	}
	
	public String getStoragePerformanceChartData() {
		return dashboardDao.getStoragePerformanceChartData();
	}
}
