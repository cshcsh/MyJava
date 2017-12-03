package com.java5200.date0529;

abstract class Person3{
	
	private String name;
	private String date;
	private String content;
	
	public Person3(String name, String date, String content) {
		super();
		this.name = name;
		this.date = date;
		this.content = content;
	}
	
	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}
	
	public String getContent() {
		return content;
	}

	public void say(){
		System.out.println(this.getContent2());
	}
	public abstract String getContent2(); 
}

public class Student extends Person3{

	private String classes;
	
	public String getClasses() {
		return classes;
	}

	public Student(String name, String date, String content, String classes) {
		super(name, date, content);
		this.classes = classes;
	}

	@Override
	public String getContent2() {
		// TODO Auto-generated method stub
		return "------------------------违纪卡------------------------\n姓名："+super.getName()+"\t班级："+this.getClasses()+"\t日期："+super.getDate()+"\t事由："+super.getContent();
	}

	public static void main(String[] args){
		
		Student csh=new Student("csh", "20180529", "上课睡觉", "java1");
		csh.say();
	}
}
