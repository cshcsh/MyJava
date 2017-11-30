package com.java5200.date0526;

//将一个字符串进行反转。将字符串中指定部分进行反转。
//比如将“abcdefg”反转为”abfedcg”
public class ClassTest1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdefg";
		System.out.println(str1);
		String str2 = reverse(str1, 2, 5);
		System.out.println(str2);

	}

	public static String reverse(String str, int start, int end) {
		String nowstr = str.substring(0, start);// 字符串起点到反转起点
		for (int i = end; i >= start; i--) {
			char j = str.charAt(i);// 反转输出指定字符串
			nowstr += j;// 字符串起点与反转字符串连接
		}
		nowstr += str.substring(end + 1);// 与截取末尾连接-->从零开始
		return nowstr;
	}

}
