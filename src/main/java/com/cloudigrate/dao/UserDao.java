package com.cloudigrate.dao;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cloudigrate.domain.User;


public class UserDao extends JdbcDaoSupport implements UserDaoInt{ 
	
	final static Logger logger = Logger.getLogger(UserDao.class);
	
/*	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
 */
	
	private static String connectionString="jdbc:mysql://cloudserviceslab.cizvqwfgh78q.us-west-1.rds.amazonaws.com:3306/CloudIgrate";
	private static String dbUsername = "clouduser";
	private static String dbPassword = "clouduser";
	
	public void signup(User user){
		
		System.out.println("inside signup");
	//	logger.info("inside signup method : ");
	//	jdbcTemplate = new JdbcTemplate(dataSource);
	try{	
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	    Connection con = DriverManager.getConnection(connectionString, dbUsername, dbPassword);
	    Statement stmt = (Statement) con.createStatement();
		String query = "INSERT INTO users"+"(firstName, lastName, email, password, phone, creditCard, isAdmin) VALUES ('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getPhone()+"','"+user.getCreditCard()+"','"+user.getIsAdmin()+"')";
		
		  stmt.executeUpdate(query);
	        System.out.println("User Inserted successfully");
	        con.close();
		
	//	Object[] args = new Object[]{user.getFirstName(),user.getLastName(),user.getPassword(),user.getPhone(),user.getCreditCard()};
	/*	int out = jdbcTemplate.update(sql, args);
		
		System.out.println("After jdbc");
		
		if(out!=0){
			logger.info("User is successfully updated ");
		}else {
			logger.error("User was not added successfully");
		} */
		
	//	System.out.println(" "+args);
	//	System.out.println(" "+user.getCreditCard()+" "+user.getEmail()+" "+user.getFirstName()+user.getLastName()+user.getPassword()+user.getPhone());
	//	getJdbcTemplate().update(sql, args);
	}
	catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
	}
	
	
	
	
public boolean loginCheck(String username , String password){
	
	 String query;
	    boolean login = false;

	    try {
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        Connection con = DriverManager.getConnection(connectionString, dbUsername, dbPassword);
	        Statement stmt = (Statement) con.createStatement();
	        query = "SELECT email, password FROM users WHERE email='" + username + "' AND password='" + password + "';";
	        System.out.println("username"+username+"pwd"+password);
	        stmt.executeQuery(query);
	        ResultSet rs = stmt.getResultSet();
	        login = rs.first(); //rs.first();
	        con.close();
	    } catch (InstantiationException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	 
	return login;
	
	
}




/**
 * @param userdetails 
 * 
 */
public User getuserdetails(String userid) {
	// TODO Auto-generated method stub
	 String query;
	 String firstname, lastname,email, creditcard,phone;
	 User user = new User();
	  try {
	 
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        Connection con = DriverManager.getConnection(connectionString, dbUsername, dbPassword);
	        Statement stmt = (Statement) con.createStatement();
	        query = "SELECT * FROM users WHERE email='" + userid + "';";
	        System.out.println("username"+userid);
	        stmt.executeQuery(query);
	        ResultSet rs = stmt.getResultSet();
	        if ( rs.next() ) {
	        	firstname = rs.getString("firstName");
	        	lastname = rs.getString("lastName");
	        	email = rs.getString("email");
	        	creditcard = rs.getString("creditCard");
	        	phone = rs.getString("phone");
	        	user.setCreditCard(creditcard);
	        	user.setEmail(email);
	        	user.setFirstName(firstname);
	        	user.setLastName(lastname);
	        	user.setPhone(phone);
	        }
	        
	       
	        con.close();
	       
	    } catch (InstantiationException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	return user;
	 
}




/**
 * @param userUpdateProfile 
 * @throws SQLException 
 * 
 */
public void updateUserProfile(User user) throws SQLException {
	// TODO Auto-generated method stub
	String query;
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection(connectionString, dbUsername, dbPassword);
	    Statement stmt = (Statement) con.createStatement();
	    query = "UPDATE users SET firstName= '"+user.getFirstName() +"', lastName='"+ user.getLastName()+"', phone='"+ user.getPhone()+"', creditCard='"+user.getCreditCard() +"' WHERE email= '"+ user.getEmail()+"';";
	    System.out.println("email: "+user.getEmail());
        stmt.executeUpdate(query);
	    
        con.close();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}
	
	
}
