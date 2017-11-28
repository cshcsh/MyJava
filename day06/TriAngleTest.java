package com.java5200.date0524;

public class TriAngleTest {

	public static void main(String[] args){
		
		TriAngle triAngle=new TriAngle();
		triAngle.setBase(5);
		triAngle.setHeight(6);
		float a=triAngle.getArea();
		System.out.println("三角形面积："+a);
	}
}
