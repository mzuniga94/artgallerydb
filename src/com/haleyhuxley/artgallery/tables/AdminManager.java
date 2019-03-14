/* Manager class for Admin table */

package com.haleyhuxley.artgallery.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.haleyhuxley.artgallery.db.DBUtil;
import com.haleyhuxley.artgallery.util.DisplayUtil;

public class AdminManager {

	/* Function to display all rows. */
	public static void displayRows() throws SQLException {

		String query = "SELECT adminId, userName, password FROM admin";

		try ( 
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				){

			DisplayUtil.printBars(100);
			System.out.println("TABLE: Admin: ");
			DisplayUtil.printBars(100);
			
			while (rs.next()) {
				StringBuffer buff = new StringBuffer();

				buff.append(rs.getObject("adminId", Integer.class) + ": ");
				buff.append(rs.getObject("userName", String.class) + ", ");
				buff.append(rs.getObject("password", String.class));

				System.out.println(buff.toString());
			}
			DisplayUtil.printBars(100);
		}

	}
}
