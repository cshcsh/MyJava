package com.java5200.date0611;

class Base{
	public void fun(int price,int...discount){
		System.out.println("Base....fun");
	}
}

class Sub extends Base{

	@Override
	public void fun(int price, int[] discount) {
		// TODO Auto-generated method stub
		System.out.println("Sub...fun");
	}
	
}

public class BaseTest {

	
	public static void main(String[] args) {
		
		Base base=new Sub();
		base.fun(55, 44,44);
		Sub sub=new Sub();
		int[] a={44,44};
		sub.fun(55, a);
	}
	

}
