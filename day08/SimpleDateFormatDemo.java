package com.java5200.date0526;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(); // ����һ��Dateʵ��
		// ����һ��formater��ʽ����ʵ��
		SimpleDateFormat formater = new SimpleDateFormat();
		System.out.println(formater.format(date));// ��ӡ���Ĭ�ϵĸ�ʽ
		SimpleDateFormat formater2 = new SimpleDateFormat(
				"yyyy��MM��dd�� EEE HH:mm:ss");
		System.out.println(formater2.format(date));
		// ʵ����һ��ָ���ĸ�ʽ����
		// ��ָ���ĸ�ʽ���

		try {
			// SimpleDateFormat�е�parse��������
			// ��String�͵��ַ���ת�����ض���ʽ��date����
			Date date2 = formater2.parse("2008��08��08�� ����һ   08:08:08");//��ʽ��涨��һ��
			// ��ָ�������ڽ������ʽ����ָ���ĸ�ʽ���
			System.out.println(date2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
