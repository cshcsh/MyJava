package com.java5200.date0523;

public class IsOdd{

	public static void main(String[] args){
		
		System.out.println(isOdd(-8));
	}

	public static boolean isOdd(int n){
		
		if(n%2==1){
			return true;
		}else{
			return false;
		}
	}

}