package com.haleyhuxley.artgallery.db;

import java.sql.SQLException;

import com.haleyhuxley.artgallery.tables.AdminManager;
import com.haleyhuxley.artgallery.tables.ArtistManager;
import com.haleyhuxley.artgallery.tables.ArtworkManager;
import com.haleyhuxley.artgallery.tables.EmployeeManager;
import com.haleyhuxley.artgallery.tables.ExhibitManager;

public class Main {

	public static void main(String[] args) throws SQLException {
				
		AdminManager.displayRows();
		ArtistManager.displayRows();
		ArtworkManager.displayRows();
		ExhibitManager.displayRows();
		EmployeeManager.displayRow();
		
	}

}
