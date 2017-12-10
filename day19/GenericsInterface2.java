package com.java5200.date0606;

interface Info6<T> { // 在接口上定义泛型
	public T getVar();
}

// 定义泛型接口的子类,指定类型为String
class InfoImpl2 implements Info6<String> {
	private String var; // 定义属性
	
	

	public InfoImpl2(String var) {
		super();
		this.var = var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getVar() { // 接口上已指明类型,所以此处必须是String
		return this.var;
	}
}


public class GenericsInterface2 {

	public static void main(String[] args) {
		//The type InfoImpl2 is not generic; it cannot be parameterized with arguments <String>
		Info6<String> demo = new InfoImpl2("hello");
		System.out.print(demo.getVar());
	}
}
