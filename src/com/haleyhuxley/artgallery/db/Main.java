package com.haleyhuxley.artgallery.db;

import java.sql.SQLException;

import com.haleyhuxley.artgallery.tables.AdminManager;
import com.haleyhuxley.artgallery.tables.ArtistManager;
import com.haleyhuxley.artgallery.tables.ArtworkManager;

public class Main {

	public static void main(String[] args) throws SQLException {
				
		AdminManager.displayRows();
		ArtistManager.displayRows();
		ArtworkManager.displayRows();
		
	}

}
