package com.java5200.date0606;

class Info7<T extends Number> { // 此处泛型只能是数字类型
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

//通过方法返回泛型类实例
public class GenericsTest6 {
	public static void main(String args[]) {
		Info7<Integer> i = fun(30); // 传递整数到fun()方法
		System.out.println(i.getVar());
	}
	
	public static <T extends Number> Info7<T> fun(T param) {
		Info7<T> temp = new Info7<T>(); // 根据传入的数据类型实例化Info对象
		temp.setVar(param); // 将传递的内容设置到Info类中的var属性之中
		return temp; // 返回实例化对象
	}

}
