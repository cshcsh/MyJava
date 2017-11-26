package com.java5200.date0521;

import java.util.Scanner;
public class Pass{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=60&&score<=100){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
	}
}