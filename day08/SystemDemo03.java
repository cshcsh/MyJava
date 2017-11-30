package com.java5200.date0526;

//列出指定属性
public class SystemDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("系统版本为:" + System.getProperty("os.name")
				+ System.getProperty("os.version")
				+ System.getProperty("os.arch"));// 获取当前系统版本
		System.out.println("系统用户为:" + System.getProperty("user.name"));
		System.out.println("当前用目录:" + System.getProperty("user.home"));
		System.out.println("当前用户工作目录:" + System.getProperty("user.dir"));
	}
}
