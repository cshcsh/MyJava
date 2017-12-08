package com.java5200.date0604;

import java.util.Date;


public class DateTest {

	public static void testDate() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(System.currentTimeMillis());
		System.out.println(date.getTime());
		Date date1 = new Date(date.getTime());
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
	}
	
	public static void main(String[] args) {
		testDate();
	}
}
