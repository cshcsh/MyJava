package com.java5200.date0615;

import java.lang.reflect.Method;

class Person5{
	public static void sayChina(){
		System.out.println("hahaha");
	}
}

public class InvokeSayChinaTest {

	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("com.java5200.date0615.Person5");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayChina");// 此方法没有参数
			met.invoke(c1.newInstance()); // 调用方法,必须传递对象实例
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
