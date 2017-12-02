package com.java5200.date0528;

class Account4 {

	public float balance;

	public Account4(float balance) {
		super();
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}
	//存款
	public void deposit(float addMoney){
		balance=balance+addMoney;
	}
	//提款
	public void withdaw(float subMoney){
		balance=balance-subMoney;
	}
}
public class CheckingAccount extends Account4{

	private double overdraftProtection;
	
	public CheckingAccount(float balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	

	public CheckingAccount(float balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}

	//提款
	public void withdaw(float subMoney){
		if(subMoney<=balance||overdraftProtection>=subMoney){//余额足够或者可以透支金额足够，则正常交易
			balance=balance-subMoney;
		}else {//余额不够或者可以透支金额不够
			float n=(float) (balance+overdraftProtection-subMoney);
			if(n>=10000){
				//透支金额大于等于当前保护级别，交易失败
				System.out.println("交易失败");
			}else {
				//透支金额小于当前保护级别，交易成功
				overdraftProtection=balance+overdraftProtection-subMoney;
				balance=0;
				
			}
		}
	}

}
