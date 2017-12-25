package com.java5200.date0615;

class Ref2 {

}

public class GetClassTest2 {

	public static void main(String args[]) {
		Class<?> c1 = null; // 指定泛型
		Class<?> c2 = null; // 指定泛型
		Class<?> c3 = null; // 指定泛型
		try {
			c1 = Class.forName("com.java5200.date0615.Ref2");// 最常用的形式
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		c2 = new Ref2().getClass(); // 通过Object类中的方法实例
		c3 = Ref2.class; // 通过类.class实例化
		System.out.println("类名称：" + c1.getName()); // 得到类的名称
		System.out.println("类名称：" + c2.getName()); // 得到类的名称
		System.out.println("类名称：" + c3.getName()); // 得到类的名称
		System.out.println(c1==c2);
	}

}
