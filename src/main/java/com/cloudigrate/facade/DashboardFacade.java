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
	
	public String getServiceAverageDashboardData(String user) {
		return dashboardDao.getServiceAverageDashboardData(user);
	}
	
	public ArrayList<CloudService> getServiceCountDashboardData(String user) {
		return dashboardDao.getServiceCountDashboardData(user);
	}
	
	public ArrayList<CloudService> getLevelCountDashboardData(String user) {
		return dashboardDao.getLevelCountDashboardData(user);
	}
	
	/*
	 * Admin dashboard functions
	 */
	public String getAdminServiceAverageDashboardData() {
		return dashboardDao.getAdminServiceAverageDashboardData();
	}
	
	public ArrayList<CloudService> getAdminServiceCountDashboardData() {
		return dashboardDao.getAdminServiceCountDashboardData();
	}
	
	public ArrayList<CloudService> getAdminLevelCountDashboardData() {
		return dashboardDao.getAdminLevelCountDashboardData();
	}
}
