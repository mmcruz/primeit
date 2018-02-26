
package PrimeIT.database;

import java.sql.SQLException;

public class DBCommand extends MySQLDBConnection{

	private Statement statement = null;
	private ResultSet resultSet = null;

	public DBCommand(){
		try {
			open();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			close();
		}
	}
}
