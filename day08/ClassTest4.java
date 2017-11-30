package com.java5200.date0526;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 *取得当前系统时间
 *现有一个接口MyDateTime
 *取得日期的字符串,
 *例如：2009-12-22
 *public String getDate() ;
 *取得日期时间的字符串
 *例如：2009-12-22 11:06:23.345
 *public String getDateTime() ;
 *要求用两种方式实现
 *实现一：基于Calendar类
 *实现二：基于SimpleDateFormat类
 */

interface MyDateTime {
	// public String getDate();
	public String getDateTime();

}

class CalendarDate implements MyDateTime {
	Calendar calender = Calendar.getInstance();// 实例化-->单例模式

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
