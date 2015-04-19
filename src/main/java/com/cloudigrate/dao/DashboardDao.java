package com.cloudigrate.dao;

import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.cloudigrate.domain.AdminPreference;
import com.cloudigrate.domain.CloudService;
import com.cloudigrate.domain.HostConfig;

public class DashboardDao {

	public String[] getBillingDashboardData() {

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(HostConfig.getHostKey()+"user/dashboard/billing", String.class);
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
		String result = restTemplate.getForObject(HostConfig.getHostKey()+"user/dashboard/service/storage", String.class);
		System.out.println("Storage result: "+result);
		
		return result;
	}
	
	public String getServiceAverageDashboardData(String user) {

		RestTemplate serviceAverageRestTemplate = new RestTemplate();
		String serviceAverageData = serviceAverageRestTemplate.getForObject(HostConfig.getHostKey()+"user/dashboard/serviceaverage?userName="+user, String.class);
		System.out.println("Service Average result: "+serviceAverageData);
		return serviceAverageData;
	}
	
	public ArrayList<CloudService> getServiceCountDashboardData(String user) {
		ArrayList<CloudService> serviceList = new ArrayList<CloudService>();
		
		RestTemplate serviceCountRestTemplate = new RestTemplate();
		String serviceCountData = serviceCountRestTemplate.getForObject(HostConfig.getHostKey()+"user/dashboard/servicecount?userName="+user, String.class);
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
		String levelCountData = levelCountRestTemplate.getForObject(HostConfig.getHostKey()+"user/dashboard/levelcount?userName="+user, String.class);
		System.out.println("Level Count result: "+levelCountData);
		
		JSONObject obj = new JSONObject(levelCountData);
		levelList.add(new CloudService("PaaS",obj.getInt("PaaS")));
		levelList.add(new CloudService("SaaS",obj.getInt("SaaS")));
		levelList.add(new CloudService("IaaS",obj.getInt("IaaS")));
		
		return levelList;
	}
	
	public String getAdminServiceAverageDashboardData() {

		RestTemplate serviceAverageRestTemplate = new RestTemplate();
		String serviceAverageData = serviceAverageRestTemplate.getForObject(HostConfig.getHostKey()+"admin/dashboard/serviceaverage", String.class);
		System.out.println("Service Average result: "+serviceAverageData);
		return serviceAverageData;
	}
	
	public ArrayList<CloudService> getAdminServiceCountDashboardData() {
		ArrayList<CloudService> serviceList = new ArrayList<CloudService>();
		
		RestTemplate serviceCountRestTemplate = new RestTemplate();
		String serviceCountData = serviceCountRestTemplate.getForObject(HostConfig.getHostKey()+"admin/dashboard/servicecount", String.class);
		System.out.println("Service Count result: "+serviceCountData);
		
		JSONObject obj = new JSONObject(serviceCountData);
		serviceList.add(new CloudService("storage",obj.getInt("storage")));
		serviceList.add(new CloudService("sql",obj.getInt("sql")));
		serviceList.add(new CloudService("nosql",obj.getInt("nosql")));
		serviceList.add(new CloudService("instance",obj.getInt("instance")));
		
		return serviceList;
	}
	
	public ArrayList<CloudService> getAdminLevelCountDashboardData() {
		ArrayList<CloudService> levelList = new ArrayList<CloudService>();
		
		RestTemplate levelCountRestTemplate = new RestTemplate();
		String levelCountData = levelCountRestTemplate.getForObject(HostConfig.getHostKey()+"admin/dashboard/levelcount", String.class);
		System.out.println("Level Count result: "+levelCountData);
		
		JSONObject obj = new JSONObject(levelCountData);
		levelList.add(new CloudService("PaaS",obj.getInt("PaaS")));
		levelList.add(new CloudService("SaaS",obj.getInt("SaaS")));
		levelList.add(new CloudService("IaaS",obj.getInt("IaaS")));
		
		return levelList;
	}

	public void updatePreference(AdminPreference adminPreference) {
		
		RestTemplate levelCountRestTemplate = null;
		String message = null;
		// TODO Auto-generated method stub instance
		levelCountRestTemplate = new RestTemplate();
		message = levelCountRestTemplate.postForObject(HostConfig.getHostKey()+"admin/platform?level=sql&value="+ adminPreference.getSql_value(),null ,String.class);
		System.out.println("Message: "+ message);

		// TODO Auto-generated method stub instance
		levelCountRestTemplate = new RestTemplate();
		message = levelCountRestTemplate.postForObject(HostConfig.getHostKey()+"admin/platform?level=nosql"+ adminPreference.getNosql_value(),null, String.class);
		System.out.println("Message: "+ message);

		// TODO Auto-generated method stub instance
		levelCountRestTemplate = new RestTemplate();
		message = levelCountRestTemplate.postForObject(HostConfig.getHostKey()+"admin/platform?level=instance" + adminPreference.getInstance_value(),null, String.class);
		System.out.println("Message: "+ message);

		// TODO Auto-generated method stub instance
		levelCountRestTemplate = new RestTemplate();
		message = levelCountRestTemplate.postForObject(HostConfig.getHostKey()+"admin/platform?level=storage" + adminPreference.getStorage_value(),null, String.class);
		System.out.println("Message: "+ message);
	}

	public AdminPreference getPreference() {
		RestTemplate levelCountRestTemplate = new RestTemplate();
		String preferenceData = levelCountRestTemplate.getForObject(HostConfig.getHostKey()+"admin/platform", String.class);
		System.out.println("preferenceData: "+preferenceData);
		AdminPreference adminPreference = new AdminPreference();
		JSONObject obj = new JSONObject(preferenceData);
		adminPreference.setInstance_value(obj.getString("instance"));
		adminPreference.setNosql_value(obj.getString("nosql"));
		adminPreference.setSql_value(obj.getString("sql"));
		adminPreference.setStorage_value(obj.getString("storage"));
		
		return adminPreference;
	}
}
