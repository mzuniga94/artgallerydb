/* JavaBean class for Admin table. */

package com.haleyhuxley.artgallery.beans;

public class Admin {
	
	/* Declare attributes of the Admin entity */
	
	private int adminId;
	private String userName;
	private String password;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
