package com.java5200.date0531;

public class BankSingleTest {

	private static BankSingleTest bankSingleTest=new BankSingleTest();
	
	private BankSingleTest(){
		
	}
	
	public static BankSingleTest getBanking(){
		return bankSingleTest;
	}
	
	public static void main(String args[]) {
		
		BankSingleTest a=BankSingleTest.getBanking();
		BankSingleTest b=BankSingleTest.getBanking();
		if(a.equals(b)){
			System.out.println("Í¬Ò»ÊµÀý");
		}
	}
}
