package com.java5200.date0530;

public abstract class Account {

	private String name;//�˻���
	private double balance;//���
	
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
	//���
	public abstract void deposit(double addMoney);
	//���
	public abstract void withdaw(double subMoney);
}
