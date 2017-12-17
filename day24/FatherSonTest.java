package com.java5200.date0611;

class Father{
	public static void doTest(){
		System.out.println("我是父类静态方法");
	}
	public void notStatic(){
		System.out.println("我是父类非静态方法");
	}
}
class Son extends Father{
	
	public static void doTest(){
		System.out.println("我是子类静态方法");
	}
	public void notStatic(){
		System.out.println("我是子类非静态方法");
	}
}

public class FatherSonTest {

	public static void main(String[] args) {
		
		Father father=new Son();
		father.doTest();
		father.notStatic();
		//我是父类静态方法
		//我是子类非静态方法
		//
	}
	

}
