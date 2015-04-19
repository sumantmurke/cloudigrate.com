package com.cloudigrate.dao;

import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.cloudigrate.domain.CloudService;

public class DashboardDao {

	public String[] getBillingDashboardData() {

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("http://localhost:8081/cloudigrate-api/user/dashboard/billing", String.class);
		System.out.println("result: "+result);
		//Rough work
		String res[] = new String[3];
		res = result.split("#");
		
		System.out.println("res[0]: "+res[0]);
		System.out.println("res[1]: "+res[1]);
		System.out.println("res[2]: "+res[2]);
		
		return res;
	}
	
	public String getStoragePerformanceChartData() {

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("http://localhost:8081/cloudigrate-api/user/dashboard/service/storage", String.class);
		System.out.println("Storage result: "+result);
		
		return result;
	}
	
	public String getServiceAverageDashboardData(String user) {

		RestTemplate serviceAverageRestTemplate = new RestTemplate();
		String serviceAverageData = serviceAverageRestTemplate.getForObject("http://localhost:8081/cloudigrate-api/user/dashboard/serviceaverage?userName="+user, String.class);
		System.out.println("Service Average result: "+serviceAverageData);
		return serviceAverageData;
	}
	
	public ArrayList<CloudService> getServiceCountDashboardData(String user) {
		ArrayList<CloudService> serviceList = new ArrayList<CloudService>();
		
		RestTemplate serviceCountRestTemplate = new RestTemplate();
		String serviceCountData = serviceCountRestTemplate.getForObject("http://localhost:8081/cloudigrate-api/user/dashboard/servicecount?userName="+user, String.class);
		System.out.println("Service Count result: "+serviceCountData);
		
		JSONObject obj = new JSONObject(serviceCountData);
		serviceList.add(new CloudService("storage",obj.getInt("storage")));
		serviceList.add(new CloudService("sql",obj.getInt("sql")));
		serviceList.add(new CloudService("nosql",obj.getInt("nosql")));
		serviceList.add(new CloudService("instance",obj.getInt("instance")));
		
		return serviceList;
	}
	
	public ArrayList<CloudService> getLevelCountDashboardData(String user) {
		ArrayList<CloudService> levelList = new ArrayList<CloudService>();
		
		RestTemplate levelCountRestTemplate = new RestTemplate();
		String levelCountData = levelCountRestTemplate.getForObject("http://localhost:8081/cloudigrate-api/user/dashboard/levelcount?userName="+user, String.class);
		System.out.println("Level Count result: "+levelCountData);
		
		JSONObject obj = new JSONObject(levelCountData);
		levelList.add(new CloudService("PaaS",obj.getInt("PaaS")));
		levelList.add(new CloudService("SaaS",obj.getInt("SaaS")));
		levelList.add(new CloudService("IaaS",obj.getInt("IaaS")));
		
		return levelList;
	}
}
