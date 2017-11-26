package com.java5200.date0521;

import java.util.Scanner;
public class Season{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		switch(month){
			case 12 :
			case 1 :
			case 2 :
				System.out.println("¶¬¼¾");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("´º¼¾");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("ÏÄ¼¾");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("Çï¼¾");
				break;
			default:
				System.out.println("´íÎó");
				break;
		}
	}
}