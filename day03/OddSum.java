package com.java5200.date0521;

public class OddSum{

	public static void main(String[] args){
		
		int sum=0;
		int i;
		for(i=1;i<=100;){
			sum=sum+i;
			i=i+2;
		}
		System.out.println(sum);
	}
}