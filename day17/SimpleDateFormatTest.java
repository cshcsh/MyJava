package com.java5200.date0604;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Date date = new Date(); // 产生一个Date实例
		// 产生一个formater格式化的实例
		SimpleDateFormat formater = new SimpleDateFormat();
		System.out.println(formater.format(date));// 打印输出默认的格式
		SimpleDateFormat formater2 = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
		System.out.println(formater2.format(date));
		// 实例化一个指定的格式对象
		// 按指定的格式输出
		try {
			Date date2 = formater2.parse("2008年08月08日 星期一 08:08:08");
			// 将指定的日期解析后格式化按指定的格式输出
			System.out.println(date2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
