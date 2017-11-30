package com.java5200.date0526;

public class StringBufferDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer();
		buf.append("Zhangwuji");
		for (int i = 0; i < 100; i++) {
			buf.append(i);// StringBuffer可以修改,性能高
		}
		System.out.println(buf);
	}

}
