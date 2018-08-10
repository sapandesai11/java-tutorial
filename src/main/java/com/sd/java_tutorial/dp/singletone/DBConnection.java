/**
 * 
 */
package com.sd.java_tutorial.dp.singletone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

/**
 * @author Sapan.Desai
 *
 */
public class DBConnection {
		
	private static volatile DBConnection connection = null;
	private static volatile Connection conn = null;
	private static final String USRENAME = "postgres";
	private static final String PASSWORD = "admin@123";
	private static final String URL = "jdbc:postgresql://localhost:5432/abpm";
	
	private DBConnection() {
		if(connection != null)
			throw new RuntimeErrorException(null, "Please use instance method of this class getInstance() for object creation.");
	}
	
	public static DBConnection getInstance() {
		if(connection == null)
			synchronized(DBConnection.class) {	
				if(connection == null)
					connection = new DBConnection();
			}
		return connection;
	}
	
	public Connection getConnection() {
		if(conn == null)
			try {
				synchronized (DBConnection.class) {
					if(conn == null)
						conn = DriverManager.getConnection(URL, USRENAME, PASSWORD);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		return conn;
	}

}
