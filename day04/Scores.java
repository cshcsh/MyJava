package com.java5200.date0522;

import java.util.Scanner;
public class Scores{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[10];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		int max=0;
		for(int i=0;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}

		System.out.println(max);
				

		for(int i=0;i<n;i++){
			if(a[i]>=(max-10)){
				System.out.println("A");
			}else if(a[i]<(max-10)&&a[i]>=(max-20)){
				System.out.println("B");
			}else if(a[i]<(max-20)&&a[i]>=(max-30)){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}
		

	}
}