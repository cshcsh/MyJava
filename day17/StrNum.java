package com.java5200.date0604;

public class StrNum {

	public static int strNum(String string, String string2) {
		int num = 0;
		int i = 0;
		int j = string2.length();
		while (i != string.length() - j) {

			if (string.substring(i, i + j).equals(string2)) {
				num++;
			}
			i++;

		}

		return num;
	}

	public static void main(String[] args) {

		System.out.println(strNum("qwewerettwewet", "we"));
	}

}
