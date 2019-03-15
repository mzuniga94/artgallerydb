/* Manager class for exhibit table */

package com.haleyhuxley.artgallery.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.haleyhuxley.artgallery.db.DBUtil;
import com.haleyhuxley.artgallery.util.DisplayUtil;

public class ExhibitManager {
	
	public static void displayRows() throws SQLException {
		
		String query = "SELECT * FROM exhibit";
		
		try (
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);		
				){
			
			DisplayUtil.printBars(100);
			System.out.println("TABLE: exhibit");
			DisplayUtil.printBars(100);
			
			while (rs.next()) {
				StringBuffer buff = new StringBuffer();
				
				buff.append(rs.getObject("exhibitId", Integer.class) + ", ");
				buff.append(rs.getObject("exhibitName", String.class) + ", ");
				buff.append(rs.getObject("dateStart", String.class) + ", ");
				buff.append(rs.getObject("dateEnd", String.class) + ", ");
				buff.append(rs.getObject("description", String.class));
				
				System.out.println(buff.toString());
			}
			DisplayUtil.printBars(100);
		}
		
	}
	
}
