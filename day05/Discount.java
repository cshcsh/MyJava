package com.java5200.date0523;

import java.util.Scanner;
public class Discount{

	public static void main(String[] args){
	
		double weight;
		double fee;
		int dist;
		double discount;

		Scanner sc=new Scanner(System.in);
		dist=sc.nextInt();
		weight=sc.nextDouble();
		fee=sc.nextDouble();

		if(dist>=0&&dist<500){
			discount=1;
		}else if(dist>=500&&dist<1000){
			discount=0.95;
		}else if(dist>=1000&&dist<1500){
			discount=0.92;
		}else if(dist>=1500&&dist<2500){
			discount=0.90;
		}else if(dist>=2500){
			discount=0.88;
		}else{
			System.out.println("error");
			discount=0;
		}

		System.out.println("‘À∑—£∫"+dist*fee*weight*discount);
	}

	
}