package com.java5200.date0529;

public abstract class AbstractTest {

	private String name;
	private int age;
	
	
	public AbstractTest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void printInfo();
}

