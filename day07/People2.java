package com.java5200.date0525;

public class People2 {

	/*һ������һ���飬һ��������һ���ˡ�����
	��һ�仰�п��Եó������Ľ��ۣ���Ӧ����һ����
	����ࡢ��ҲӦ����һ��������࣬���˵�����Ӧ
	�ô���һ�����Ա�ʾ��ģ����������ҲӦ�ô���
	һ�����Ա�ʾ�ˡ�*/
	private String name;
	private int age;
	private Book2 book;
	private People2 people;//����
	
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
