package com.java5200.date0605;

public class CheckNumber2 {

	public static void main(String[] args) {
		String str = "1234567";
		boolean flag = true; // 假设是正确的
		char c[] = str.toCharArray(); // 将字符串变为字符数组
		for (int x = 0; x < c.length; x++) {
			if (c[x] > '9' || c[x] < '0') { // 不是数字，判断c[x] > '9' || c[x] < '0'
				flag = false;
			}
		}
		if (flag) {
			System.out.println("是由数字组成！");
		} else {
			System.out.println("不是由数字组成！");
		}
	}
}
