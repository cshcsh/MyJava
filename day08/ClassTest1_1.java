package com.java5200.date0526;

//ģ��һ��trim����,ȥ���ַ������˵Ŀո�
public class ClassTest1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  hello world!  ";
		str = trim(str);
		System.out.println("str=" + str);

	}

	public static String trim(String str) {
		char[] c = str.toCharArray();
		int len = c.length;
		int i = 0;
		while (i < len && c[i] <= ' ') {// ȥ���ַ�����λ�ո�
			i++;
		}
		while (i < len && c[len - 1] <= ' ') {// ȥ��ĩβ�ո�
			len--;
		}
		return str.substring(i, len);
	}

}
