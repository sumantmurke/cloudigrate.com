package com.cloudigrate.facade;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

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

	public Application createApplication(Application application, String email) {
		// TODO Auto-generated method stub
		Key newKey = keyFacade.createNewKey(application.getName());
		application.setKeyValue(newKey.getValue());
		application.setKeyId(newKey.getId());
		System.out.println("Testing key: "+application.getKeyId());
		Application newApplication = sqlConnection.createApplication(application);
		
		System.out.println("Testing key value: "+newKey.getEncodedValue());
		newApplication.setKeyValue(newKey.getEncodedValue());
		// email to application creation
		MessageBody messagebody = new MessageBody();
		ArrayList<String> message = messagebody.getEmailforAppCreation(application.getName(), newKey.getEncodedValue());
		SimpleEmailService ses = new SimpleEmailService();
		System.out.println("email will be sent to" +email);
		ses.setConnec(email, message.get(0), message.get(1));
		return newApplication;
	}

	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		sqlConnection.updateApplication(application);
	}

	public ArrayList<Application> getAllApplications(int userId) {
		// TODO Auto-generated method stub
		System.out.println("Testing getAllApplications: id= "+userId);
		ArrayList<Application> allApplications = sqlConnection.getAllApplications(userId);
		Key key = null;
		for(Application application : allApplications)
		{
			key = sqlConnection.getKeyById(application.getKeyId());
			application.setKeyValue(key.getEncodedValue());
		}
		return allApplications;
	}

}
