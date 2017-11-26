package com.java5200.date0521;

public class Seven{

	public static void main(String[] args){
		
		int sum=0;
		int count=0;
		int i;
		for(i=1;i<=14;){
			if(i%7==0){
				count++;
				sum=sum+i;
			}
			i++;
		}
		System.out.println(count+"   "+sum);
	}
}