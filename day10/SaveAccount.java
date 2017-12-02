package com.java5200.date0528;

class Account3{
	
	protected float balance;

	public Account3(float balance) {
		super();
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}
	//´æ¿î
	public float deposit(float addMoney){
		balance=balance+addMoney;
		return balance;
	}
	//Ìá¿î
	public float withdaw(float subMoney){
		balance=balance-subMoney;
		return balance;
	}
}

public class SaveAccount extends Account3{
	
	private double interestRate;

	public SaveAccount(float balance,double interestRate) {
		super(balance);
		this.interestRate=interestRate;
		// TODO Auto-generated constructor stub
	}

}
