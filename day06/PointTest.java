package com.java5200.date0524;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point=new Point(2, -4, 5.5f);
		float a=point.getDistantSquare();
		System.out.println("�á��㡱��ԭ�����ƽ��:"+a);
		point.setX(5);
		point.setY(6);
		point.setZ(8);
		float b=point.getDistantSquare();
		System.out.println("------------------------------");
		System.out.println("�á��㡱��ԭ�����ƽ��:"+b);
	}

}
