package com.java5200.date0526;

/*
 * 获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ ab”在 “abkkcadkabkebfkabkskab”中出现的次数
 */
public class ClassTest1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abhgfytftfuSgyabufutabJSHJGajshdg345";
		String replace = "ab";
		int count = (str.length() - str.replaceAll(replace, "").length())
				/ replace.length();
		System.out.println(str + "\nab字符串出现的次数：" + count);
		//方法2
		System.out.println(counts(str,"ab"));
	}

	// 方法2
	public static int counts(String s1, String s2) {
		int counts = 0;
		for (int i = 0; i < s1.length() - s2.length(); i++) {
			if (s2.equals(s1.substring(i, i + s2.length()))) {
				counts++;
			}
		}
		return counts;
	}

}
