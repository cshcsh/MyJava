package com.java5200.date0526;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 *ȡ�õ�ǰϵͳʱ��
 *����һ���ӿ�MyDateTime
 *ȡ�����ڵ��ַ���,
 *���磺2009-12-22
 *public String getDate() ;
 *ȡ������ʱ����ַ���
 *���磺2009-12-22 11:06:23.345
 *public String getDateTime() ;
 *Ҫ�������ַ�ʽʵ��
 *ʵ��һ������Calendar��
 *ʵ�ֶ�������SimpleDateFormat��
 */

interface MyDateTime {
	// public String getDate();
	public String getDateTime();

}

class CalendarDate implements MyDateTime {
	Calendar calender = Calendar.getInstance();// ʵ����-->����ģʽ

	// @Override
	// public String getDate() {
	// // TODO Auto-generated method stub
	// return calender.get(Calendar.YEAR) + "-" +
	// (calender.get(Calendar.MONTH)+1) +
	// "-" + calender.get(Calendar.DAY_OF_MONTH);
	// }

	@Override
	public String getDateTime() {
		// TODO Auto-generated method stub
		return calender.get(Calendar.YEAR) + "-"
				+ (calender.get(Calendar.MONTH) + 1) + "-"
				+ calender.get(Calendar.DAY_OF_MONTH) + "   "
				+ calender.get(Calendar.HOUR_OF_DAY) + ":"
				+ calender.get(Calendar.MINUTE) + ":"
				+ calender.get(Calendar.SECOND) + "."
				+ calender.get(Calendar.MILLISECOND);
	}

}

class SimpleDateFormatDate implements MyDateTime {

	Date d = new Date();

	@Override
	public String getDateTime() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss.SSS");
		return sdf.format(d);
	}
}

public class ClassTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarDate cal = new CalendarDate();
		System.out.println(cal.getDateTime());
		System.out.println("================================");
		SimpleDateFormatDate sdf = new SimpleDateFormatDate();
		System.out.println(sdf.getDateTime());
	}

}
