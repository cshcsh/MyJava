package com.java5200.date0524;

public class Employee {

	private String id;
	private String name;
	private float salary;
	private float reward;

	public void printInfo(){
		
		System.out.println("雇员编号："+id+" 雇员姓名："+name+" 雇员工资"+salary+" 雇员奖金："+reward);
	}
	public void printSalary(){
		
		//雇员的年薪、月薪、日平均工资
		System.out.println("雇员年薪："+yearSalary()+" 雇员月薪："+monthSalary()+" 雇员日新"+daySalary());
	}
	public float yearSalary(){
		return 12*(salary+reward);
	}
	public float monthSalary(){
		return salary+reward;
	}
	public float daySalary(){
		return (salary+reward)/30;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, float salary, float reward) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.reward = reward;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public float getReward() {
		return reward;
	}
	public void setReward(float reward) {
		this.reward = reward;
	}
	
}
