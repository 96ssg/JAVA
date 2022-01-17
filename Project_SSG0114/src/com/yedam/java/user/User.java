package com.yedam.java.user;

public class User {
	private String userName;
	private String userId;
	private int userPassword;
	private int userRun;
	private int userRoll;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	
	public int getUserRun() {
		return userRun;
	}
	public void setUserRun(int userRun) {
		this.userRun = userRun;
	}
	
	public int getUserRoll() {
		return userRoll;
	}
	public void setUserRoll(int userRoll) {
		this.userRoll = userRoll;
	}
	@Override
	public String toString() {
		return "userName=" + userName + ", userId=" + userId + ", userPassword=" + userPassword + ", 대여횟수 :" + userRoll ;
	}
	
	
}
