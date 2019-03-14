/* Manager class for artist table */

package com.haleyhuxley.artgallery.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.haleyhuxley.artgallery.db.DBUtil;
import com.haleyhuxley.artgallery.util.DisplayUtil;

public class ArtworkManager {

	/* Function to connect to database and display all rows. */
	public static void displayRows() throws SQLException {
		
		String query = "SELECT * FROM artwork";
		
		try (
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				){
			
			DisplayUtil.printBars(100);
			System.out.println("TABLE: Artwork");
			DisplayUtil.printBars(100);
			
			while (rs.next()) {
				StringBuffer buff = new StringBuffer();
				
				buff.append(rs.getObject("artworkId", Integer.class) + ", ");
				buff.append(rs.getObject("title", String.class) + ", ");
				buff.append(rs.getObject("artist", String.class) + ", ");
				buff.append(rs.getObject("dateOfCreation", Integer.class) + ", ");
				buff.append(rs.getObject("artPeriod", String.class) + ", ");
				buff.append(rs.getObject("description", String.class) + ", ");
				System.out.println(buff.toString());
			}
			DisplayUtil.printBars(100);
		}
		
	}
	
}
