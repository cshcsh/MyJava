package com.java5200.date0606;

class Info3<T> { // 此处泛型只能是数字类型
	private T var; // 此变量的类型由外部决定

	public T getVar() { // 返回值的类型由外部指定
		return var;
	}

	public void setVar(T var) { // 设置的类型由外部指定
		this.var = var;
	}

	public String toString() { // 覆写Object类中的toString()方法
		return this.var.toString();
	}
};


public class GenericsTest3 {
	public static void main(String[] args) {
		Info3<Object> i1 = new Info3<Object>(); // 满足下限范围
		Info3<String> i2 = new Info3<String>(); // 满足下限范围
		i1.setVar(new Object()); // 设置Object对象
		i2.setVar("李小龙"); // 设置字符串
		fun(i1);
		fun(i2);
	}// 只能接收String或Object类型的泛型
	//•而范围下限使用super进行声明,表示参数化的类型可能是所指定的类型,或者是此类型的父类型,直至Object类
	public static void fun(Info3<? super String> temp) {
		System.out.println("内容：" + temp);
	}

}
