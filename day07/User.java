package com.java5200.date0525;

public class User {

	private String userName;
	private String password;
	private int count;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName) {
		super();
		this.userName = userName;
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", count=" + count + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.toString();
	}

}
