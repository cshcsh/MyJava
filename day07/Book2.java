package com.java5200.date0525;

public class Book2 {

	/*一个人有一本书，一本书属于一个人。从这
	样一句话中可以得出这样的结论：人应该是一个具
	体的类、书也应该是一个具体的类，在人的类中应
	该存在一个属性表示书的，在书的类中也应该存在
	一个属性表示人。*/
	private String title;
	private float price;
	private People2 people;
	
	public Book2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book2(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public People2 getPeople() {
		return people;
	}
	public void setPeople(People2 people) {
		this.people = people;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
