package com.java5200.date0606;

class Demo {
	public <T> T fun(T t) { // 可以接收任意类型的数据
		return t;
	}
}


// •泛型方法的简单定义：•[访问权限] <泛型> 返回类型 方法名([泛型标识参数名称]) 抛出的异常
public class GenericsTest5 {
	public static void main(String args[]) {
		Demo d = new Demo();
		String str = d.fun("李小龙"); // 传递字符串
		int i = d.fun(30); // 传递数字,自动装箱
		System.out.println(str); // 输出内容
		System.out.println(i); // 输出内容
	}

}
