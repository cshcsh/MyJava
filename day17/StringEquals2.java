package com.java5200.date0604;

public class StringEquals2 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = str2;
		System.out.println("str1 equals str2 --> " + (str1.equals(str2))); // -->true
		System.out.println("str1 equals str3 --> " + (str1.equals(str3))); // -->true
		System.out.println("str2 equals str3 --> " + (str2.equals(str3))); // -->true
	}
}
