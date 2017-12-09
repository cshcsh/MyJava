package com.java5200.date0605;

import java.text.DecimalFormat;

class FormatDemo {
	
	public FormatDemo() {
		super();
	}
	
	public void format1(String pattern, double value) {
		DecimalFormat df = null; // ����һ��DecimalFormat����
		df = new DecimalFormat(pattern); // ʵ��������
		String str = df.format(value); // ��ʽ������
		System.out.println("ʹ��" + pattern + "��ʽ������" + value + "��" + str);
	}
}
public class DecimalFormatTest {

	public static void main(String[] args) {
		FormatDemo demo = new FormatDemo();
		demo.format1("###,###.###", 111222.34567);
		demo.format1("000,000.000", 11222.34567);
		demo.format1("###,###.###��", 111222.34567);
		demo.format1("000,000.000��", 11222.34567);
		demo.format1("##.###%", 0.345678); // ʹ�ðٷ�����ʽ
		demo.format1("00.###%", 0.0345678); // ʹ�ðٷ�����ʽ
		demo.format1("###.###\u2030", 0.345678); // ʹ��ǧ������ʽ
	}
}
