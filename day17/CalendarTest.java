package com.java5200.date0604;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		// ��һ�� Calendar �����л�ȡ Date ����
		Date date = calendar.getTime();
		//ʹ�ø����� Date ���ô� Calendar ��ʱ��
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		System.out.println("��ǰʱ��������Ϊ8��,ʱ����:" +
		calendar.getTime());
		calendar.add(Calendar.HOUR, 2);
		System.out.println("��ǰʱ���2Сʱ��,ʱ����:" +
		calendar.getTime());
		calendar.add(Calendar.MONTH, -2);
		System.out.println("��ǰ���ڼ�2���º�,ʱ����:" +
		calendar.getTime());
	}

}
