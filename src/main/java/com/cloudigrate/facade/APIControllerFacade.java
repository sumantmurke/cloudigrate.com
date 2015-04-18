/**
 * 
 */
package com.cloudigrate.facade;

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
	
	
	public  JSONObject getStorageAPI() throws  IOException, ParseException {
		// TODO Auto-generated method stub
		
	FileReader filereader = new FileReader("/Users/sumantmurke/Documents/documents-export-2015-04-17/Storage-create_bucket.json");
	 Object obj = parser.parse(filereader);
	 JSONObject jsonObject = (JSONObject) obj;
	
	 
	 
	return jsonObject;
			}
}
