package com.java5200.date0525;

public class Point {

	private float x;
	private float y;
	private float z;
	//计算该“点”距原点距离平方的方法
	public float getDistantSquare(){
		float distantSquare=x*x+y*y+z*z;
		return distantSquare;
	}
	public Point(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	
}
