package com.java5200.date0528;

public class Account2 {

	private float balance;

	public Account2(float balance) {
		super();
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}
	//´æ¿î
	public boolean deposit(float addMoney){
		balance=balance+addMoney;
		return true;
	}
	//Ìá¿î
	public boolean withdaw(float subMoney){
		if(subMoney<=balance){
			balance=balance-subMoney;
			return true;
		}else {
			return false;
		}
	}
}
