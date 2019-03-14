/* DBUtil is a utility class that assists with connecting to the database. */

package com.haleyhuxley.artgallery.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	/* Declare the variables to create a connection to the local database. */

	public static final String USERNAME = "dbuser";
	public static final String PASSWORD = "dbpassword";
	public static final String CONN_STRING = "jdbc:mysql://localhost/artgallery";
	
	/*  Function to create a connection to the database. */
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/* Function to show detailed SQL errors. */
	public static void showException(SQLException e) {
		System.err.println("Error message: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
		System.err.println("SQL state: " + e.getSQLState());
	}
	
}
