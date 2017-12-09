package com.java5200.date0605;

import java.util.Arrays;
import java.util.Comparator;

class Teacher {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "姓名：" + this.name + ",年龄：" + this.age;
	}
}

class TeacherComparator implements Comparator<Teacher> {
	@Override
	public int compare(Teacher o1, Teacher o2) {
		if (o1.getAge() > o2.getAge()) {
			return -1;
		} else if (o1.getAge() < o2.getAge()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class ComparableTest2 {

	public static void main(String[] args) {
		/*
		 * Comparable com = null; // 声明一个Comparable接口对象 com = 30; //
		 * 通过Integer类为Comparable实例化 System.out.println("内容为：" + com); //
		 * 实际上调用的是toString()方法
		 */

		Teacher per[] = { new Teacher("张三", 20), new Teacher("李四", 19), new Teacher("王五", 23) };
		Arrays.sort(per, new TeacherComparator());
		for (int x = 0; x < per.length; x++) {
			System.out.println(per[x]);
		}
	}
}
