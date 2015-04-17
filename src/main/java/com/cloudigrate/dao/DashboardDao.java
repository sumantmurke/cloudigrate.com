package com.cloudigrate.dao;

import org.springframework.web.client.RestTemplate;

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
}
