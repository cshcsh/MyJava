package com.java5200.date0606;

public class EnumTest6 {
	
	public static void main(String[] args) {
		// 枚举.values()表示得到全部枚举的内容
		for (Color2 c : Color2.values()) {
			System.out.println(c.ordinal() + " --> " + c.name());
		}
	}
}
