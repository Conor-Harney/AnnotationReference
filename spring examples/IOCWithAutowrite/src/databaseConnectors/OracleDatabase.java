package databaseConnectors;

import org.springframework.stereotype.Component;

@Component
public class OracleDatabase implements DatabaseInterface {

	public OracleDatabase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(String data) {
		System.out.println("Oracle added:");
		System.out.println(data);
	}

}
