package com.java5200.date0615;

import java.io.InputStream;

class Ref4{
	
}

public class ClassLoaderTest2 {

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
		//5.����JDK�ṩ��Object�����ĸ������������
		classloader =Class.forName("java.lang.Object").getClassLoader();
		System.out.println(classloader);
		//6.�������������һ����Ҫ������
		//getResourceAsStream(String str);//��ȡ��·���µ�ָ���ļ���������
		InputStream in = null;
		in =new Ref4().getClass().getClassLoader().getResourceAsStream("test02.txt");
		System.out.println(in);
	}
}
