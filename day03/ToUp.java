package com.java5200.date0521;

import java.util.Scanner;
public class ToUp{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//char c=sc.nextLine();//û���ַ�����
		char[] c=s.toCharArray();
		//System.out.println(c+2);//��Ԫ����� '+' �Ĳ��������ʹ���

		/*switch(c){// �����ݵ�����: char[]�޷�ת��Ϊint
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
				System.out.println("�����ַ�");
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
				System.out.println("�����ַ�");
				break;
		}
	}
}