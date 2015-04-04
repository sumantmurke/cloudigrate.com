package com.cloudigrate.facade;

import com.cloudigrate.dao.SqlConnection;
import com.cloudigrate.domain.Application;

public class ApplicationFacade {

	SqlConnection sqlConnection = new SqlConnection();
	public Application getApplication() {
		// TODO Auto-generated method stub
		sqlConnection.getApplication();
		return null;
	}

	public Application createApplication() {
		// TODO Auto-generated method stub
		sqlConnection.createApplication();
		return null;
	}

	public Application updateApplication() {
		// TODO Auto-generated method stub
		sqlConnection.updateApplication();
		return null;
	}

}
