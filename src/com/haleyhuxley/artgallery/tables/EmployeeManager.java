/* Manager class for employee */

package com.haleyhuxley.artgallery.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.haleyhuxley.artgallery.db.DBUtil;
import com.haleyhuxley.artgallery.util.DisplayUtil;

public class EmployeeManager {

	public static void displayRow() throws SQLException {
		
		String query = "SELECT * FROM employee";
		
		try (
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				){
			
			DisplayUtil.printBars(100);
			System.out.println("TABLE: employee");
			DisplayUtil.printBars(100);
			
			while (rs.next()) {
				StringBuffer buff = new StringBuffer();
				
				buff.append(rs.getObject("employeeID", Integer.class) + ", ");
				buff.append(rs.getObject("firstName", String.class)+ ", ");
				buff.append(rs.getObject("middleName", String.class)+ ", ");
				buff.append(rs.getObject("lastName", String.class)+ ", ");
				buff.append(rs.getObject("birthDate", String.class)+ ", ");
				buff.append(rs.getObject("hireDate", String.class)+ ", ");
				buff.append(rs.getObject("position", String.class)+ ", ");
				buff.append(rs.getObject("salary", Integer.class)+ ", ");
				
				System.out.println(buff.toString());
			}
			DisplayUtil.printBars(100);
		}
		
	}
	
}
