package com.java5200.date0526;

//调用本机可执行程序
public class RuntimeDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 通过Runtime类的静态方法为其实例化
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");// 调用本机程序 必须进行异常处理 会出现找不到程序的情况
		} catch (Exception e) {
			e.printStackTrace();// 打印异常信息
		}
	}

}
