package com.java5200.date0530;


interface Fruit{ // 定义一个水果的接口
	
	public void eat() ; // 吃水果的方法
}

class Apple implements Fruit{ // 定义子类 —— Apple
	
	public void eat(){
		System.out.println("** 吃苹果。") ;
	}
}

class Orange implements Fruit{ // 定义子类 —— Orange
	
	public void eat(){ // 重写eat()方法
		System.out.println("** 吃橘子。") ;
	}
}

class Factory{ // 定义工厂类

	public static Fruit getInstance(String className){
		Fruit f = null ; // 定义接口对象
		if("apple".equals(className)){ // 判断是那个子类的标记
			f = new Apple() ; // 通过Apple类实例化接口
		}
		if("orange".equals(className)){ // 判断是那个子类的标记
			f = new Orange() ; // 通过Orange类实例化接口
		}
		return f ;
	}
}
public class FruitTest {
	
	public static void main(String args[]){
		//Fruit f = new Apple() ; // 实例化接口
		//f.eat() ; // 调用方法
		
		//工厂设计模式
		Factory factory=new Factory();
		Fruit fruit=factory.getInstance("apple");
		fruit.eat();
	}
}