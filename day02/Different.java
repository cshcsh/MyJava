package com.java5200.date0520;

public class Different{

	public static void main(String[] args){
		
		
		System.out.println('*'+'\t'+'*');//输出ASCII值

		System.out.println("*"+'\t'+'*');//输出字符串

		/*
			short s=3;
			s=s+2;
			s+=2;
		*/

		short s=3;
		//s=s+2;//从int转换到short可能会有损失
		s+=2;
		System.out.println(s);
	}
}