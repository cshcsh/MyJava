package com.java5200.date0605;

import java.text.NumberFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
		NumberFormat nf = null;
		nf = NumberFormat.getInstance();// �õ�Ĭ�ϵ����ָ�ʽ
		System.out.println("��ʽ��֮������֣�" + nf.format(1000000));
		System.out.println("��ʽ��֮������֣�" + nf.format(1000.345));
	}
}
