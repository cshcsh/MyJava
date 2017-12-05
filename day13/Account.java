package com.java5200.date0531;

public class Account {

	private String name;// �˻���
	private double balance;// ���
	private double maxMoney;// ����͸֧���

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

	// ���
	public void deposit(double addMoney) {
		// TODO Auto-generated method stub
		if (addMoney >= maxMoney) {
			System.out.println("���������");
		} else {
			double balance = getBalance() + addMoney;
			setBalance(balance);
		}

	}

	// ���
	public void withdaw(double subMoney) {
		// TODO Auto-generated method stub
		if (subMoney > (getMaxMoney()+getBalance())) {
			throw new OverdraftException("�ʽ���", 1000);// �Զ�����쳣�����ͨ��throw�׳�
		} else {
			double balance = getBalance()+ getMaxMoney()- subMoney;
			setBalance(balance);
		}

	}
}
