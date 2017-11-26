package com.java5200.date0522;

import java.util.Scanner;
public class Age2{

	private static String ageType;

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int n=age/10;

		switch(n){
			case 0 :ageType="儿童";
			break;
			case 1 :ageType="少年";
			break;
			case 2 :ageType="青少年";
			break;
			case 3 :ageType="青年";
			break;
			case 4 :ageType="壮年";
			break;
			case 5 :ageType="中年";
			break;
			case 6 :ageType="中老年";
			break;
			case 7 :ageType="老年";
			break;
			case 8 :ageType="老老年";
			break;
			case 9 :ageType="老老老年";
			break;
			default :ageType="错误";
			break;
		}

		System.out.println(ageType);
	}
}