/**
 * 
 */
package com.cloudigrate.facade;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;



/**
 * @author sumantmurke
 *
 */
public class SimpleEmailService {
	
		String FROM = "sumantmurke@gmail.com";  // Replace with your "From" address. This address must be verified.
	    String TO = null; // Replace with a "To" address. If you have not yet requested
	                                                      // production access, this address must be verified.
	    String BODY = null;
	    String SUBJECT = null;
	    
	    public void setConnec(String email, String message, String subjecttosend){
	    	
	    	System.out.println("inside setConnec");
	    	AWSCredentials myCredentials = new BasicAWSCredentials(SesConfig.getMyAccessId(), SesConfig.getMySecretId());
	    	
	    	
	    	TO = email;
	    	BODY = message;
	    	SUBJECT = subjecttosend;
	    	
	    	Destination destination = new Destination().withToAddresses(new String[]{TO});
	    	Content subject = new Content().withData(SUBJECT);
	        Content textBody = new Content().withData(BODY); 
	        Body body = new Body().withText(textBody);
	        Message msg = new Message().withSubject(subject).withBody(body);
	        
	        SendEmailRequest request = new SendEmailRequest().withSource(FROM).withDestination(destination).withMessage(msg);
	     
	        
	        try
	        {  
	        System.out.println("Attempting to send an email through Amazon SES ");
	        
            // Instantiate an Amazon SES client, which will make the service call with the supplied AWS credentials.
            AmazonSimpleEmailServiceClient client = new AmazonSimpleEmailServiceClient(myCredentials);
            
            System.out.println("after connecting to ses client and before defining REGION variable as US_WEST_2");
    
            Region REGION = Region.getRegion(Regions.US_WEST_2);
            
            System.out.println("before setting the region");
            client.setRegion(REGION);
            
            System.out.println("before sending the email");
       
            // Send the email.
            client.sendEmail(request);  
            System.out.println("Email sent!");
	    	
	        }
	        catch (Exception ex) 
	        {
	            System.out.println("The email was not sent.");
	            System.out.println("Error message: " + ex.getMessage());
	        }
	    	
	    }

}
