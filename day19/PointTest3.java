package com.java5200.date0606;

class Point3<T> { // �˴�����������ı�ʶ����,T��type�ļ��
	private T x; // �˱������������ⲿ����
	private T y;

	public Point3(T x, T y) {//�ڹ��췽�������÷���,ʵ�ж���ʹ��new Point3<T>(x,y);
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
		Point3<Integer> p = new Point3<Integer>(10, 20);// ���캯��
		int x = p.getX();
		int y = p.getY();
		System.out.println("x�������ǣ�" + x);
		System.out.println("y�������ǣ�" + y);
		Point3 point3=new Point3(3, 4);//���Ͳ���
		int x1 = p.getX();
		int y1 = p.getY();
		System.out.println("x�������ǣ�" + x1);
		System.out.println("y�������ǣ�" + y1);
	}
}
