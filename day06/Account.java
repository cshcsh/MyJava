package com.java5200.date0524;

public class Account{

	private String accountName;//�˻�����
	private String password;//����
	private double balance;//���

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
	
	//���ṩ��ȡ���뷽��getPassword()
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