package com.java5200.date0529;

interface Action{
	
	public String teString="����";
	public static final String DEC="����һ����̬����̬������";
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
		System.out.println("˵��");
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
		return "������"+getName()+" ���䣺"+getAge()+" ���ʣ�"+getSalary();
	}
	
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return teString+"----�ӿڲ���----"+DEC;
	}
	public static void main(String[] args){
		
		Teacher2 teacher=new Teacher2("fjs", 30, 10000);
		System.out.println(teacher.getContent());
	}

}
