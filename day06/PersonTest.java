package com.java5200.date0524;

public class PersonTest{

	public static void main(String[] args){
		
		Person person=new Person("csh", 18, "ÄÐ");
		person.addAge(2);
		person.showAge();
		person.study();
	}
}
