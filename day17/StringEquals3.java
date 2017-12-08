package com.java5200.date0604;

public class StringEquals3 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hello";
		System.out.println("str1==str2-->" + (str1 == str2)); // --> true
		System.out.println("str1==str3-->" + (str1 == str3)); // --> true
		System.out.println("str2==str3-->" + (str2 == str3)); // --> true
	}
}
