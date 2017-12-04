package com.java5200.date0530;

public class AccountTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VIPAccount2 vipAccount2=new VIPAccount2("csh");
		double money=vipAccount2.calcRate1(10000, 0.035, 1);
		System.out.println(money);
		OrdinaryAccount2 ordinaryAccount2=new OrdinaryAccount2("hhh");
		double money2=ordinaryAccount2.calcRate1(10000, 0.03, 2);
		System.out.println(money2);
	}

}
