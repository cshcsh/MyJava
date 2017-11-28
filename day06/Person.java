package com.java5200.date0524;

public class Person {

	private String name;
	private int age;
	private String sex;
	public void study(){
		
		System.out.println("studying");
	}
	public void showAge(){
		
		System.out.println("ÄêÁä£º"+age);
	}
	public void addAge(int i){
		
		age=age+2;
	}
	
	public Person() {
		super();
	}
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
