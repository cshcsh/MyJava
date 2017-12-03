package com.java5200.date0529;

interface Action{
	
	public String teString="测试";
	public static final String DEC="这是一个静态的终态的属性";
	public abstract String getContent();
}

abstract class Person2 {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public String getContent2() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAge() {
		return age;
	}

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println("说话");
	}
	
}

public class Teacher2 extends Person2 implements Action{

	private double salary;
	
	
	public double getSalary() {
		return salary;
	}

	public Teacher2(String name, int age,double salary) {
		super(name, age);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent2() {
		// TODO Auto-generated method stub
		return "姓名："+getName()+" 年龄："+getAge()+" 工资："+getSalary();
	}
	
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return teString+"----接口测试----"+DEC;
	}
	public static void main(String[] args){
		
		Teacher2 teacher=new Teacher2("fjs", 30, 10000);
		System.out.println(teacher.getContent());
	}

}
