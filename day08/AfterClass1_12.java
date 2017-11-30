package com.java5200.date0526;

/**
 * 获取两个字符串中最大相同子串。比如： str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class AfterClass1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";
		int a = 0;
		String s = "";
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 1; j < str2.length() + 1; j++) {
				if (j > i) {
					String temp = str2.substring(i, j);
					int t = str1.indexOf(str2.substring(i, j));
					if (t != -1) {// t存在
						if (temp.length() > a) {
							a = temp.length();
							s = temp;
						}
					}
				}
			}
		}
		System.out.println(s);
	}

}
