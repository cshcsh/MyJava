package com.java5200.date0606;

class Point2<T> { // �˴�����������ı�ʶ����,T��type�ļ��
	private T x; // �˱������������ⲿ����
	private T y;

	public T getX() { // ����ֵ���������ⲿָ��
		return x;
	}

	public void setX(T var) {// ���õ��������ⲿָ��
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
		//�����var����ΪInteger����,����Object,����ʵ����ʱ��ָ������,Ĭ��Ϊ��Object��
		Point2<Integer> p = new Point2<Integer>() ;
		p.setX(30) ; p.setY(30) ; // ��������,�Զ�װ��
		System.out.println(p.getX()*2); // ������,������ȡ��
	}
}