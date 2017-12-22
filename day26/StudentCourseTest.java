package com.java5200.date0613;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student2 { // ����ѧ����

	private String name; // ����name����
	private int age; // ����age����
	private List<Course> allCourses; // ���弯�ϱ���ȫ���γ�

	public Student2() { // �޲ι���
		this.allCourses = new ArrayList<Course>();
	}

	public Student2(String name, int age) { // ͨ������������������
		this(); // �����޲ι���
		this.setName(name); // ����name��������
		this.setAge(age); // ����age��������
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

	public String toString() { // ��дtoString()����
		return "ѧ��������" + this.name + "�����䣺" + this.age;
	}
}

class Course { // ����Course��

	private String name; // ����name����
	private int credit; // ����credit����,��ʾѧ��
	private List<Student2> allStudents; // ���弯�ϱ�����ѧ��

	public Course() { // �޲ι��췽��
		this.allStudents = new ArrayList<Student2>();
	}

	public Course(String name, int credit) { // ����name��grade����
		this(); // �����޲ι���
		this.setName(name); // ����name����
		this.setCredit(credit); // ����credit����
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

	public String toString() { // ��дtoString()����
		return "�γ����ƣ�" + this.name + "���γ�ѧ��" + this.credit;
	}
}

public class StudentCourseTest {

	public static void main(String args[]) {
		Course c1 = new Course("Ӣ��", 3); // ʵ�����γ̶���
		Course c2 = new Course("�����", 5); // ʵ�����γ̶���
		
		Student2 s1 = new Student2("����", 20); // ʵ����ѧ������
		Student2 s2 = new Student2("����", 21); // ʵ����ѧ������
		Student2 s3 = new Student2("����", 22); // ʵ����ѧ������
		Student2 s4 = new Student2("����", 23); // ʵ����ѧ������
		Student2 s5 = new Student2("����", 24); // ʵ����ѧ������
		Student2 s6 = new Student2("Ǯ��", 25); // ʵ����ѧ������
		
		List<Student2> allStudents=new ArrayList<>();
		allStudents.add(s1);
		allStudents.add(s2);
		allStudents.add(s3);
		c1.setAllStudents(allStudents);
		System.out.println(c1); // ���ѧ����Ϣ
		Iterator<Student2> iter1 = c1.getAllStudents().iterator();
		while (iter1.hasNext()) { // �������
			Student2 s = iter1.next(); // ȡ��ѧ������
			System.out.println("\t|- " + s); // ���ѧ����Ϣ
		} // ���һ��ѧ���μӵĿγ���Ϣ,�۲��ж����ſγ�
		
		
		List<Course> allCourses=new ArrayList<>();
		allCourses.add(c1);
		allCourses.add(c2);
		s1.setAllCourses(allCourses);
		System.out.println(s1); // ���ѧ����Ϣ
		Iterator<Course> iter2 = s1.getAllCourses().iterator();
		while (iter2.hasNext()) { // �������
			Course c = iter2.next(); // ȡ�����μӵĿγ�
			System.out.println("\t|- " + c); // ����γ���Ϣ
		}
	}
}
