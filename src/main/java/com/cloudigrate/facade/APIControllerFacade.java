/**
 * 
 */
package com.cloudigrate.facade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author sumantmurke
 *
 */
public class APIControllerFacade {

	
		JSONParser parser = new JSONParser();
	
	
	public  JSONObject getStorageAPICreateBucket() throws  IOException, ParseException {
		// TODO Auto-generated method stub
		
	FileReader createbucketfile = new FileReader("/Users/sumantmurke/Documents/documents-export-2015-04-17/Storage-create_bucket.json");
	
	
	
	 Object obj = parser.parse(createbucketfile);
	 JSONObject jsonObject = (JSONObject) obj;
	
	 
	 
	return jsonObject;
			}


	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * 
	 */
	public JSONObject getStorageAPIDeleteobject() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader deleteobjectfile = new FileReader("/Users/sumantmurke/Documents/documents-export-2015-04-17/Storage-delete_object.json");
		 Object obj = parser.parse(deleteobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 
		 
		return jsonObject;
	}


	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * 
	 */
	public JSONObject getStorageAPIDownloadobject() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader downloadobjectfile = new FileReader("/Users/sumantmurke/Documents/documents-export-2015-04-17/Storage-download_object.json");
		 Object obj = parser.parse(downloadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 
		 
		return jsonObject;
	}


	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * 
	 */
	public JSONObject getStorageAPIUploadobject() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader("/Users/sumantmurke/Documents/documents-export-2015-04-17/Storage-upload_object.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 
		 
		return jsonObject;
	}


	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * 
	 */
	public JSONObject getNosqlAPIGetItem() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader("/Users/sumantmurke/Documents/NoSQL JSONs/NoSql-get_item.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}


	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * 
	 */
	public JSONObject getNosqlAPIInsertItem() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader("/Users/sumantmurke/Documents/NoSQL JSONs/NoSql-insert_item.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}


	/**
	 * @return
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public JSONObject getSqlAPIGetPassword() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader("/Users/sumantmurke/Documents/SQL-JSONs/SQL-GetPassword.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
		
	}


	/**
	 * @return
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public JSONObject getSqlAPIGetUsername() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader("/Users/sumantmurke/Documents/SQL-JSONs/SQL-GetUsername.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
		
	}


	/**
	 * @return
	 */
	public JSONObject getSqlAPIGetConnectionString() throws IOException, ParseException{
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader("/Users/sumantmurke/Documents/SQL-JSONs/SQL_GetConnectionString.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}
}
