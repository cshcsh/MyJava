package com.java5200.date0606;

class Point2<T> { // 此处可以是任意的标识符号,T是type的简称
	private T x; // 此变量的类型由外部决定
	private T y;

	public T getX() { // 返回值的类型由外部指定
		return x;
	}

	public void setX(T var) {// 设置的类型由外部指定
		this.x = var;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
}
public class PointTest2 {

	public static void main(String[] args) {
		//里面的var类型为Integer类型,考虑Object,对象实例化时不指定泛型,默认为：Object。
		Point2<Integer> p = new Point2<Integer>() ;
		p.setX(30) ; p.setY(30) ; // 设置数字,自动装箱
		System.out.println(p.getX()*2); // 计算结果,按数字取出
	}
}