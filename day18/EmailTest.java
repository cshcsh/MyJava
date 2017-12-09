package com.java5200.date0605;

public class EmailTest {

	public static void main(String[] args) {
		String email = "aa@aa.com";
		if (email.matches("\\w+@\\w+\\.\\w+")) {
			System.out.println("验证通过！");
		}
	}
}
