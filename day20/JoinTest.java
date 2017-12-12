package com.java5200.date0607;

class MyThreadJoin implements Runnable { // 实现Runnable接口
	public void run() { // 重写run()方法
		for (int i = 0; i < 50; i++) { // 循环50次
			System.out.println(Thread.currentThread().getName() + "运行 --> " + i); // 输出线程名称
		}
	}
};


public class JoinTest {

	public static void main(String args[]) {
		MyThreadJoin mt = new MyThreadJoin(); // 实例化对象
		Thread t = new Thread(mt, "子线程"); // 实例化Thread对象
		t.start(); // 线程启动
		for (int i = 0; i < 50; i++) { // 循环50次
			if (i > 10) { // 判断变量内容
				try {
					t.join(); // 线程t进行强制运行
				} catch (Exception e) {
				} // 需要进行异常处理
			}
			System.out.println("Main 线程运行 --> " + i);
		}
	}
}
