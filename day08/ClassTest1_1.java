package com.java5200.date0526;

//模拟一个trim方法,去除字符串两端的空格。
public class ClassTest1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  hello world!  ";
		str = trim(str);
		System.out.println("str=" + str);

	}

	public static String trim(String str) {
		char[] c = str.toCharArray();
		int len = c.length;
		int i = 0;
		while (i < len && c[i] <= ' ') {// 去掉字符串首位空格
			i++;
		}
		while (i < len && c[len - 1] <= ' ') {// 去掉末尾空格
			len--;
		}
		return str.substring(i, len);
	}

}
