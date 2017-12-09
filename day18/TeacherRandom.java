package com.java5200.date0605;

/*在学校安排老师监考时,需要从一组教师中随机抽取
n个教师参加监考,要求实现一个类RandomTeacher
的静态方法public static String[]
getRandomTeachers(String [] teachers,int n)能够从
teachers中随机挑选n个教师(名字)并返回。*/

/**
 * 
 * @author CSH
 * @date 2018年6月5日下午5:49:22
 */
class Teacher2{
	private String name;
	private int age;
	private double salary;
	public Teacher2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary=0;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class TeacherRandom {

	private static Teacher2[] teacher2s={
			new Teacher2("csh1", 22),
			new Teacher2("csh2", 21),
			new Teacher2("csh3", 23),
			new Teacher2("csh4", 22),
			new Teacher2("csh5", 33),
			new Teacher2("csh6", 22),
			new Teacher2("csh7", 26),
			new Teacher2("csh8", 22),
			new Teacher2("csh9", 33),
			new Teacher2("csh10", 20),
			new Teacher2("csh11", 28),
			new Teacher2("csh12", 22),
			new Teacher2("csh13", 23),
			new Teacher2("csh14", 27),
			new Teacher2("csh15", 22),
			new Teacher2("csh16", 42),
			new Teacher2("csh17", 42),
			new Teacher2("csh18", 52),
			new Teacher2("csh19", 22),
			new Teacher2("csh20", 34),
	};
	
	public static String[] getRandomTeachers(String [] teachers,int n){
		String[] names=new String[n];
		for(int i=0;i<n;i++){
			names[i]=teachers[(int) (Math.random()*teachers.length)];
		}
		return names;
	}
	
	public static void main(String[] args){
		String[] teachersName=new String[teacher2s.length];
		for(int i=0;i<teachersName.length;i++){
			teachersName[i]=teacher2s[i].getName();
		}
		String[] names=getRandomTeachers(teachersName,5);
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}
}
