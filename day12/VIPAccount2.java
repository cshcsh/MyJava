package com.java5200.date0530;

public class VIPAccount2 extends Account2 implements InterestRate{
	
	public VIPAccount2(String name) {
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
	@Override
	public double calcRate1(double prin, double rate, int n) {
		// TODO Auto-generated method stub
		double num=0;
		if(n>0){
			
			switch (n) {
			case 1:
			case 2:
				num=prin*0.035*n;
				break;
			case 3:
			case 4:
				num=prin*0.045*n;
				break;
			default:
				num=prin*0.055*n;
				break;
			}
		}else{
			System.out.println("存放期n不对");
		}
		return num;
	
	}

}
