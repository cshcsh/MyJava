package com.java5200.date0522;

import java.util.Scanner;
public class Age3{

	private static String[] ageType={"��ͯ","����","������","����","׳��","����","������","����","������","��������","����"};
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int n=age/10;
		System.out.println(ageType[n]);
	}
}