package com.java5200.date0522;

public class Max{

	public static int max(int a,int b){
		int max=0;
		if(a<b){
			max=b;
		}else{
			max=a;
		}
		return max;
	}

	public static double max(double a,double b){
		double max=0;
		if(a<b){
			max=b;
		}else{
			max=a;
		}
		return max;
	}

	public static double max(double a,double b,double c){
		double max=0;
		if(max(a,b)<c){
			max=c;
		}else{
			max=max(a,b);
		}
		return max;
	}

	public static void main(String[] args){
		
		System.out.println(max(2,3));
		System.out.println(max(4.00,3.00));
		System.out.println(max(7.00,4.56,9.99));
	}
}