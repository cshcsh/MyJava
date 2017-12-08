package com.java5200.date0604;



public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Zhangwuji");
		for (int i = 0; i < 100; i++) {
			buf.append(i);// StringBuffer可以修改,性能高
		}
		System.out.println(buf);
	}
}
