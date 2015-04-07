package com.cloudigrate.facade;

import java.util.ArrayList;

import com.cloudigrate.dao.SqlConnection;
import com.cloudigrate.domain.Application;
import com.cloudigrate.domain.Key;

public class ApplicationFacade {

	SqlConnection sqlConnection = new SqlConnection();
	KeyFacade keyFacade = new KeyFacade();
	
	public Application getApplication(int applicationId) {
		// TODO Auto-generated method stub
		return sqlConnection.getApplicationById(applicationId);
	}

	public Application createApplication(Application application) {
		// TODO Auto-generated method stub
		Application newApplication = sqlConnection.createApplication(application);
		Key newKey = keyFacade.createNewKey(newApplication.getName());
		newApplication.setKeyValue(newKey.getEncodedValue());
		return newApplication;
	}

	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		sqlConnection.updateApplication(application);
	}

	public ArrayList<Application> getAllApplications(int userId) {
		// TODO Auto-generated method stub
		ArrayList<Application> allApplications = sqlConnection.getAllApplications(userId);
		Key key = null;
		for(Application application : allApplications)
		{
			key = sqlConnection.getKeyById(Integer.parseInt(application.getKeyId()));
			application.setKeyValue(key.getEncodedValue());
		}
		return allApplications;
	}

}
