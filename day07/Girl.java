package com.java5200.date0525;

public class Girl{

	private String name;
	public Girl(){}
	public Girl(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void marry(Boy boy){
		System.out.println(this.name+"  ¼Þ¸ø  "+boy.getName());
	}
}