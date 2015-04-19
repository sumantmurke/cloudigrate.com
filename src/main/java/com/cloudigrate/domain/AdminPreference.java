package com.cloudigrate.domain;

import javax.ws.rs.FormParam;

public class AdminPreference {
	
	String instance_value;
	String sql_value;
	String nosql_value;
	String storage_value;
	public String getInstance_value() {
		return instance_value;
	}
	public void setInstance_value(String instance_value) {
		this.instance_value = instance_value;
	}
	public String getSql_value() {
		return sql_value;
	}
	public void setSql_value(String sql_value) {
		this.sql_value = sql_value;
	}
	public String getNosql_value() {
		return nosql_value;
	}
	public void setNosql_value(String nosql_value) {
		this.nosql_value = nosql_value;
	}
	public String getStorage_value() {
		return storage_value;
	}
	public void setStorage_value(String storage_value) {
		this.storage_value = storage_value;
	}
	
}
