package com.java5200.date0520;

public class Test{

	public static void main(String[] args){
		
		short s=5;
		//s=s-2;//���󣬴�intת����short���ܻ�����ʧ
		s=(short)(s-2);
		System.out.println(s);

		byte b=3;
		//b=b+4;//��intת����byte���ܻ�����ʧ
		b=(byte)(b+4);
		System.out.println(b);

		char c='a';
		int i=5;
		double d=0.314;

		double result=c+i+d;
		System.out.println(result);
		
		//byte b=5;
		//short s=3;
		//short t=s+b;// ��intת����short���ܻ�����ʧ
		//System.out.println(t);
	}
}