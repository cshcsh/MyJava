package com.java5200.date0605;

class Student implements Comparable<Student> { // 指定类型为Student
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

	public int compareTo(Student stu) { // 覆写compareTo()方法,实现排序规则的应用
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
		Student stu[] = { new Student("张三", 20, 90.0f), new Student("李四", 22, 90.0f), new Student("王五", 20, 99.0f),
				new Student("赵六", 20, 70.0f), new Student("孙七", 22, 100.0f) };
		java.util.Arrays.sort(stu); // 进行排序操作
		for (int i = 0; i < stu.length; i++) { // 输出数组中的内容
			System.out.println(stu[i]);
		}
	}
}
