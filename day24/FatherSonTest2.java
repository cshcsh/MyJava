package com.java5200.date0611;

class FatherA {// ����
	FatherA() {
		new Other();
	}
}

class Other {// �����
	public Other() {
		new Son1();
	}
}

class Son1 extends FatherA {// ����
	public void test() {
		System.out.println("Hi, show me test");
	}
}

public class FatherSonTest2 {

	public static void main(String[] args) {

		Son1 s = new Son1();
		s.test();
		//Exception in thread "main" java.lang.StackOverflowErrorѭ������
	}

}
