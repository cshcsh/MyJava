package com.java5200.date0612;

import java.util.Set;
import java.util.TreeSet;

class Person3 implements Comparable<Person3>{ // ����Person��
	private String name; // ����name����
	private int age; // ����age����

	public Person3(String name, int age) { // ͨ�����췽��Ϊ���Ը�ֵ
		this.name = name; // Ϊname���Ը�ֵ
		this.age = age; // Ϊage���Ը�ֵ
	}

	public boolean equals(Object obj) { // ��дequals()����
		if (this == obj) { // ��ַ���
			return true; // ��ͬһ������
		}
		if (!(obj instanceof Person)) { // ���ݽ����Ĳ��Ǳ���Ķ���
			return false; // ����ͬһ������
		}
		Person3 p = (Person3) obj; // ��������ת��
		if (this.name.equals(p.name) && this.age == p.age) {
			return true; // �������αȽ�
		} else { // ȫ���������,��ͬһ����
			return false; // ���Բ����,����ͬһ����
		}
	}

	public int hashCode() { // ��дhashCode()����
		return this.name.hashCode() * this.age; // ָ�����빫ʽ
	}

	public String toString() { // ��дtoString()����
		return "������" + this.name + "�����䣺" + this.age;
	}
	
	public int compareTo(Person3 per) { // ��дcompareTo()����,ָ���������
		if (this.equals(per)) { // ͨ����������
			return 0;
		} else {
			return 1;
		}
	}
}

public class TreeSetTest3 {

	public static void main(String[] args){
		
		Set<Person3> treeSet=new TreeSet<Person3>();
		treeSet.add(new Person3("csh", 22));
		treeSet.add(new Person3("csh2", 22));
		treeSet.add(new Person3("csh2", 21));
		treeSet.add(new Person3("csh", 22));
		for(Person3 p:treeSet){
			System.out.println(p);
		}
	}
}
