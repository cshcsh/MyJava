package com.java5200.date0521;

import java.util.Scanner;
public class LeapYear{
	
	public static void main (String[]args){
  
		int sum=0;
		int leap; 

		System.out.println("请输入年,月,日"); 
		Scanner sc = new Scanner(System.in);

		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();

		switch(month)
		{ 
			case 1:
				sum=0;break; 
			case 2:
				sum=31;break; 
			case 3:
				sum=59;break; 
			case 4:
				sum=90;break; 
			case 5:
				sum=120;break; 
			case 6:
				sum=151;break; 
			case 7:
				sum=181;break; 
			case 8:
				sum=212;break; 
			case 9:
				sum=243;break; 
			case 10:
				sum=273;break; 
			case 11:
				sum=304;break; 
			case 12:
				sum=334;break; 
			default:
				System.out.println("日期错误");break;
		} 
		sum=sum+day; 
		if(year%400==0||(year%4==0&&year%100!=0))
			leap=1; 
		else 
			leap=0; 
		if(leap==1 && month>2)
			sum++; 
			System.out.println("天数:"+sum);
    }
}
