package com.java5200.date0525;

public class Book {

	/*һ������һ���飬һ��������һ���ˡ�����
	��һ�仰�п��Եó������Ľ��ۣ���Ӧ����һ����
	����ࡢ��ҲӦ����һ��������࣬���˵�����Ӧ
	�ô���һ�����Ա�ʾ��ģ����������ҲӦ�ô���
	һ�����Ա�ʾ�ˡ�*/
	private String title;
	private float price;
	private People people;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, float price) {
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

	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}