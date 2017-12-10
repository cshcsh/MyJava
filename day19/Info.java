package com.java5200.date0606;

public class Info<T> {

	private T name;
	
	public void setVar(T t) {
		// TODO Auto-generated method stub
		this.name=t;
	}

	public Info(T name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + "]";
	}
	
}
