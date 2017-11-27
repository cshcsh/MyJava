package com.java5200.date0523;

public class Args{

	public static void main(String[] args){
	
		System.out.println("²ÎÊý£º4,5,2,6,7,9");
		fun(4,5,2,6,8,9);
	}

	public static void fun(int...args){
		
		//for(int i=0;i<args.length;i++){
		for(int i:args){
			System.out.println(i);
		}
	}
}