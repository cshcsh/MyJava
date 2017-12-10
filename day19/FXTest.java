package com.java5200.date0606;

class Point5<T> { // 此处可以是任意的标识符号,T是type的简称
	private T x; // 此变量的类型由外部决定
	private T y;

	public Point5(T x, T y) {//在构造方法上引用泛型,实列对象使用new Point3<T>(x,y);
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

public class FXTest<T> {

	public static <T> void fun(Point5<T> p){
		System.out.println(p.getX());
	}
	public  <T> void fun2(Point5<T> p){
		System.out.println(p.getX());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point5<Integer> p=new Point5<Integer>(3, 5);
		fun(p);
		FXTest<Point5> fxTest=new FXTest<Point5>();
		fxTest.fun2(p);
		FXTest<String> fxTest2=new FXTest<String>();
		fxTest2.fun2(p);
		Point5<String> p2=new Point5<String>("23fds4", "dgds");
		fun(p2);//The method fun(Point5<T>) from the type FXTest refers to the missing type T
	}

}
