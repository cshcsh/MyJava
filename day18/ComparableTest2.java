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
		return "������" + this.name + ",���䣺" + this.age;
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
		 * Comparable com = null; // ����һ��Comparable�ӿڶ��� com = 30; //
		 * ͨ��Integer��ΪComparableʵ���� System.out.println("����Ϊ��" + com); //
		 * ʵ���ϵ��õ���toString()����
		 */

		Teacher per[] = { new Teacher("����", 20), new Teacher("����", 19), new Teacher("����", 23) };
		Arrays.sort(per, new TeacherComparator());
		for (int x = 0; x < per.length; x++) {
			System.out.println(per[x]);
		}
	}
}
