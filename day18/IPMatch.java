package com.java5200.date0605;

/**
 * 以后在开发中使用最多的肯定是直接利用 String 操作正则，而 Pattern 类和 Matcher 类基本上是不使用的。
 * 
 * @author CSH
 * @date 2018年6月5日下午5:28:11
 */
public class IPMatch {

	public static void main(String[] args) {
		String ip = "192.168.1.2";
		String s[] = ip.split("\\.");
		for (int x = 0; x < s.length; x++) {
			System.out.println(s[x]);
		}
	}
}
