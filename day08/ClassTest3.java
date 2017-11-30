package com.java5200.date0526;

/*
 * 设计一个计算java方法代码 执行耗时(毫秒)和内存消耗(KB)的功能类,在方法执行后能反馈给用户方法耗时和内存消耗的情况
 * 给出几个测试应用,观察执行情况
 * (代理模式)
 */
interface Function {
	void fun();
}

class Test implements Function {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		String s = "hello";
		for (int i = 0; i < 1000; i++) {
			s += i;
		}
		// Runtime.getRuntime().gc();
		// Runtime.getRuntime();
	}

}

// 代理
class Agent {
	public long currentTime() {
		return System.currentTimeMillis();// 返回以毫秒为单位的当前时间
	}

	public long currentStore() {
		return Runtime.getRuntime().freeMemory();// 返回 Java 虚拟机中的空闲内存量
	}
}

public class ClassTest3 {
	private Agent agent = new Agent();

	public void function(Function fun) {
		long starttime = agent.currentTime();
		long startstore = agent.currentStore();
		fun.fun();// 调用方法
		long endtime = agent.currentTime();
		long endstore = agent.currentStore();
		System.out.println("方法消耗时间：" + (endtime - starttime) + "毫秒");
		System.out.println("消耗内存：" + (startstore - endstore) / 1024 + "kb");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ClassTest3().function(new Test());
		Runtime.getRuntime().gc();

	}

}
