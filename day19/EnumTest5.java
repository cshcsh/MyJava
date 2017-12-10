package com.java5200.date0606;

public class EnumTest5 {

	public static void main(String[] args) {
		Color4 c = Enum.valueOf(Color4.class, "BLUE");
		c.setName("兰色"); // 设置一个错误的名字
		c.setName("蓝色"); // 设置一个正确的名字
		System.out.println(c.getName());
	}
}
