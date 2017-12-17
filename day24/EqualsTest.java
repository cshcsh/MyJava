package com.java5200.date0611;


public class EqualsTest {

	public static void main(String[] args) {
		int i=80;
		String s=String.valueOf(i<100?90:100);
		String s1=String.valueOf(i<100?90:100.0);//类型不一致
		System.out.println(s.equals(s1));
	}

}
