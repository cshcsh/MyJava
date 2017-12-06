package com.java5200.date0601;

public class Man {

	private String name;
	private int age;
	
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void drive(Car car,Address address){
		System.out.println(getName()+" ¿ª"+car.getName()+" ³µÈ¥"+address);
	}
	
}
