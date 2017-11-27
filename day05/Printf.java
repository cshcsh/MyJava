package com.java5200.date0523;

import java.util.Scanner;
public class Printf{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		int[] n=new int[10];
		for(int i=0;i<n.length;i++){
			n[i]=sc.nextInt();
		}
		fun(n);
	}

	public static void fun(int[] a){

		int b=0;
		double aver;
		for(int i=0;i<a.length;i++){
			
			b+=a[i];
		}
		aver=(double)b/10;
		String string=String.format("%.3f",aver);
		System.out.printf(string);
	}
}