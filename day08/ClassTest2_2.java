package com.java5200.date0526;

/*
 * 已知字符串"The last French hostage held by Islamist militants, Serge Lazarevic"
 * 1)统计该字符串中字母s出现的次数
 * 2)取出第4个单词
 * 3)将字符串的每个单词的首字母大写。并输出结果
 */
public class ClassTest2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "The last French hostage held by Islamist militants, Serge Lazarevic";
		String[] str2 = str1.split(" ");// 对指定字符串进行拆分
		// 统计s出现的次数
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if ('s' == str1.charAt(i)) {
				count++;
			}
		}
		System.out.println("s出现的次数：" + count);
		// 取出第四个单词
		System.out.println("第四个单词是：" + str2[3]);
		// 将每个单词的首字母大写
		StringBuffer sbr = new StringBuffer(str1);
		if (sbr.charAt(0) >= 'a' && sbr.charAt(0) <= 'z') {
			sbr.setCharAt(0, (char) (sbr.charAt(0) - 32));
		}
		for (int i = 1; i < sbr.length(); i++) {
			if (sbr.charAt(i - 1) == ' ' && sbr.charAt(i) >= 'a'
					&& sbr.charAt(i) <= 'z') {
				sbr.setCharAt(i, (char) (sbr.charAt(i) - 32));
			}
		}
		System.out.println("大写后字母：" + sbr.toString());
	}

}
