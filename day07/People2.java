package com.java5200.date0525;

public class People2 {

	/*一个人有一本书，一本书属于一个人。从这
	样一句话中可以得出这样的结论：人应该是一个具
	体的类、书也应该是一个具体的类，在人的类中应
	该存在一个属性表示书的，在书的类中也应该存在
	一个属性表示人。*/
	private String name;
	private int age;
	private Book2 book;
	private People2 people;//孩子
	
	public People2 getPeople() {
		return people;
	}

	public void setPeople(People2 people) {
		this.people = people;
	}

	public People2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public People2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book2 getBook() {
		return book;
	}
	public void setBook(Book2 book) {
		this.book = book;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
