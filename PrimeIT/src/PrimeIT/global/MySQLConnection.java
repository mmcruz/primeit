<<<<<<< HEAD
package PrimeIT.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCommand extends MySQLDBConnection{
	
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	public DBCommand(){
		try {
			new MySQLDBConnection();
			System.out.println(this.instance);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
=======
package PrimeIT.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCommand extends MySQLDBConnection{
	
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	public DBCommand(){
		try {
			new MySQLDBConnection();
			System.out.println(this.instance);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
>>>>>>> f48a9a2a00128823744507eec116b268f5b6cc93
