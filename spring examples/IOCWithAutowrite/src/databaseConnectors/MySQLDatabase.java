package databaseConnectors;

import org.springframework.stereotype.Component;

@Component
public class MySQLDatabase implements DatabaseInterface {
	public MySQLDatabase()
	{
		
	}

	@Override
	public void add(String data) {
		System.out.println("MySQL added:");
		System.out.println(data);	
	}

}
