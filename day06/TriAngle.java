package com.java5200.date0524;

public class TriAngle {

	private float base;
	private float height;
	//计算三角形的面积
	public float getArea(){
		
		float area=base*height/2;
		return area;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}
