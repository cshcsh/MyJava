package com.java5200.date0615;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.��ȡһ��ϵͳ�������
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		//2.��ȡϵͳ��������ĸ��������,����չ�������
		classloader = classloader.getParent();
		System.out.println(classloader);
		//3.��ȡ��չ��������ĸ��������,�������������,�ü������޷�ֱ�ӻ�ȡ
		classloader = classloader.getParent();
		System.out.println(classloader);
		//4.���Ե�ǰ�����ĸ�����������м���
		classloader =Class.forName("com.java5200.date0615.ClassLoaderTest").getClassLoader();
		System.out.println(classloader);
	}
}
