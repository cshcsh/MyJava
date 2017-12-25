package com.java5200.date0615;

import java.io.InputStream;

class Ref4{
	
}

public class ClassLoaderTest2 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.获取一个系统类加载器
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		//2.获取系统类加载器的父类加载器,即扩展类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		//3.获取扩展类加载器的父类加载器,即引导类加载器,该加载器无法直接获取
		classloader = classloader.getParent();
		System.out.println(classloader);
		//4.测试当前类由哪个类加载器进行加载
		classloader =Class.forName("com.java5200.date0615.ClassLoaderTest").getClassLoader();
		System.out.println(classloader);
		//5.测试JDK提供的Object类由哪个类加载器加载
		classloader =Class.forName("java.lang.Object").getClassLoader();
		System.out.println(classloader);
		//6.关于类加载器的一个主要方法：
		//getResourceAsStream(String str);//获取类路径下的指定文件的输入流
		InputStream in = null;
		in =new Ref4().getClass().getClassLoader().getResourceAsStream("test02.txt");
		System.out.println(in);
	}
}
