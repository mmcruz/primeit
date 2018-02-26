
package PrimeIT.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnection {

    protected Connection instance;
	private String hostName = "localhost";
	private String dbName = "mydb";
    private String url = "jdbc:mysql://";
    private String userName = "root";
    private String password = "admin";

    public MySQLDBConnection() {
    }

	public void open() throws SQLException{
        try {
			Class.forName("com.mysql.jdbc.Driver");
			this.url += this.hostName + ":3306" + this.dbName;
			this.instance = DriverManager.getConnection(this.url, this.userName, this.password);		
        } 
		catch (ClassNotFoundException e) {
            System.out.println("Database Connection Creation Failed : " + e.getMessage());
        }
	}
	
	public void close(){
		if (this.connection){
			this.close();
		}
		this.connection = null;
	}
	
}
