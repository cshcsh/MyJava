package com.java5200.date0526;

/*
 * intern() ���������ַ�������Ĺ淶����ʾ��ʽ��
 * ����ѭ���¹��򣺶������������ַ��� s �� t�����ҽ��� s.equals(t) Ϊ true ʱ��
 * s.intern() == t.intern() ��Ϊ true
 * ����ֵ��һ���ַ�������������ַ�����ͬ����һ��ȡ�Ծ���Ψһ�ַ����ĳء�
 */
public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "atguigu";
		String s2 = "java";
		String s4 = "java";
		String s3 = new String("java");
		System.out.println(s2 == s3);
		//����ʱ��������"java"����Ϊ��ͬһ�����󱣴浽�˳������У�
		//����ʱJVM����Ϊ����������������ͬһ���������Է���true��
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s3));
		String s5 = "atguigujava";
		String s6 = (s1 + s2).intern();
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
	}
}
