package com.java5200.date0605;

public class CheckNumber2 {

	public static void main(String[] args) {
		String str = "1234567";
		boolean flag = true; // ��������ȷ��
		char c[] = str.toCharArray(); // ���ַ�����Ϊ�ַ�����
		for (int x = 0; x < c.length; x++) {
			if (c[x] > '9' || c[x] < '0') { // �������֣��ж�c[x] > '9' || c[x] < '0'
				flag = false;
			}
		}
		if (flag) {
			System.out.println("����������ɣ�");
		} else {
			System.out.println("������������ɣ�");
		}
	}
}
