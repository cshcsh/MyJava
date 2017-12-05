package com.java5200.date0531;

public class CheckingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account csh=new Account("csh");
		csh.setMaxMoney(1500);
		csh.setBalance(500);
		try {
			csh.withdaw(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(csh.getBalance());
	}

}
