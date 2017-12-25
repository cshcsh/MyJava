package com.java5200.date0615;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class GetConstructorTest2 {

	private String name;
	private int age;

	public GetConstructorTest2() {
		super();
	}

	public GetConstructorTest2(String name) {
		super();
		this.name = name;
	}

	public GetConstructorTest2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "GetConstructorTest [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {// 实例化Class对象
			c1 = Class.forName("com.java5200.date0615.GetConstructorTest2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors(); // 得到全部构造
		for (int i = 0; i < con.length; i++) { // 循环输出
			Class<?> p[] = con[i].getParameterTypes(); // 列出构造中的参数类型
			System.out.print("构造方法：");
			System.out.print(Modifier.toString(con[i].getModifiers()) + " "); // 取出权限
			System.out.print(con[i].getName()); // 输出构造方法名称
			System.out.print("("); // 输出“(”
			for (int j = 0; j < p.length; j++) {// 打印参数类型
				System.out.print(p[j].getName() + " arg" + i);
				if (j < p.length - 1) { // 判断是否要输出“,”
					System.out.print(","); // 输出“,”
				}
			}
			System.out.println("){}"); // 输出“){}”
		}
	}
}
