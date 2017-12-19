package com.java5200.date0612;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> { // ����Person��,ʵ�ֱȽ���
	
	private String name; // ����name����
	private int age; // ����age����

	public Person(String name, int age) { // ͨ�����췽��Ϊ���Ը�ֵ
		this.name = name; // Ϊname���Ը�ֵ
		this.age = age; // Ϊage���Ը�ֵ
	}

	public String toString() { // ��дtoString()����
		return "������" + this.name + "�����䣺" + this.age;
	}

	public int compareTo(Person per) { // ��дcompareTo()����,ָ���������
		if (this.age > per.age) { // ͨ����������
			return 1;
		} else if (this.age < per.age) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		
		Set<Person> treeSet=new TreeSet<Person>();
		treeSet.add(new Person("csh", 22));
		treeSet.add(new Person("csh", 26));
		treeSet.add(new Person("csh", 24));
		treeSet.add(new Person("csh", 23));
		treeSet.add(new Person("csh", 26));
		for(Person p:treeSet){
			System.out.println(p);
		}
	}
}
