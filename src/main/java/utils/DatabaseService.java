package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
	private Connection connection;

	public Connection getConnection() {
		if (this.connection == null) {
			try {
	        	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
	            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=StudentManagermentDatabase;integratedSecurity=true";
	            connection = DriverManager.getConnection(dbURL);
	            if (connection != null) {
	            	System.out.println("connected");
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
		}
        return this.connection;
    }
	
	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
