package com.java5200.date0525;

public class Static {

	private static int count=0;
	
	private String name;

	public Static(String name) {
		super();
		this.name = name;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Static.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
