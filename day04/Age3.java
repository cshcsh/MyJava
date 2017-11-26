package com.java5200.date0522;

import java.util.Scanner;
public class Age3{

	private static String[] ageType={"儿童","少年","青少年","青年","壮年","中年","中老年","老年","老老年","老老老年","错误"};
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int n=age/10;
		System.out.println(ageType[n]);
	}
}