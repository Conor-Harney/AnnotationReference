package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;

import databaseConnectors.MySQLDatabase;
import databaseConnectors.OracleDatabase;
import databaseConnectors.PostgresDatabase;

//https://www.youtube.com/watch?v=EPv9-cHEmQw
//User has connections
//Connections can be interchanged between database types easily due to loose coupling
//user uses interfaces to keep generic databases
//user can use constructor or setter to inject the database type

public class Source {
	static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});

	public static void main(String[] args) {
		
		autowiredExample();
		
	}
	
	private static void oneUserExample()	{
		//add one user and overwrite the database type
		/*User user1 = new User(new OracleDatabase(), new PostgresDatabase());
		user1.setConnection1(new MySQLDatabase());
		user1.addInfo("first data");
		user1.setConnection1(new PostgresDatabase());
		user1.addInfo("second data");*/
	}
	
	private static void multipleUsersExample()	{
		/*User user1 = new User(new OracleDatabase(), new OracleDatabase());
		User user2 = new User(new MySQLDatabase(), new PostgresDatabase());
		User user3 = new User(new PostgresDatabase(), new OracleDatabase());
		
		
		user1.addInfo("user 1 data");
		user2.addInfo("user 2 data");
		user3.addInfo("user 3 data");*/
	}
	
	private static void autowiredExample()
	{
		User user1 = new User();
		user1.addInfo("test");
	}

}
