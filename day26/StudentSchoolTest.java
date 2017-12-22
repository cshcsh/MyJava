package com.java5200.date0613;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student { // 定义Student类

	private String name; // 定义name属性
	private int age; // 定义age属性
	private School school; // 一个学生属于一个学校

	public Student(String name, int age) { // 通过构造设置内容
		this.setName(name); // 设置name属性内容
		this.setAge(age); // 设置age属性内容
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

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

	public String toString() { // 覆写toString()方法
		return "学生姓名：" + this.name + "；年龄：" + this.age;
	}
}

class School { // 定义School类

	private String name; // 定义name属性
	private List<Student> allStudents; // 一个学校有多个学生

	public School() { // 无参构造
		this.allStudents = new ArrayList<Student>();
	}

	public School(String name) { // 通过构造设置name属性
		this(); // 调用无参构造
		this.setName(name); // 设置name属性内容
	}

	public List<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(List<Student> allStudents) {
		this.allStudents = allStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {// 覆写toString()方法
		return "学校名称：" + this.name;
	}
}

public class StudentSchoolTest {

	public static void main(String[] args) {
		School sch = new School("清华大学"); // 实例化学校对象
		Student s2 = new Student("李书同", 22); // 实例化学生对象
		Student s1 = new Student("李光耀", 21); // 实例化学生对象
		Student s3 = new Student("王凎昌", 23); // 实例化学生对象
		sch.getAllStudents().add(s1); // 在学校中加入学生
		sch.getAllStudents().add(s2); // 在学校中加入学生
		sch.getAllStudents().add(s3); // 在学校中加入学生
		s1.setSchool(sch); // 一个学生属于一个学校
		s2.setSchool(sch); // 一个学生属于一个学校
		s3.setSchool(sch); // 一个学生属于一个学校
		System.out.println(sch); // 输出学校信息
		// 实例化Iterator对象,用于输出全部的学生信息
		Iterator<Student> iter = sch.getAllStudents().iterator();
		while (iter.hasNext()) { // 迭代输出
			System.out.println("\t|- " + iter.next());// 输出信息
		}
	}
}
