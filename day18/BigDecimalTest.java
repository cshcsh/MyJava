package com.java5200.date0605;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		BigDecimal bi1 = new BigDecimal(Double.MAX_VALUE);
		BigDecimal bi2 = new BigDecimal(Double.MAX_VALUE);
		System.out.println("�ӷ�������" + bi2.add(bi1)); // �ӷ�����
		System.out.println("����������" + bi2.subtract(bi1)); // ��������
		System.out.println("�˷�������" + bi2.multiply(bi1)); // �˷�����
		System.out.println("����������" + bi2.divide(bi1)); // ��������
	}
}
