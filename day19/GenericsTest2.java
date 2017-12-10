package com.java5200.date0606;

public class GenericsTest2 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>("rr");// 指定Object为泛型类型
		i.setVar("李小龙"); // 设置字符串
		fun(i);
	}

	public static void fun(Info<?> temp) {// 此处可以接Info的对象,使用通配符，Info<?>”的代码形式,表示可以使用任意的泛型类型对象
		System.out.println("内容：" + temp);
	}
}
