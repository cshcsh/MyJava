package com.java5200.date0530;

public class VIPAccount extends Account {
	
	public VIPAccount(String name) {
		super(name);
	}
	@Override
	public void deposit(double addMoney) {
		// TODO Auto-generated method stub
		double balance=super.getBalance()+addMoney;
		super.setBalance(balance);
	}

	@Override
	public void withdaw(double subMoney) {
		// TODO Auto-generated method stub
		if(super.getBalance()>=subMoney){
			double balance=super.getBalance()-subMoney;
			super.setBalance(balance);
		}
	}

}
