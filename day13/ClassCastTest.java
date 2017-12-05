package com.java5200.date0531;

import java.util.Date;

public class ClassCastTest {

	public static void main(String[] args) {
		
		Object obj = new Date();
		ClassCastTest classCastTest;
		classCastTest = (ClassCastTest) obj;
		System.out.println(classCastTest);
	}

}
