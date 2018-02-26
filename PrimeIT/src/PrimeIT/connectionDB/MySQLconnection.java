package PrimeIT.connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLconnection {

	private Connection conn = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private String hostname;
	private String dbName;
	private String username;
	private String password;
	String query = "Select * from user";
	public MySQLconnection(){
		this.hostname = "localhost";
		this.dbName = "mydb";
		this.username = "root";
		this.password = "admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionURL = "jdbc:mysql://" + this.hostname + ":3306" + this.dbName;
			this.conn = DriverManager.getConnection(connectionURL, this.username, this.password);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ResultSet query(String query) {
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);
		} 
		catch (Exception e) {
			System.out.println("Exception in query method :\n" + e.getMessage());
		}
		return resultSet;
	}
	
	public int execute(String query) {
		int recordsAffected = 0;
		try {
			recordsAffected = statement.executeUpdate(query);
		} 
		catch (Exception e) {
			System.out.println("Exception in query method :\n" + e.getMessage());
		}
		return recordsAffected;
	}
	
	public void commit() {
		try {
			conn.setAutoCommit(false);
		}  catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
}
	/*public void disconnect() {
		try {
			this.conn.close();
			this.conn = null;
		}
		catch (Exception e) {
			
		}
	}

	
	public void commit() {
		try {
			this.conn.commit();
		}
		catch (Exception e) {
			
		}
	}
	
	public void rollback() {
		try {
			this.conn.rollback();
		} 
		catch (Exception e) {
		
		}
	}
}
*/