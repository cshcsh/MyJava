package com.java5200.date0613;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student2 { // 定义学生类

	private String name; // 定义name属性
	private int age; // 定义age属性
	private List<Course> allCourses; // 定义集合保存全部课程

	public Student2() { // 无参构造
		this.allCourses = new ArrayList<Course>();
	}

	public Student2(String name, int age) { // 通过构造设置属性内容
		this(); // 调用无参构造
		this.setName(name); // 设置name属性内容
		this.setAge(age); // 设置age属性内容
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

	public List<Course> getAllCourses() {
		return allCourses;
	}

	public void setAllCourses(List<Course> allCourses) {
		this.allCourses = allCourses;
	}

	public String toString() { // 覆写toString()方法
		return "学生姓名：" + this.name + "；年龄：" + this.age;
	}
}

class Course { // 定义Course类

	private String name; // 定义name属性
	private int credit; // 定义credit属性,表示学分
	private List<Student2> allStudents; // 定义集合保存多个学生

	public Course() { // 无参构造方法
		this.allStudents = new ArrayList<Student2>();
	}

	public Course(String name, int credit) { // 设置name和grade属性
		this(); // 调用无参构造
		this.setName(name); // 设置name属性
		this.setCredit(credit); // 设置credit属性
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public List<Student2> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(List<Student2> allStudents) {
		this.allStudents = allStudents;
	}

	public String toString() { // 覆写toString()方法
		return "课程名称：" + this.name + "；课程学分" + this.credit;
	}
}

public class StudentCourseTest {

	public static void main(String args[]) {
		Course c1 = new Course("英语", 3); // 实例化课程对象
		Course c2 = new Course("计算机", 5); // 实例化课程对象
		
		Student2 s1 = new Student2("张三", 20); // 实例化学生对象
		Student2 s2 = new Student2("李四", 21); // 实例化学生对象
		Student2 s3 = new Student2("王五", 22); // 实例化学生对象
		Student2 s4 = new Student2("赵六", 23); // 实例化学生对象
		Student2 s5 = new Student2("孙七", 24); // 实例化学生对象
		Student2 s6 = new Student2("钱八", 25); // 实例化学生对象
		
		List<Student2> allStudents=new ArrayList<>();
		allStudents.add(s1);
		allStudents.add(s2);
		allStudents.add(s3);
		c1.setAllStudents(allStudents);
		System.out.println(c1); // 输出学生信息
		Iterator<Student2> iter1 = c1.getAllStudents().iterator();
		while (iter1.hasNext()) { // 迭代输出
			Student2 s = iter1.next(); // 取出学生对象
			System.out.println("\t|- " + s); // 输出学生信息
		} // 输出一个学生参加的课程信息,观察有多少门课程
		
		
		List<Course> allCourses=new ArrayList<>();
		allCourses.add(c1);
		allCourses.add(c2);
		s1.setAllCourses(allCourses);
		System.out.println(s1); // 输出学生信息
		Iterator<Course> iter2 = s1.getAllCourses().iterator();
		while (iter2.hasNext()) { // 迭代输出
			Course c = iter2.next(); // 取得所参加的课程
			System.out.println("\t|- " + c); // 输出课程信息
		}
	}
}
