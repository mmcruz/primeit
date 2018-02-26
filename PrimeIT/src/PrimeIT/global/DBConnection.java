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

    public MySQLDBConnection() throws SQLException {
        try {
			this.open();
        } 
		catch (ClassNotFoundException e) {
            System.out.println("Database Connection Creation Failed : " + e.getMessage());
        }
    }

	public void open(){
		Class.forName("com.mysql.jdbc.Driver");
		this.url += this.hostName + ":3306" + this.dbName;
		this.instance = DriverManager.getConnection(this.url, this.userName, this.password);		
	}
	
	public void close(){
		this.connection = null;
	}
	
}

