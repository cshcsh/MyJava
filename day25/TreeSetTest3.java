package com.java5200.date0612;

import java.util.Set;
import java.util.TreeSet;

class Person3 implements Comparable<Person3>{ // 定义Person类
	private String name; // 定义name属性
	private int age; // 定义age属性

	public Person3(String name, int age) { // 通过构造方法为属性赋值
		this.name = name; // 为name属性赋值
		this.age = age; // 为age属性赋值
	}

	public boolean equals(Object obj) { // 覆写equals()方法
		if (this == obj) { // 地址相等
			return true; // 是同一个对象
		}
		if (!(obj instanceof Person)) { // 传递进来的不是本类的对象
			return false; // 不是同一个对象
		}
		Person3 p = (Person3) obj; // 进行向下转型
		if (this.name.equals(p.name) && this.age == p.age) {
			return true; // 属性依次比较
		} else { // 全部属性相等,是同一对象
			return false; // 属性不相等,不是同一对象
		}
	}

	public int hashCode() { // 覆写hashCode()方法
		return this.name.hashCode() * this.age; // 指定编码公式
	}

	public String toString() { // 覆写toString()方法
		return "姓名：" + this.name + "；年龄：" + this.age;
	}
	
	public int compareTo(Person3 per) { // 覆写compareTo()方法,指定排序规则
		if (this.equals(per)) { // 通过年龄排序
			return 0;
		} else {
			return 1;
		}
	}
}

public class TreeSetTest3 {

	public static void main(String[] args){
		
		Set<Person3> treeSet=new TreeSet<Person3>();
		treeSet.add(new Person3("csh", 22));
		treeSet.add(new Person3("csh2", 22));
		treeSet.add(new Person3("csh2", 21));
		treeSet.add(new Person3("csh", 22));
		for(Person3 p:treeSet){
			System.out.println(p);
		}
	}
}
