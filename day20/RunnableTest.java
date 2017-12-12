package com.java5200.date0607;

public class RunnableTest implements Runnable {

	private String name; // 在类中定义一个属性

	public RunnableTest(String name) { // 通过构造方法设置属性内容
		this.name = name;
	}

	public void run() { // 重写Runnable接口中的run()方法
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "运行,i = " + i);
		}
	}
}
