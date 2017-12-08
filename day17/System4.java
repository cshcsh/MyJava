package com.java5200.date0604;

class Person {
	public Person() {
		System.out.println("对象被创建~~ ");
	}

	public void finalize() throws Throwable {
		System.out.println("对象被回收~~~~ ");
	}
}

public class System4 {

	public static void main(String[] args) {
		Person per = new Person();
		per = null;
		System.gc();
	}
}
