package com.java5200.date0522;

public class OverLoad{

	public void show(int a,char b,double c){}//ԭ�ͺ���

	//public void show(int x,char y,double z){}//no  ����: ������ OverLoad�ж����˷��� show(int,char,double)

	public int show(int a,double c,char b){return 0;}//yes

	//public void show(int a,double c,char b){}//yes   ����: ������ OverLoad�ж����˷��� show(int,double,char)

	public boolean show(int a,char b){return false;}//yes

	public void show(double c){}//yes

	//public double show(int a,char b,double c){}//no  ����: ������ OverLoad�ж����˷��� show(int,char,double)

	public void shows(double c){}//no


	public static void main(String[] args){
		
		

	}
}