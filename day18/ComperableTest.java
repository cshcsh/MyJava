package com.java5200.date0605;

class Student implements Comparable<Student> { // ָ������ΪStudent
	private String name;
	private int age;
	private float score;

	public Student(String name, int age, float score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String toString() {
		return name + "\t\t" + age + "\t\t" + score;
	}

	public int compareTo(Student stu) { // ��дcompareTo()����,ʵ����������Ӧ��
		if (this.score > stu.score) {
			return -1;
		} else if (this.score < stu.score) {
			return 1;
		} else {
			if (this.age > stu.age) {
				return 1;
			} else if (this.age < stu.age) {
				return -1;
			} else {
				return 0;
			}
		}
	}
};

public class ComperableTest {

	public static void main(String[] args) {
		Student stu[] = { new Student("����", 20, 90.0f), new Student("����", 22, 90.0f), new Student("����", 20, 99.0f),
				new Student("����", 20, 70.0f), new Student("����", 22, 100.0f) };
		java.util.Arrays.sort(stu); // �����������
		for (int i = 0; i < stu.length; i++) { // ��������е�����
			System.out.println(stu[i]);
		}
	}
}
