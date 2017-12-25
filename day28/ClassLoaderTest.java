package com.java5200.date0615;

public class ClassLoaderTest {

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
	}
}
