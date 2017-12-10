package com.java5200.date0606;

public class GenericsTest {

	public static void main(String[] args) {
		Info i = new Info<String>("csh");
		i.setVar("李小龙"); // 设置字符串
		fun(i); // 泛型类型必须匹配才可以传递
		
		Info i2 = new Info<Integer>(555555);
		i.setVar(5); // 设置字符串
		fun(i); // 泛型类型必须匹配才可以传递
		
	}


	// 此处可以接收Object泛型类型的Info对象
	public static <T> void fun(Info<T> i) {
		System.out.println("内容：" + i);
	}
}
