package com.java5200.date0606;

class Point3<T> { // 此处可以是任意的标识符号,T是type的简称
	private T x; // 此变量的类型由外部决定
	private T y;

	public Point3(T x, T y) {//在构造方法上引用泛型,实列对象使用new Point3<T>(x,y);
		this.setX(x);
		this.setY(y);
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

};

public class PointTest3 {

	public static void main(String[] args) {
		Point3<Integer> p = new Point3<Integer>(10, 20);// 构造函数
		int x = p.getX();
		int y = p.getY();
		System.out.println("x的坐标是：" + x);
		System.out.println("y的坐标是：" + y);
		Point3 point3=new Point3(3, 4);//泛型擦除
		int x1 = p.getX();
		int y1 = p.getY();
		System.out.println("x的坐标是：" + x1);
		System.out.println("y的坐标是：" + y1);
	}
}
