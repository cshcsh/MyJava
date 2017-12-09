package com.java5200.date0605;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		BigDecimal bi1 = new BigDecimal(Double.MAX_VALUE);
		BigDecimal bi2 = new BigDecimal(Double.MAX_VALUE);
		System.out.println("加法操作：" + bi2.add(bi1)); // 加法操作
		System.out.println("减法操作：" + bi2.subtract(bi1)); // 减法操作
		System.out.println("乘法操作：" + bi2.multiply(bi1)); // 乘法操作
		System.out.println("除法操作：" + bi2.divide(bi1)); // 除法操作
	}
}
