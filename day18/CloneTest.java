package com.java5200.date0605;

class Person implements Cloneable { // 必须实现Cloneable接口
	
	private String name = null;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {// 需要子类覆写clone方法
		return super.clone(); // 具体的克隆操作由父类完成
	}

	public String toString() {
		return "姓名：" + this.getName();
	}
}

/**
 * 浅复制 ，地址不同
 * @author CSH
 * @date 2018年6月5日下午4:11:23
 */
public class CloneTest {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("张三");
		Person p2 = (Person) p1.clone();
		p2.setName("李四");
		System.out.println("原始对象：" + p1);
		System.out.println("克隆之后的对象：" + p2);
	}
}
