package com.java5200.date0606;

class Point {
	private Object x; // 表示x坐标
	private Object y; // 表示y坐标

	public void setX(Object x) {
		this.x = x;
	}

	public void setY(Object y) {
		this.y = y;
	}

	public Object getX() {
		return this.x;
	}

	public Object getY() {
		return this.y;
	}
};

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);// 利用自动装箱操作：int --> Integer --> Object
		p.setY("北纬210度"); // String --> Object
		int x = (Integer) p.getX(); // 取出数据
		int y = (Integer) p.getY();// 取出数据 此处出现了类转换错误, java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		System.out.println("整数表示,X坐标为：" + x);
		System.out.println("整数表示,Y坐标为：" + y);
	}
}
