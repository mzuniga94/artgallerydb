/* DBUtil is a utility class that assists with connecting to the database. */

package com.haleyhuxley.artgallery.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	/* Declare the variables to create a connection to the local database. */

	public static final String USERNAME = "dbuser";
	public static final String PASSWORD = "dbpassword";
	public static final String CONN_STRING = "jdbc:mysql://localhost/explorecalifornia";
	
	/*
	 * <summary>Creates a connection to the database.</summary>
	 * <params>None.</params>
	 * <returns>A Connection object that makes a connection the database.</returns>
	 */
	
	public static Connection getConnection() {
		
		/* Variable that holds the connection. */
		try {
			System.out.println("Connection successful");
			return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
