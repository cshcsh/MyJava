package com.java5200.date0522;

import java.util.Scanner;
public class Age4{

	public static void age(int age){
		String ageType;
		if(age>=0&&age<=9){
			ageType="儿童";
		}else if(age>9&&age<=19){
			ageType="少年";
		}else if(age>19&&age<=29){
			ageType="青少年";
		}else if(age>29&&age<=39){
			ageType="青年";
		}else if(age>39&&age<=49){
			ageType="壮年";
		}else if(age>49&&age<=59){
			ageType="中年";
		}else if(age>59&&age<=69){
			ageType="中老年";
		}else if(age>69&&age<=79){
			ageType="老年";
		}else if(age>79&&age<=89){
			ageType="老老年";
		}else if(age>89&&age<=99){
			ageType="老老老年";
		}else{
			ageType="错误";
		}
		System.out.println(ageType);
	}

	public static void age(String ageType,int age){
		int n=age/10;
		switch(n){
			case 0 :ageType="儿童";
			break;
			case 1 :ageType="少年";
			break;
			case 2 :ageType="青少年";
			break;
			case 3 :ageType="青年";
			break;
			case 4 :ageType="壮年";
			break;
			case 5 :ageType="中年";
			break;
			case 6 :ageType="中老年";
			break;
			case 7 :ageType="老年";
			break;
			case 8 :ageType="老老年";
			break;
			case 9 :ageType="老老老年";
			break;
			default :ageType="错误";
			break;
		}

		System.out.println(ageType);
	}

	public static void age(String[] ageType,int age){

		int n=age/10;
		System.out.println(ageType[n]);
		
	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		age(age);
		
		String string="";
		age(string,age);

		String[] ageType2={"儿童","少年","青少年","青年","壮年","中年","中老年","老年","老老年","老老老年","错误"};
		age(ageType2,age);
	}
	
}