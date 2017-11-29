package com.java5200.date0525;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static s;
		for (int i = 0; i < 10; i++) {
			s=new Static("csh "+i);
			System.out.println("构造 "+s.getName()+" 对象");
			System.out.println("这是第 "+s.getCount()+" 个对象");
		}
	}

}
