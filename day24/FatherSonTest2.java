package com.java5200.date0611;

class FatherA {// 父类
	FatherA() {
		new Other();
	}
}

class Other {// 相关类
	public Other() {
		new Son1();
	}
}

class Son1 extends FatherA {// 子类
	public void test() {
		System.out.println("Hi, show me test");
	}
}

public class FatherSonTest2 {

	public static void main(String[] args) {

		Son1 s = new Son1();
		s.test();
		//Exception in thread "main" java.lang.StackOverflowError循环导致
	}

}
