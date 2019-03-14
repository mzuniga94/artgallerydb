/* Manager class for Artist table */

package com.haleyhuxley.artgallery.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.haleyhuxley.artgallery.db.DBUtil;
import com.haleyhuxley.artgallery.util.DisplayUtil;

public class ArtistManager {

	public static void displayRows() throws SQLException {
		
		String query = "SELECT * FROM artist";
		
		try (
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);				
				){
			
			DisplayUtil.printBars(100);
			System.out.println("TABLE: Artist");
			DisplayUtil.printBars(100);
			
			while (rs.next()) {
				StringBuffer buff = new StringBuffer();
				
				buff.append(rs.getObject("artistId", Integer.class) + ", ");
				buff.append(rs.getObject("firstName", String.class) + ", ");
				buff.append(rs.getObject("middleName", String.class) + ", ");
				buff.append(rs.getObject("lastName", String.class) + ", ");
				buff.append(rs.getObject("birthPlace", String.class)+ ", ");
				buff.append(rs.getObject("birthDate", String.class) + ", ");
				buff.append(rs.getObject("artPeriod", String.class)+ ", " );
				buff.append(rs.getObject("bio", String.class));
				
				System.out.println(buff.toString());
			}
			DisplayUtil.printBars(100);
		}
	}
	
}
