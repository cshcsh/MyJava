package com.java5200.date0526;

/*
 * ��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
 * ���磺��ȡ�� ab���� ��abkkcadkabkebfkabkskab���г��ֵĴ���
 */
public class ClassTest1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abhgfytftfuSgyabufutabJSHJGajshdg345";
		String replace = "ab";
		int count = (str.length() - str.replaceAll(replace, "").length())
				/ replace.length();
		System.out.println(str + "\nab�ַ������ֵĴ�����" + count);
		//����2
		System.out.println(counts(str,"ab"));
	}

	// ����2
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
