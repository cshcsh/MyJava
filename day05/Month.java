package com.java5200.date0523;

import java.util.Scanner;
public class Month{

	public static void main(String[] args){
	
		System.out.println("****************************欢迎使用万年历***************************");
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=sc.nextInt();
		System.out.print("请输入月份：");
		int month=sc.nextInt();
		int day=0;
		int n=0;

		switch(month){
			case 1:day=31;break;
			case 2:day=28;break;
			case 3:day=31;break;
			case 4:day=30;break;
			case 5:day=31;break;
			case 6:day=30;break;
			case 7:day=31;break;
			case 8:day=31;break;
			case 9:day=30;break;
			case 10:day=31;break;
			case 11:day=30;break;
			case 12:day=31;break;
			default:System.out.println("月份错误");break;
		}

		if((year%400==0||(year%4==0&&year%100!=0))&&month==2){
			
			day=day+1;
		}
		
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for(int i=1;i<=day;i++){
			for(int j=1;j<=n;j++){
				System.out.print("\t");
			}
			System.out.print(i+"\t");
			if((i+n)%7==0){
				System.out.println();
			}
	
		}
	}

}