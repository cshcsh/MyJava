package com.java5200.date0522;

import java.util.Scanner;
public class Age2{

	private static String ageType;

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int n=age/10;

		switch(n){
			case 0 :ageType="��ͯ";
			break;
			case 1 :ageType="����";
			break;
			case 2 :ageType="������";
			break;
			case 3 :ageType="����";
			break;
			case 4 :ageType="׳��";
			break;
			case 5 :ageType="����";
			break;
			case 6 :ageType="������";
			break;
			case 7 :ageType="����";
			break;
			case 8 :ageType="������";
			break;
			case 9 :ageType="��������";
			break;
			default :ageType="����";
			break;
		}

		System.out.println(ageType);
	}
}