package com.java5200.date0605;

public class CheckNumber {

	public static void main(String[] args) {
		String str = "1234s567";
		if (str.matches("\\d+")) {//������ʽ
			System.out.println("����������ɣ�");
		} else {
			System.out.println("������������ɣ�");
		}
	}
}
