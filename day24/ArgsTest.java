package com.java5200.date0611;

public class ArgsTest {

	public void methodA(String string ,Integer...is){
		System.out.println("����1...");
		
	}
	public void methodA(String string ,String...strings){
		System.out.println("����2...");
		
	}
	
	public static void main(String[] args) {
		
		ArgsTest argsTest=new ArgsTest();
		argsTest.methodA("China", 0);
		argsTest.methodA("China", "people");
		argsTest.methodA("China",3,4);
		argsTest.methodA("China", "","h");
	}
	

}
