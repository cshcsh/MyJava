package com.java5200.date0524;

public class Circle{

	private final static double PI=3.14; 

	private double radius;//�뾶
	private double area;//���
	private double perimeter;//�ܳ�

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public double getArea(double radius){

		return PI*radius*radius;
	}
	public double getPerimeter(double radius){

		return PI*radius*2;
	}
	
}
