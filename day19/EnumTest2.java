package com.java5200.date0606;

enum Color2 { // ����ö������
	RED, GREEN, BLUE; // ����ö�ٵ���������
}

public class EnumTest2 {

	public static void main(String[] args) {
		Color2 c = Color2.BLUE; // ȡ����ɫ
		System.out.println(c); // �����Ϣ

		for (Color2 c2 : Color2.values()) {
			System.out.println(c2); // ���ö������
		}
	}
}
