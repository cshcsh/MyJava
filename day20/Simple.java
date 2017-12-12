package com.java5200.date0607;

public class Simple {

	public void method1(String str) {
		System.out.println(str);
	}

	public void method2(String str) {
		method1(str);
	}

	public static void main(String[] args) {
		Simple s = new Simple();
		s.method2("hello!");
	}
}
