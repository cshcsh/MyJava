package com.java5200.date0526;

//��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��
//���罫��abcdefg����תΪ��abfedcg��
public class ClassTest1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdefg";
		System.out.println(str1);
		String str2 = reverse(str1, 2, 5);
		System.out.println(str2);

	}

	public static String reverse(String str, int start, int end) {
		String nowstr = str.substring(0, start);// �ַ�����㵽��ת���
		for (int i = end; i >= start; i--) {
			char j = str.charAt(i);// ��ת���ָ���ַ���
			nowstr += j;// �ַ�������뷴ת�ַ�������
		}
		nowstr += str.substring(end + 1);// ���ȡĩβ����-->���㿪ʼ
		return nowstr;
	}

}
