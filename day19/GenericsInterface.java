package com.java5200.date0606;

interface Info5<T> { // 在接口上定义泛型
	public T getVar();
}

class InfoImpl<T> implements Info5<T> { // 定义泛型接口的子类
	private T var; // 定义属性

	public InfoImpl(T var) { // 通过构造方法设置属性内容
		this.setVar(var);
	}

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}
}

public class GenericsInterface {
	public static void main(String[] args) {
		Info5<String> demo = new InfoImpl<String>("hello");
		System.out.println(demo.getVar());
		
		Info5<Integer> demo2 = new InfoImpl<Integer>(55657);
		System.out.print(demo2.getVar());
	}

}
