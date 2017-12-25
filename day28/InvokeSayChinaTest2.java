package com.java5200.date0615;

import java.lang.reflect.Method;

class Person6{
	private  void sayChina(){
		System.out.println("hahaha");
	}
}

public class InvokeSayChinaTest2 {

	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("com.java5200.date0615.Person6");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met =null;
			met = c1.getDeclaredMethod("sayChina");// 此方法没有参数
			met.setAccessible(true);
			//若原方法声明为private,则需要在调用此invoke()方法前,显式调用方法对象的setAccessible(true)方法,将可访问private的方法
			met.invoke(c1.newInstance()); // 调用方法,必须传递对象实例
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
