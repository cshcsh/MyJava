package com.java5200.date0523;

import java.util.Scanner;
public class Temperature{

	public static void main(String[] args){
	
		int temperature;
		String dec="";

		Scanner sc=new Scanner(System.in);
		temperature=sc.nextInt();

		if(temperature<10){
			dec=temperature+"���е��䣬Ҫ�ഩ���·�";
		}else if(temperature>=10&&temperature<25){
			dec=temperature+"�������ʣ���ȥ���";
		}else if(temperature>=25&&temperature<35){
			dec=temperature+"���е���";
		}else if(temperature>=35){
			dec=temperature+"��̫���ˣ�Ҫ���յ�";
		}


		System.out.println(dec);
	}

}