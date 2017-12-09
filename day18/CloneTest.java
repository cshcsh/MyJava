package com.java5200.date0605;

class Person implements Cloneable { // ����ʵ��Cloneable�ӿ�
	
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

	public Object clone() throws CloneNotSupportedException {// ��Ҫ���าдclone����
		return super.clone(); // ����Ŀ�¡�����ɸ������
	}

	public String toString() {
		return "������" + this.getName();
	}
}

/**
 * ǳ���� ����ַ��ͬ
 * @author CSH
 * @date 2018��6��5������4:11:23
 */
public class CloneTest {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("����");
		Person p2 = (Person) p1.clone();
		p2.setName("����");
		System.out.println("ԭʼ����" + p1);
		System.out.println("��¡֮��Ķ���" + p2);
	}
}
