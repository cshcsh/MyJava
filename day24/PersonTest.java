package com.java5200.date0611;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new PersonTest().new Person(19);//�޷�����PersonTest���͵ķ��ʵ���������ø����޶�����
		p.seeMovie();
	}

	class Person {
		public Person(int _age) {
			if (_age < 18) {
				throw new RuntimeException("����������18�ꡣ");
			}
		}

		public void seeMovie() {
			System.out.println("�����Ƽ���Ӱ");
		}
	}
}
