package com.java5200.date0606;

enum Color2 { // 定义枚举类型
	RED, GREEN, BLUE; // 定义枚举的三个类型
}

public class EnumTest2 {

	public static void main(String[] args) {
		Color2 c = Color2.BLUE; // 取出蓝色
		System.out.println(c); // 输出信息

		for (Color2 c2 : Color2.values()) {
			System.out.println(c2); // 输出枚举内容
		}
	}
}
