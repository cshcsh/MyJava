package com.java5200.date0528;

public class Account {

	private float balance;

	public Account(float balance) {
		super();
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}
	//���
	public float deposit(float addMoney){
		balance=balance+addMoney;
		return balance;
	}
	//���
	public float withdaw(float subMoney){
		balance=balance-subMoney;
		return balance;
	}
}
