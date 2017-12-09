package com.java5200.date0605;

public class CheckNumber {

	public static void main(String[] args) {
		String str = "1234s567";
		if (str.matches("\\d+")) {//正则表达式
			System.out.println("是由数字组成！");
		} else {
			System.out.println("不是由数字组成！");
		}
	}
}
