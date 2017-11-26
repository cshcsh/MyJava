package com.java5200.date0521;

import java.util.Scanner;
public class ScoreType{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		int n;
		if(score>=90&&score<=100){
			n=0;
		}else if(score>=70&&score<90){
			n=1;
		}else if(score>=60&&score<70){
			n=2;
		}else{
			n=3;
		}
		switch(n){
			case 0:
				System.out.println("等级A");
				break;
			case 1:
				System.out.println("等级B");
				break;
			case 2:
				System.out.println("等级C");
				break;
			default  :
				System.out.println("等级D");
				break;

		}
	}
}