package com.java5200.date0526;
//字符串的内容一旦声明则不可改变
public class StringDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		str = str + " world!";//改变的是堆内存地址的指向
		System.out.println("str = " + str);
	}

}
