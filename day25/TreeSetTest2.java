package com.java5200.date0612;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> { // 定义Person类,实现比较器
	
	private String name; // 定义name属性
	private int age; // 定义age属性

	public Person(String name, int age) { // 通过构造方法为属性赋值
		this.name = name; // 为name属性赋值
		this.age = age; // 为age属性赋值
	}

	public String toString() { // 覆写toString()方法
		return "姓名：" + this.name + "；年龄：" + this.age;
	}

	public int compareTo(Person per) { // 覆写compareTo()方法,指定排序规则
		if (this.age > per.age) { // 通过年龄排序
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
