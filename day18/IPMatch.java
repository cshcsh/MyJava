package com.java5200.date0605;

/**
 * �Ժ��ڿ�����ʹ�����Ŀ϶���ֱ������ String �������򣬶� Pattern ��� Matcher ��������ǲ�ʹ�õġ�
 * 
 * @author CSH
 * @date 2018��6��5������5:28:11
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
