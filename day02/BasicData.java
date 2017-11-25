package com.java5200.date0520;

public class BasicData{

	public static void main(String[] args){
		
		/*
			String
			Byte
			Short
			Integer
			Long
			Float
			Double
			Boolean
			Char
		*/

		String s1="43";

		byte a1=Byte.parseByte(s1);
		System.out.println(a1);

	
		short a2=Short.parseShort(s1);
		System.out.println(a2);

		
		int a3=Integer.parseInt(s1);
		System.out.println(a3);

		long a4=Long.parseLong(s1);
		System.out.println(a4);

		float a5=Float.parseFloat(s1);
		System.out.println(a5);

		double a6=Double.parseDouble(s1);
		System.out.println(a6);

		boolean a7=Boolean.parseBoolean(s1);
		System.out.println(a7);

		char[] a8=s1.toCharArray();
		for(int i=0;i<a8.length;i++){
			System.out.println(a8[i]);
		}
		

		int num=1;
		String s2=String.valueOf(num);
		System.out.println(s2);
	}
}