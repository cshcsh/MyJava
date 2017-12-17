package com.java5200.date0611;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new PersonTest().new Person(19);//无法访问PersonTest类型的封闭实例。必须用附件限定分配
		p.seeMovie();
	}

	class Person {
		public Person(int _age) {
			if (_age < 18) {
				throw new RuntimeException("年龄必须大于18岁。");
			}
		}

		public void seeMovie() {
			System.out.println("看限制级电影");
		}
	}
}
