package com.java5200.date0524;

public class Employee {

	private String id;
	private String name;
	private float salary;
	private float reward;

	public void printInfo(){
		
		System.out.println("��Ա��ţ�"+id+" ��Ա������"+name+" ��Ա����"+salary+" ��Ա����"+reward);
	}
	public void printSalary(){
		
		//��Ա����н����н����ƽ������
		System.out.println("��Ա��н��"+yearSalary()+" ��Ա��н��"+monthSalary()+" ��Ա����"+daySalary());
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
