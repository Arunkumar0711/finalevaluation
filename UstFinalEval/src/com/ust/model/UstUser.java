package com.ust.model;

public class UstUser {
	private int userId;
	private String userName;
	private String password;
	
	
	public UstUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UstUser(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "UstUser [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	

}
