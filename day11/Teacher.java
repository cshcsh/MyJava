package com.java5200.date0529;

abstract class Person5 {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println("说话");
	}
	
	public abstract String getContent();
}

public class Teacher extends Person5{

	private double salary;
	
	
	public double getSalary() {
		return salary;
	}

	public Teacher(String name, int age,double salary) {
		super(name, age);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "姓名："+getName()+" 年龄："+getAge()+" 工资："+getSalary();
	}
	
	public static void main(String[] args){
		
		Teacher teacher=new Teacher("fjs", 30, 10000);
		System.out.println(teacher.getContent());
	}
}
