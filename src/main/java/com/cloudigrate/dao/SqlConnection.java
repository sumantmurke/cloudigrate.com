package com.cloudigrate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cloudigrate.domain.Application;
import com.mysql.jdbc.Statement;

public class SqlConnection {
	
	private static String connectionString = "jdbc:mysql://cloudserviceslab.cizvqwfgh78q.us-west-1.rds.amazonaws.com:3306/CloudIgrate";
	private static String dbUsername = "clouduser";
	private static String dbPassword = "clouduser";
	
	private Connection getConnection()
	{
		Connection connection = null;
		try {
			 connection = DriverManager.getConnection(connectionString, dbUsername ,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public ArrayList<Application> getAllApplications(int userId)
	{
		Connection connection = null;
		ArrayList<Application> allApplications =  null;
		try {
			connection = getConnection();
			Statement statement = null;
			statement = (Statement) connection.createStatement();
			String query = "Select * from application WHERE userId='"+ userId +"';";
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			allApplications = new ArrayList<Application>();
			Application application = null;
			 if ( resultSet.next() ) {
				 application = new Application();
				 application.setId(Integer.parseInt(resultSet.getString("id")));
				 application.setName(resultSet.getString("name"));
				 application.setDescription(resultSet.getString("description"));
				 application.setKeyId(resultSet.getString("keyId"));
				 application.setOrganization(resultSet.getString("organization"));
				 application.setUserId(Integer.parseInt(resultSet.getString("userId")));
				 
				 allApplications.add(application);
			 }			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allApplications;
	}
	
	public Application getApplication(int id) {
		Connection connection = null;
		Application application =  null;
		try {
			connection = getConnection();
			Statement statement = null;
			statement = (Statement) connection.createStatement();
			String query = "Select * from application WHERE userId='"+ id +"';";
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			application = new Application();
			application.setId(Integer.parseInt(resultSet.getString("id")));
			application.setName(resultSet.getString("name"));
			application.setDescription(resultSet.getString("description"));
			application.setKeyId(resultSet.getString("keyId"));
			application.setOrganization(resultSet.getString("organization"));
			application.setUserId(Integer.parseInt(resultSet.getString("userId")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return application;
	}

	public void createApplication(Application application) {
		// TODO Auto-generated method stub
		Connection connection = null;
		
		connection = getConnection();
		Statement statement = null;
		try {
			statement = (Statement) connection.createStatement();
		String query = "INSERT into application (name, publisher, description, organization, keyId, userId) "
				+ "values ('"+application.getName()+"','"+application.getPublisher()+"','"+application.getDescription()+"','"+
				application.getOrganization()+"','"+application.getKeyId()+"','"+application.getUserId()+"')";
		statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		
Connection connection = null;
		
		connection = getConnection();
		Statement statement = null;
		try {
			statement = (Statement) connection.createStatement();
		String query = "UPDATE application SET name = '"+ application.getName() +"', publisher = '" + application.getPublisher() +"', description='" + 
				application.getDescription() + "', organization='"+ application.getOrganization() +"', keyId='" + application.getKeyId() + 
				"', userId= '" + application.getUserId() + "' WHERE  id='"+ application.getId() +"';";
		statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
