package com.java5200.date0604;

class Person {
	public Person() {
		System.out.println("���󱻴���~~ ");
	}

	public void finalize() throws Throwable {
		System.out.println("���󱻻���~~~~ ");
	}
}

public class System4 {

	public static void main(String[] args) {
		Person per = new Person();
		per = null;
		System.gc();
	}
}
