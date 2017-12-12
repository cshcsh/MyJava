package com.java5200.date0607;

class MyThreadIsAlive implements Runnable { // 实现Runnable接口
	public void run() { // 重写run()方法
		for (int i = 0; i < 3; i++) { // 循环输出3次
			System.out.println(Thread.currentThread().getName() + "运行 --> " + i); // 取得当前线程名称
		}
	}
};

public class AliveTest {

	public static void main(String args[]) {
		MyThreadIsAlive mt = new MyThreadIsAlive(); // 实例化对象
		Thread t = new Thread(mt, "线程"); // 实例化Thread对象
		System.out.println("线程开始执行之前 --> " + t.isAlive());// 判断是否启动
		t.start(); // 启动线程
		System.out.println("线程开始执行之后 --> " + t.isAlive());// 判断是否启动
		for (int i = 0; i < 3; i++) { // 循环输出3次
			System.out.println(" main 运行 --> " + i); // 输出
		}
		System.out.println("代码执行之后 --> " + t.isAlive());// 后面的输出结果不确定
	}
}
