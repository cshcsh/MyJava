package com.java5200.date0605;

import java.text.NumberFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
		NumberFormat nf = null;
		nf = NumberFormat.getInstance();// 得到默认的数字格式
		System.out.println("格式化之后的数字：" + nf.format(1000000));
		System.out.println("格式化之后的数字：" + nf.format(1000.345));
	}
}
