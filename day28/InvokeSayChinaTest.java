package com.java5200.date0615;

import java.lang.reflect.Method;

class Person5{
	public static void sayChina(){
		System.out.println("hahaha");
	}
}

public class InvokeSayChinaTest {

	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("com.java5200.date0615.Person5");// ʵ����Class����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayChina");// �˷���û�в���
			met.invoke(c1.newInstance()); // ���÷���,���봫�ݶ���ʵ��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
