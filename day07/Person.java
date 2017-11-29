package com.java5200.date0525;

public class Person{

	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean compare(Person person){
		if(this==person){
			return true;
		}
		if(this.name.equals(person.name)&&this.age==person.age){
			return true;
		}else{
			return false;
		}
	}
}