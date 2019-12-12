package databaseConnectors;

import org.springframework.stereotype.Component;

@Component
public class PostgresDatabase implements DatabaseInterface {

	public PostgresDatabase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(String data) {
		System.out.println("Postgres added:");
		System.out.println(data);	
	}

}
