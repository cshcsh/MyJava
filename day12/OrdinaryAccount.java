package com.java5200.date0530;

public class OrdinaryAccount extends Account {

	private double maxMoney;
	
	public void setMaxMoney(double maxMoney) {
		this.maxMoney = maxMoney;
	}

	public double getMaxMoney() {
		return maxMoney;
	}

	public OrdinaryAccount(String name) {
		super(name);
		this.maxMoney = 100000;
	}

	@Override
	public void deposit(double addMoney) {
		// TODO Auto-generated method stub
		if (addMoney >= maxMoney) {
			System.out.println("存款有限制");
		}else{
			double balance=super.getBalance()+addMoney;
			super.setBalance(balance);
		}
		
	}

	@Override
	public void withdaw(double subMoney) {
		// TODO Auto-generated method stub
		if (subMoney >= maxMoney) {
			System.out.println("取款有限制");
		}else{
			if(super.getBalance()>=subMoney){
				double balance=super.getBalance()-subMoney;
				super.setBalance(balance);
			}else{
				System.out.println("余额不足");
			}
		}
		
	}

}
