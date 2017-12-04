package com.java5200.date0530;

public abstract class Account {

	private String name;//账户名
	private double balance;//余额
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String name) {
		super();
		this.name = name;
		this.balance = 0;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	//存款
	public abstract void deposit(double addMoney);
	//提款
	public abstract void withdaw(double subMoney);
}
