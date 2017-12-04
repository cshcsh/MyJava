package com.java5200.date0530;

public class OrdinaryAccount2 extends Account2 implements InterestRate{

	private double maxMoney;
	
	public void setMaxMoney(double maxMoney) {
		this.maxMoney = maxMoney;
	}

	public double getMaxMoney() {
		return maxMoney;
	}

	public OrdinaryAccount2(String name) {
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

	@Override
	public double calcRate1(double prin, double rate, int n) {
		// TODO Auto-generated method stub
		double num=0;
		if(n>0){
			
			switch (n) {
			case 1:
			case 2:
				num=prin*0.03*n;
				break;
			case 3:
			case 4:
				num=prin*0.04*n;
				break;
			default:
				num=prin*0.05*n;
				break;
			}
		}else{
			System.out.println("存放期n不对");
		}
		return num;
	}

}
