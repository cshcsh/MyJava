package com.java5200.date0604;

public class Trans {

	public static String trans(String string, int a, int b) {
		String string2 = "";
		int i = 0;
		int j = b;
		while (i != string.length()) {

			if (i < a || i > b) {
				string2 += string.charAt(i);
				i++;
			}
			if (i >= a && i <= b) {
				string2 += string.charAt(j);
				j = j - 1;
				i++;
			}
		}

		return string2;
	}

	public static void main(String[] args) {

		System.out.println(trans("qwewerettet", 3, 6));
	}

}
