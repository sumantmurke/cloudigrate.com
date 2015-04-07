package com.cloudigrate.domain;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;

public class Key {
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	
	public String getEncodedValue()
	{
		return encodeKey(value);
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
		int id;
		String value;
		String status;
		String applicationName;
		
	public static String generateNextKey()
	{
		String uuid = UUID.randomUUID().toString();
		uuid.replace("-", "");
		return uuid;
	}
	
	public static String encodeKey(String key)
	{
		// encode data on your side using BASE64
		byte[]   bytesEncoded = Base64.encodeBase64(key.getBytes());
		System.out.println("ecncoded value is " + new String(bytesEncoded ));
		return new String(bytesEncoded );
	}
	

	public static String decodeKey(String encodedKey)
	{
		// Decode data on other side, by processing encoded data
		byte[] valueDecoded= Base64.decodeBase64(encodedKey);
		System.out.println("Decoded value is " + new String(valueDecoded));
		return new String(valueDecoded);
	}
}
