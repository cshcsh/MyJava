package com.java5200.date0523;

import java.util.Scanner;
public class Temperature{

	public static void main(String[] args){
	
		int temperature;
		String dec="";

		Scanner sc=new Scanner(System.in);
		temperature=sc.nextInt();

		if(temperature<10){
			dec=temperature+"度有点冷，要多穿点衣服";
		}else if(temperature>=10&&temperature<25){
			dec=temperature+"度正合适，出去玩吧";
		}else if(temperature>=25&&temperature<35){
			dec=temperature+"度有点热";
		}else if(temperature>=35){
			dec=temperature+"度太热了，要开空调";
		}


		System.out.println(dec);
	}

}