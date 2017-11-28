package com.java5200.date0524;

public class ToXiaMen{

	public static void main(String[] args){
		
		People csh=new People("陈胜宏",22);//人类对象-csh
		Car car=new Car("宝马");//宝马车对象
		Difang start=new Difang("南昌","英雄城");//开始地对象-南昌
		Difang end=new Difang("厦门","鹭岛");//结束地对象-厦门
		System.out.print(csh.getAge()+"岁的"+csh.getName()+"驾驶"+car.getName()+"车从");
		csh.drive(car,start,end);//对象驾驶
	}
}

class People{

	private String name;//姓名
	private int age;//年龄
	public People(){
	
	}
	public People(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){	
		return name;
	}
	public void setAge(int age){	
		this.age=age;
	}
	public int getAge(){	
		return age;
	}

	public void drive(Car car,Difang start,Difang end){//人开车方法 
		
		car.drive(start,end);//宝马车行驶
	}
}
class Difang{
	
	private String name;//地名
	private String dec;//地方描述

	public Difang(){
	
	}
	public Difang(String name,String dec){
		this.name=name;
		this.dec=dec;
	}
	public void setName(String name){	
		this.name=name;
	}
	public String getName(){	
		return name;
	}
	public void setDec(String dec){	
		this.dec=dec;
	}
	public String getDec(){		
		return dec;
	}
}

class Car{
	
	private String name;//车名
	public Car(){
	
	}
	public Car(String name){
		this.name=name;
	}
	public void setName(String name){		
		this.name=name;
	}
	public String getName(){	
		return name;
	}
	public void drive(Difang d1,Difang d2){
		
		System.out.println(d1.getDec()+"-"+d1.getName()+" 到 "+d2.getDec()+"-"+d2.getName());
	}
}