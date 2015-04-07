package com.cloudigrate.facade;

import com.cloudigrate.dao.SqlConnection;
import com.cloudigrate.domain.Key;

public class KeyFacade {

	SqlConnection sqlConnection = new SqlConnection();

	public Key createNewKey(String applicationName) {
		// TODO Auto-generated method stub
		return sqlConnection.createKey(applicationName, Key.generateNextKey());
	}
}
