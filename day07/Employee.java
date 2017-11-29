package com.java5200.date0525;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private String dep;
	
	public Employee(int id, String name, float salary, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.salary=1000;
		this.dep="ºóÇÚ";
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
