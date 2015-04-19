
package com.cloudigrate.facade;

import java.util.ArrayList;

/**
 * @author sumantmurke
 *
 */
public class MessageBody {

	public ArrayList<String> getEmailforSignup(String email){
		String Body = "Hello, "+email+ " Thank You for subscribing with us. Hope we prove useful to you and your organisation";
		String subject = "Thank you for registering with CloudIgrate";
		ArrayList<String> messagestructure = new ArrayList<String>();
		messagestructure.add(Body);
		messagestructure.add(subject);
		return messagestructure;

	}
	
public ArrayList<String> getEmailforAppCreation(String appname, String authkey){
	String Body = "Dear CloudIgrate user, you have registered "+appname+" with us. For making any API calls following is the authkey "+authkey+" Thank You for doing business with us.";
	String subject = "You have successfully create "+appname;
	ArrayList<String> messagestructure = new ArrayList<String>();
	messagestructure.add(Body);
	messagestructure.add(subject);
		return messagestructure;
	}
}
