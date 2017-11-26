package com.java5200.date0521;

import java.util.Scanner;
public class ToUp{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//char c=sc.nextLine();//没有字符输入
		char[] c=s.toCharArray();
		//System.out.println(c+2);//二元运算符 '+' 的操作数类型错误

		/*switch(c){// 不兼容的类型: char[]无法转换为int
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default :
				System.out.println("其他字符");
				break;
		}*/

		switch(s){
			case "a":
				System.out.println("A");
				break;
			case "b":
				System.out.println("B");
				break;
			case "c":
				System.out.println("C");
				break;
			case "d":
				System.out.println("D");
				break;
			case "e":
				System.out.println("E");
				break;
			default :
				System.out.println("其他字符");
				break;
		}
	}
}