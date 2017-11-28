package com.java5200.date0524;

public class AccountTest{

	public static void main(String[] args){
		
		Account a1=new Account("csh1","123456");
		Account a2=new Account("csh2","123456");
		Account a3=new Account("csh3","123456");
		Account a4=new Account("csh4","123456");

		Bank b1=new Bank("花旗银行");
		b1.addAccount(a1);
		b1.addAccount(a2);
		b1.addAccount(a3);
		b1.addAccount(a4);
		System.out.println("银行名称："+b1.getBankName());
		System.out.println("账户数量："+b1.getAccountNum());	
		System.out.println("账户信息：");
		for(int i=0;i<b1.getAccountNum();i++){
			System.out.println("账户名称："+b1.getAccounts()[i].getAccountName()+"     账户余额："+b1.getAccounts()[i].getBalance());
		}
		
	}
}