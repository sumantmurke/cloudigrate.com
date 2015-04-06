package com.cloudigrate.facade;

import java.util.ArrayList;

import com.cloudigrate.dao.SqlConnection;
import com.cloudigrate.domain.Application;

public class ApplicationFacade {

	SqlConnection sqlConnection = new SqlConnection();
	public Application getApplication(int applicationId) {
		// TODO Auto-generated method stub
		return sqlConnection.getApplication(applicationId);
	}

	public Application createApplication(Application application) {
		// TODO Auto-generated method stub
		sqlConnection.createApplication(application);
		return null;
	}

	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		sqlConnection.updateApplication(application);
	}

	public ArrayList<Application> getAllApplications(int userId) {
		// TODO Auto-generated method stub
		return sqlConnection.getAllApplications(userId);
	}

}
