package com.java5200.date0615;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Student2 {
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

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
	}

}

public class GetFieldTest {

	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("com.java5200.date0615.Student2"); // 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		{ // 普通代码块
			Field f[] = c1.getDeclaredFields(); // 取得本类属性
			for (int i = 0; i < f.length; i++) { // 循环输出
				Class<?> r = f[i].getType(); // 取得属性的类型
				int mo = f[i].getModifiers();// 得到修饰符数字
				String priv = Modifier.toString(mo);// 取得属性的修饰符
				System.out.print("本类属性：");
				System.out.print(priv + " "); // 输出修饰符
				System.out.print(r.getName() + " ");// 输出属性类型
				System.out.print(f[i].getName()); // 输出属性名称
				System.out.println(" ;"); // 换行
			}
		}
	}
}
