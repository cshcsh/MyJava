package com.java5200.date0615;

import java.lang.reflect.Method;

class Person7{
	public  String sayHello(String string,int age){
		return string+"--->"+age;
	}
	
}

public class InvokeSayHelloTest {

	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("com.java5200.date0615.Person7");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayHello", String.class, int.class);// 此方法需要两个参数
			String rv = null; // 接收方法的返回值
			// 调用方法,必须传递对象实例,同时传递两个参数值
			rv = (String) met.invoke(c1.newInstance(), "张无忌", 30);
			System.out.println(rv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
