package com.java5200.date0526;

/*
 * ��֪�ַ���"The last French hostage held by Islamist militants, Serge Lazarevic"
 * 1)ͳ�Ƹ��ַ�������ĸs���ֵĴ���
 * 2)ȡ����4������
 * 3)���ַ�����ÿ�����ʵ�����ĸ��д����������
 */
public class ClassTest2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "The last French hostage held by Islamist militants, Serge Lazarevic";
		String[] str2 = str1.split(" ");// ��ָ���ַ������в��
		// ͳ��s���ֵĴ���
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if ('s' == str1.charAt(i)) {
				count++;
			}
		}
		System.out.println("s���ֵĴ�����" + count);
		// ȡ�����ĸ�����
		System.out.println("���ĸ������ǣ�" + str2[3]);
		// ��ÿ�����ʵ�����ĸ��д
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
		System.out.println("��д����ĸ��" + sbr.toString());
	}

}
