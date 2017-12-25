package com.java5200.date0615;

import java.lang.reflect.Method;

class Person7{
	public  String sayHello(String string,int age){
		return string+"--->"+age;
	}
	
}

public class InvokeSayHelloTest {

	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("com.java5200.date0615.Person7");// ʵ����Class����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayHello", String.class, int.class);// �˷�����Ҫ��������
			String rv = null; // ���շ����ķ���ֵ
			// ���÷���,���봫�ݶ���ʵ��,ͬʱ������������ֵ
			rv = (String) met.invoke(c1.newInstance(), "���޼�", 30);
			System.out.println(rv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
