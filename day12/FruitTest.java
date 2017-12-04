package com.java5200.date0530;


interface Fruit{ // ����һ��ˮ���Ľӿ�
	
	public void eat() ; // ��ˮ���ķ���
}

class Apple implements Fruit{ // �������� ���� Apple
	
	public void eat(){
		System.out.println("** ��ƻ����") ;
	}
}

class Orange implements Fruit{ // �������� ���� Orange
	
	public void eat(){ // ��дeat()����
		System.out.println("** �����ӡ�") ;
	}
}

class Factory{ // ���幤����

	public static Fruit getInstance(String className){
		Fruit f = null ; // ����ӿڶ���
		if("apple".equals(className)){ // �ж����Ǹ�����ı��
			f = new Apple() ; // ͨ��Apple��ʵ�����ӿ�
		}
		if("orange".equals(className)){ // �ж����Ǹ�����ı��
			f = new Orange() ; // ͨ��Orange��ʵ�����ӿ�
		}
		return f ;
	}
}
public class FruitTest {
	
	public static void main(String args[]){
		//Fruit f = new Apple() ; // ʵ�����ӿ�
		//f.eat() ; // ���÷���
		
		//�������ģʽ
		Factory factory=new Factory();
		Fruit fruit=factory.getInstance("apple");
		fruit.eat();
	}
}