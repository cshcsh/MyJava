package com.java5200.date0522;

import java.util.Scanner;
public class Age{

	private static String ageType;

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();

		if(age>=0&&age<=9){
			ageType="��ͯ";
		}else if(age>9&&age<=19){
			ageType="����";
		}else if(age>19&&age<=29){
			ageType="������";
		}else if(age>29&&age<=39){
			ageType="����";
		}else if(age>39&&age<=49){
			ageType="׳��";
		}else if(age>49&&age<=59){
			ageType="����";
		}else if(age>59&&age<=69){
			ageType="������";
		}else if(age>69&&age<=79){
			ageType="����";
		}else if(age>79&&age<=89){
			ageType="������";
		}else if(age>89&&age<=99){
			ageType="��������";
		}else{
			ageType="����";
		}

		System.out.println(ageType);
	}
}