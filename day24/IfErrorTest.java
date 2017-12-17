package com.java5200.date0611;

import java.util.Scanner;

public class IfErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("输入年龄");
		int age=scanner.nextInt();
		if(age>60){
			System.out.println("老年人");
		}else if(age>40){
			System.out.println("中年人");
		}else if(age>20){
			System.out.println("青年人");
		}
	}

}
