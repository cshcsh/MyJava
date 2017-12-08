package com.java5200.date0604;

public class RunTime {

	// 通过Runtime类的静态方法为其实例化
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");// 调用本机程序 必须进行异常处理
		} catch (Exception e) {
			e.printStackTrace();// 打印异常信息
		}
	}
}
