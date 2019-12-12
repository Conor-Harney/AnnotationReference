package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import databaseConnectors.DatabaseInterface;

public class User {
	
	@Autowired
	@Qualifier("primaryDatabaseConnector")
	private DatabaseInterface connection1;
	@Autowired
	@Qualifier("supportingDatabaseConnector")
	private DatabaseInterface connection2;
	
	public User() {
	}
	
	public DatabaseInterface getConnection1() {
		return connection1;
	}
	public void setConnection1(DatabaseInterface connection1) {
		this.connection1 = connection1;
	}
	public DatabaseInterface getConnection2() {
		return connection2;
	}
	public void setConnection2(DatabaseInterface connection2) {
		this.connection2 = connection2;
	}	
	public void addInfo(String info) {
		connection1.add(info);
	}
}
