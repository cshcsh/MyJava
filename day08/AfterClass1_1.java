package com.java5200.date0526;

import java.util.Scanner;

/**
 * 获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class AfterClass1_1 {
	public static String getMaxSubString(String str1, String str2) {
		String max, min;
		// 比较哪个字符串比较长
		if (str1.length() > str2.length()) {
			max = str1;
			min = str2;
		} else {
			max = str2;
			min = str1;
		}
		// 获得最大子串
		// 外循环。控制在最短子串长度内
		for (int i = 0; i < min.length(); i++) {
			// 依次递减短字符串子串
			for (int x = 0, y = min.length() - i; y < min.length() + 1; x++, y++) {
				// 获取短字符串子串
				String temp = min.substring(x, y);
				// 如果长串包含，就返回最大子串temp
				if (max.contains(temp))
					return temp;
			}
		}
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("输入str1:");
		String str1 = sc.next();
		System.out.println("输入str2:");
		String str2 = sc.next();
		System.out.println("最大子串：" + getMaxSubString(str1, str2));

	}

}
