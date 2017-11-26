package com.java5200.date0521;

import java.util.Scanner;
public class Score{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score==100){
			System.out.println("奖励一辆BMW");
		}else if(score>80&&score<=99){
			System.out.println("奖励一台IPhone5s");
		}else if(score>60&&score<=80){
			System.out.println("奖励一本参考书");
		}else{
			System.out.println("没有奖励");
		}
	}
}