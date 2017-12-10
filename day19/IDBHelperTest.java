package com.java5200.date0606;

import java.util.ArrayList;
import java.util.List;

interface IDBHelper2<T>{
	
	public List<T> add(T t);
	public List<T> delete(int n);
	public T	   update(int n);
	public T 	   find(int n);
		
}

class Student{
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
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

class IDBHelper3<T> implements IDBHelper2<T>{

	private List<T> lists=new ArrayList<T>();
	
	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}

	@Override
	public List<T> add(T t) {
		// TODO Auto-generated method stub
		lists.add(t);
		return lists;
	}

	@Override
	public List<T> delete(int n) {
		// TODO Auto-generated method stub
		lists.remove(n);
		return lists;
	}

	@Override
	public T update(int n) {
		// TODO Auto-generated method stub
		T t=lists.get(n);
		//
		return null;
	}

	@Override
	public T find(int n) {
		// TODO Auto-generated method stub
		return lists.get(n);
	}

	
	
}

public class IDBHelperTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1=new Student("csh", 22);
		Student student2=new Student("csh2", 22);
		Student student3=new Student("csh3", 22);
		Student student4=new Student("csh4", 22);
		Student student5=new Student("csh5", 22);
		IDBHelper3<Student> idbHelper3=new IDBHelper3<Student>();
		idbHelper3.getLists().add(student1);
		idbHelper3.getLists().add(student2);
		idbHelper3.getLists().add(student3);
		idbHelper3.getLists().add(student4);
		idbHelper3.getLists().add(student5);
		idbHelper3.delete(2);
		for(Student s:idbHelper3.getLists()){
			System.out.println(s);
		}
		System.out.println(idbHelper3.find(3));
	}

}
