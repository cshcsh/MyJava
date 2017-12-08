package com.java5200.date0604;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Zhangwuji");
		for (int i = 0; i < 100; i++) {
			buf.append(i);
		}
		System.out.println(buf);
	}
}
