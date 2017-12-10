package com.java5200.date0606;

class Info8<T> {
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
//使用泛型统一传入的参数类型
public class GenericsTest7 {
	public static void main(String args[]) {
		Info8<String> i1 = new Info8<String>(); // 设置String为泛型类型
		Info8<String> i2 = new Info8<String>(); // 设置String为泛型类型
		i1.setVar("HELLO"); // 设置内容
		i2.setVar("李小龙"); // 设置内容
		add(i1, i2);
	}
	
	public static <T> void add(Info8<T> i1, Info8<T> i2) {
		System.out.println(i1.getVar() + " " + i2.getVar());
	}

}
