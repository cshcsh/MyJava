package com.java5200.date0523;

import java.util.Scanner;
public class Discount2{

	public static void main(String[] args){
	
		double weight;
		double fee;
		int dist;
		double discount;

		Scanner sc=new Scanner(System.in);
		dist=sc.nextInt();
		weight=sc.nextDouble();
		fee=sc.nextDouble();

		switch(dist/500){
			case 0:discount=1;
			break;
			case 1:discount=0.95;;
			break;
			case 2:discount=0.92;
			break;
			case 3:
			case 4:discount=0.90;
			break;
			default:discount=0.88;
			break;
		}

		System.out.println("‘À∑—£∫"+dist*fee*weight*discount);
	}

	
}