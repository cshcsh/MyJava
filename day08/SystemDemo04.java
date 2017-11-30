package com.java5200.date0526;

class Person {
	public Person() {
		System.out.println("对象被创建~~ ");
	}

	public void finalize() throws Throwable {// 对象释放空间时默认调用此方法
		System.out.println("对象被回收~~~~ ");
	}
}

public class SystemDemo04 {
	public static void main(String[] args) {
		Person per = new Person();
		per = null;
		// 断开引用,释放空间
		System.gc();
		// 强制性释放空间
	}
}