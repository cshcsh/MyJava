package com.java5200.date0522;

import java.util.Scanner;
public class Age{

	private static String ageType;

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();

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
}