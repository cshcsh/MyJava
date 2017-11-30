package com.java5200.date0526;

public class RuntimeDemo03 {
//在关闭前使用Thread.sleep()就可以延迟关闭
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 通过Runtime类的静态方法为其实例化
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
