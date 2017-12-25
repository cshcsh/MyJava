package com.java5200.date0615;

class Person { // 定义Person类
	private String name; // 定义name属性
	private int age; // 定义age属性

	/*调用Class对象的newInstance()方法
	要 求：
	1）类必须有一个无参数的构造器。
	2）类的构造器的访问权限需要足够。*/
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() { // 取得name属性
		return name;
	}

	public void setName(String name) { // 设置name属性
		this.name = name;
	}

	public int getAge() { // 取得age属性
		return age;
	}

	public void setAge(int age) { // 设置age属性
		this.age = age;
	}

	public String toString() { // 覆写toString()方法
		return "姓名：" + this.name + ",年龄：" + this.age;
	}
}

public class InstanceTest {

	public static void main(String[] args) {
		Class<?> c = null; // 指定泛型
		try { // 传入要实例化类的完整包.类名称
			c = Class.forName("com.java5200.date0615.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // 声明Person对象
		try {
			per = (Person) c.newInstance(); // 实例化Person对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		per.setName("张无忌"); // 设置姓名
		per.setAge(30); // 设置年龄
		System.out.println(per); // 内容输出,调用toString()
	}
}
