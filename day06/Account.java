package com.java5200.date0524;

public class Account{

	private String accountName;//账户名称
	private String password;//密码
	private double balance;//余额

	public Account(){
	
	}
	public Account(String accountName,String password){
		this.accountName=accountName;
		this.password=password;
		this.balance=0;
	}
	public String getAccountName(){
		return accountName;
	}
	public void setAccountName(String accountName){
		this.accountName=accountName;
	}
	
	//不提供获取密码方法getPassword()
	public void setPassword(String password){
		this.password=password;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
}