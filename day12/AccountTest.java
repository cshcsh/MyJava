package com.java5200.date0530;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VIPAccount vipAccount=new VIPAccount("csh");
		vipAccount.deposit(200000);
		vipAccount.withdaw(2000);
		System.out.println(vipAccount.getBalance());
		OrdinaryAccount ordinaryAccount=new OrdinaryAccount("hhh");
		ordinaryAccount.deposit(100100);
		System.out.println(ordinaryAccount.getBalance());
	}

}
