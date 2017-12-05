package com.java5200.date0531;

public class Account {

	private String name;// 账户名
	private double balance;// 余额
	private double maxMoney;// 可以透支金额

	public double getMaxMoney() {
		return maxMoney;
	}

	public void setMaxMoney(double maxMoney) {
		this.maxMoney = maxMoney;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public Account(String name) {
		super();
		this.name = name;
		this.balance = 0;
		this.maxMoney = 0;
	}

	// 存款
	public void deposit(double addMoney) {
		// TODO Auto-generated method stub
		if (addMoney >= maxMoney) {
			System.out.println("存款有限制");
		} else {
			double balance = getBalance() + addMoney;
			setBalance(balance);
		}

	}

	// 提款
	public void withdaw(double subMoney) {
		// TODO Auto-generated method stub
		if (subMoney > (getMaxMoney()+getBalance())) {
			throw new OverdraftException("资金不足", 1000);// 自定义的异常类对象通过throw抛出
		} else {
			double balance = getBalance()+ getMaxMoney()- subMoney;
			setBalance(balance);
		}

	}
}
