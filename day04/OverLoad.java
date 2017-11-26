package com.java5200.date0522;

public class OverLoad{

	public void show(int a,char b,double c){}//原型函数

	//public void show(int x,char y,double z){}//no  错误: 已在类 OverLoad中定义了方法 show(int,char,double)

	public int show(int a,double c,char b){return 0;}//yes

	//public void show(int a,double c,char b){}//yes   错误: 已在类 OverLoad中定义了方法 show(int,double,char)

	public boolean show(int a,char b){return false;}//yes

	public void show(double c){}//yes

	//public double show(int a,char b,double c){}//no  错误: 已在类 OverLoad中定义了方法 show(int,char,double)

	public void shows(double c){}//no


	public static void main(String[] args){
		
		

	}
}