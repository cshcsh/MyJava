package com.java5200.date0526;

import java.util.Scanner;

/**
 * ��ȡ�����ַ����������ͬ�Ӵ������磺
 * str1 = "abcwerthelloyuiodef��;str2 = "cvhellobnm"
 * ��ʾ�����̵��Ǹ������г������εݼ����Ӵ���ϳ��Ĵ��Ƚϡ�
 */
public class AfterClass1_1 {
	public static String getMaxSubString(String str1, String str2) {
		String max, min;
		// �Ƚ��ĸ��ַ����Ƚϳ�
		if (str1.length() > str2.length()) {
			max = str1;
			min = str2;
		} else {
			max = str2;
			min = str1;
		}
		// �������Ӵ�
		// ��ѭ��������������Ӵ�������
		for (int i = 0; i < min.length(); i++) {
			// ���εݼ����ַ����Ӵ�
			for (int x = 0, y = min.length() - i; y < min.length() + 1; x++, y++) {
				// ��ȡ���ַ����Ӵ�
				String temp = min.substring(x, y);
				// ��������������ͷ�������Ӵ�temp
				if (max.contains(temp))
					return temp;
			}
		}
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����str1:");
		String str1 = sc.next();
		System.out.println("����str2:");
		String str2 = sc.next();
		System.out.println("����Ӵ���" + getMaxSubString(str1, str2));

	}

}
