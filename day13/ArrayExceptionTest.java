package com.java5200.date0531;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		String friends[] = { "lisa", "bily", "kessy" };
		for (int i = 0; i < friends.length; i++) {//i < 5  �ĳ�  i<friends.length ��ֹ����Խ��
			System.out.println(friends[i]); // friends[4]?
		}
		System.out.println("\nthis is the end");
	}
}
