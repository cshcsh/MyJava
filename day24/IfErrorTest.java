package com.java5200.date0611;

import java.util.Scanner;

public class IfErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("��������");
		int age=scanner.nextInt();
		if(age>60){
			System.out.println("������");
		}else if(age>40){
			System.out.println("������");
		}else if(age>20){
			System.out.println("������");
		}
	}

}
