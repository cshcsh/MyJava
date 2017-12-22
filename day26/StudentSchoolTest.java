package com.java5200.date0613;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student { // ����Student��

	private String name; // ����name����
	private int age; // ����age����
	private School school; // һ��ѧ������һ��ѧУ

	public Student(String name, int age) { // ͨ��������������
		this.setName(name); // ����name��������
		this.setAge(age); // ����age��������
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

	public String toString() { // ��дtoString()����
		return "ѧ��������" + this.name + "�����䣺" + this.age;
	}
}

class School { // ����School��

	private String name; // ����name����
	private List<Student> allStudents; // һ��ѧУ�ж��ѧ��

	public School() { // �޲ι���
		this.allStudents = new ArrayList<Student>();
	}

	public School(String name) { // ͨ����������name����
		this(); // �����޲ι���
		this.setName(name); // ����name��������
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

	public String toString() {// ��дtoString()����
		return "ѧУ���ƣ�" + this.name;
	}
}

public class StudentSchoolTest {

	public static void main(String[] args) {
		School sch = new School("�廪��ѧ"); // ʵ����ѧУ����
		Student s2 = new Student("����ͬ", 22); // ʵ����ѧ������
		Student s1 = new Student("���ҫ", 21); // ʵ����ѧ������
		Student s3 = new Student("������", 23); // ʵ����ѧ������
		sch.getAllStudents().add(s1); // ��ѧУ�м���ѧ��
		sch.getAllStudents().add(s2); // ��ѧУ�м���ѧ��
		sch.getAllStudents().add(s3); // ��ѧУ�м���ѧ��
		s1.setSchool(sch); // һ��ѧ������һ��ѧУ
		s2.setSchool(sch); // һ��ѧ������һ��ѧУ
		s3.setSchool(sch); // һ��ѧ������һ��ѧУ
		System.out.println(sch); // ���ѧУ��Ϣ
		// ʵ����Iterator����,�������ȫ����ѧ����Ϣ
		Iterator<Student> iter = sch.getAllStudents().iterator();
		while (iter.hasNext()) { // �������
			System.out.println("\t|- " + iter.next());// �����Ϣ
		}
	}
}
