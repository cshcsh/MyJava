package com.java5200.date0522;

import java.util.Scanner;
public class Age4{

	public static void age(int age){
		String ageType;
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

	public static void age(String ageType,int age){
		int n=age/10;
		switch(n){
			case 0 :ageType="��ͯ";
			break;
			case 1 :ageType="����";
			break;
			case 2 :ageType="������";
			break;
			case 3 :ageType="����";
			break;
			case 4 :ageType="׳��";
			break;
			case 5 :ageType="����";
			break;
			case 6 :ageType="������";
			break;
			case 7 :ageType="����";
			break;
			case 8 :ageType="������";
			break;
			case 9 :ageType="��������";
			break;
			default :ageType="����";
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

		String[] ageType2={"��ͯ","����","������","����","׳��","����","������","����","������","��������","����"};
		age(ageType2,age);
	}
	
}