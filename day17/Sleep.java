package com.java5200.date0604;

public class Sleep {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {// 调用本机程序 必须进行异常处理
			Process pro = run.exec("notepad.exe");
			Thread.sleep(3000);
			pro.destroy();// 销毁进程
		} catch (Exception e) {
			e.printStackTrace();// 打印异常信息
		}
	}
}
