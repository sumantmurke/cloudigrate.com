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
		String jsonPath = "/tmp/jsons/";
	
	public  JSONObject getStorageAPICreateBucket() throws  IOException, ParseException {
		// TODO Auto-generated method stub
		
	FileReader createbucketfile = new FileReader(jsonPath+"Storage-create_bucket.json");
	
	
	
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
		FileReader deleteobjectfile = new FileReader(jsonPath+"Storage-delete_object.json");
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
		FileReader downloadobjectfile = new FileReader(jsonPath+"Storage-download_object.json");
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
		FileReader uploadobjectfile = new FileReader(jsonPath+"Storage-upload_object.json");
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
		FileReader uploadobjectfile = new FileReader(jsonPath+"NoSql-get_item.json");
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
		FileReader uploadobjectfile = new FileReader(jsonPath+"NoSql-insert_item.json");
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
		FileReader uploadobjectfile = new FileReader(jsonPath+"SQL-GetPassword.json");
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
		FileReader uploadobjectfile = new FileReader(jsonPath+"SQL-GetUsername.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
		
	}


	/**
	 * @return
	 */
	public JSONObject getSqlAPIGetConnectionString() throws IOException, ParseException{
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader(jsonPath+"SQL_GetConnectionString.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}


	/**
	 * @return
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public JSONObject getInstanceCreateAPI() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader(jsonPath+"create_vm.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}


	/**
	 * @return
	 */
	public JSONObject getInstanceStopAPI() throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader(jsonPath+"stop_vm.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}


	/**
	 * @return
	 */
	public JSONObject getInstanceTerminate()  throws IOException, ParseException{
		// TODO Auto-generated method stub
		FileReader uploadobjectfile = new FileReader(jsonPath+"terminate.json");
		 Object obj = parser.parse(uploadobjectfile);
		 JSONObject jsonObject = (JSONObject) obj;
		
		 return jsonObject;
	}
}
