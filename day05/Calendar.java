package com.java5200.date0523;

import java.util.Scanner;
public class Calendar {
	
	public static final int YEAR = 1900;
	
	public static void main(String[] args){
		
		
		System.out.println("****************************欢迎使用万年历***************************");
		int Month ,Year;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份:");
		Year = sc.nextInt();
		if(Year>2900 || Year<1900){
			System.out.println("输入年份不合法,请重新输入!");
			return;
		}
		System.out.print("请输入月份:");
		Month = sc.nextInt();
		if(Month>12 || Month<1){
			System.out.println("输入月份不合法,请重新输入!");
			return;
		}

		int n = 1;
		int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31}; 
		int year[] = new int[1001];  
		year[0] = n;
		for(int i=1;i<year.length;i++){
			int days = 365;
			if(leapYear(i+YEAR-1)){
				days = 366;
				year[i] = (year[i-1] + days)%7;
			}
			else{
				year[i] = (year[i-1] + days)%7;
			}
		}
		
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		System.out.println();
		if(leapYear(Year)){ 
			month[2] = 29;
		}
		int day=0; 
		for(int i=1;i<Month;i++){
			day = day + month[i];
		}
		
		day = (year[Year-YEAR]+day)%7;
		for(int i=0;i<7;i++){
			
			if(day == i){
				System.out.print(1 + "\t");
				if(day == 6){
					System.out.println();
				}
				break;
			}else{
				System.out.print("\t");
			}
		}
		for(int i=2;i<=month[Month];i++){
			
			if(i<10){
				System.out.print(i + "\t");
			}else{
				System.out.print(i + "\t");
			}
			
			if((day+i-1)%7 == 6){
				System.out.println();
			}
		}
	}
	
	
	public static boolean leapYear(int year){
		if(year%400==0 || (year%4==0 && year%100!=0)){ 
			return true; 
		}else{
			return false;
		}
	}
}

