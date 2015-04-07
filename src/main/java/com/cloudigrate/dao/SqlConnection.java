package com.cloudigrate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cloudigrate.domain.Application;
import com.cloudigrate.domain.Key;
import com.mysql.jdbc.Statement;

public class SqlConnection {
	
	private static String connectionString = "jdbc:mysql://cloudserviceslab.cizvqwfgh78q.us-west-1.rds.amazonaws.com:3306/CloudIgrate";
	private static String dbUsername = "clouduser";
	private static String dbPassword = "clouduser";
	
	private Connection getConnection()
	{
		Connection connection = null;
		try {
			 
				Class.forName("com.mysql.jdbc.Driver");			
				connection = DriverManager.getConnection(connectionString, dbUsername ,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
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
			String query = "Select * from CloudIgrate.applications WHERE userId='"+ userId +"';";
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			allApplications = new ArrayList<Application>();
			Application application = null;
			 while ( resultSet.next() ) {
				 application = new Application();
				 application.setId(Integer.parseInt(resultSet.getString("id")));
				 application.setName(resultSet.getString("name"));
				 application.setPublisher(resultSet.getString("publisher"));
				 application.setDescription(resultSet.getString("description"));
				 application.setKeyId(resultSet.getInt("keyId"));
				 application.setOrganization(resultSet.getString("organization"));
				 application.setUserId(Integer.parseInt(resultSet.getString("userId")));
				 allApplications.add(application);
			 }			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return allApplications;
	}
	
	public Application getApplicationById(int id) {
		Connection connection = null;
		Application application =  null;
		try {
			connection = getConnection();
			Statement statement = null;
			statement = (Statement) connection.createStatement();
			String query = "Select * from CloudIgrate.applications WHERE userId='"+ id +"';";
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			application = new Application();
			application.setId(Integer.parseInt(resultSet.getString("id")));
			application.setName(resultSet.getString("name"));
			application.setDescription(resultSet.getString("description"));
			application.setKeyId(resultSet.getInt("keyId"));
			application.setOrganization(resultSet.getString("organization"));
			application.setUserId(Integer.parseInt(resultSet.getString("userId")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return application;
	}

	public Application getApplicationByName(String name) {
		Connection connection = null;
		Application application =  null;
		try {
			connection = getConnection();
			Statement statement = null;
			statement = (Statement) connection.createStatement();
			String query = "Select * from CloudIgrate.applications WHERE name='"+ name +"';";
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			if(resultSet.next()) {
				application = new Application();
				application.setId(Integer.parseInt(resultSet.getString("id")));
				application.setName(resultSet.getString("name"));
				application.setDescription(resultSet.getString("description"));
				application.setKeyId(resultSet.getInt("keyId"));
				application.setOrganization(resultSet.getString("organization"));
				application.setUserId(Integer.parseInt(resultSet.getString("userId")));
			}
			application = new Application();
			application.setId(Integer.parseInt(resultSet.getString("id")));
			application.setName(resultSet.getString("name"));
			application.setDescription(resultSet.getString("description"));
			application.setKeyId(resultSet.getInt("keyId"));
			application.setOrganization(resultSet.getString("organization"));
			application.setUserId(Integer.parseInt(resultSet.getString("userId")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return application;
	}
	
	public Application createApplication(Application application) {
		// TODO Auto-generated method stub
		Connection connection = null;
		connection = getConnection();
		Statement statement = null;
		Application newApplication = null;
		try {
			statement = (Statement) connection.createStatement();
		String query = "INSERT into CloudIgrate.applications (name, publisher, description, organization, keyId, userId) "
				+ "values ('"+application.getName()+"','"+application.getPublisher()+"','"+application.getDescription()+"','"+
				application.getOrganization()+"','"+application.getKeyId()+"','"+application.getUserId()+"')";
		System.out.println("CreateApp: "+query);
		statement.executeUpdate(query);
		newApplication = getApplicationByName(application.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return newApplication;
	}

	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		
		connection = getConnection();
		Statement statement = null;
		try {
			statement = (Statement) connection.createStatement();
		String query = "UPDATE CloudIgrate.applications SET name = '"+ application.getName() +"', publisher = '" + application.getPublisher() +"', description='" + 
				application.getDescription() + "', organization='"+ application.getOrganization() + 
				"' WHERE  id='"+ application.getId() +"';";
		System.out.println(query);
		statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public Key createKey(String applicationName, String keyValue) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		Statement statement = null;
		String status = "active";
		Key newKey = null;
		try {
			statement = (Statement) connection.createStatement();
		//String query = "INSERT into CloudIgrate.keys (keyValue, status, applicationName) values ('"+keyValue+"','"+status+"','"+applicationName+"');";
		String query = "INSERT INTO CloudIgrate.keys"
				+ "(keyValue, status, applicationName) " + "VALUES"
				+ "('"+ keyValue +"','"+status+"','"+applicationName+"')";
		
		System.out.println(query);
		statement.executeUpdate(query);
		newKey = getKeyByAppName(applicationName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return newKey;
	}

	public Key getKeyById(int keyId) {
		// TODO Auto-generated method stub
		Statement statement = null;
		Connection connection = null;
		Key key =  null;
		try {
			connection = getConnection();
			statement = (Statement) connection.createStatement();
			String query = "Select * from CloudIgrate.keys WHERE id='"+ keyId +"';";
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			if(resultSet.next()) {
				key = new Key();
				key.setId(Integer.parseInt(resultSet.getString("id")));
				key.setValue(resultSet.getString("keyValue"));
				key.setStatus(resultSet.getString("status"));
				key.setApplicationName(resultSet.getString("applicationName"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return key;
	}
	
	public Key getKeyByAppName(String applicationName) {
		// TODO Auto-generated method stub
		Statement statement = null;
		Connection connection = null;
		Key key =  null;
		try {
			connection = getConnection();
			statement = (Statement) connection.createStatement();
			String query = "Select * from CloudIgrate.keys WHERE applicationName='"+ applicationName +"'";
			System.out.println(query);
			statement.executeQuery(query);
			ResultSet resultSet = statement.getResultSet();
			key = new Key();
			while (resultSet.next()) {
				key.setId(Integer.parseInt(resultSet.getString("id")));
				key.setValue(resultSet.getString("keyValue"));
				key.setStatus(resultSet.getString("status"));
				key.setApplicationName(resultSet.getString("applicationName"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return key;
	}
	
	
}
