package com.java5200.date0622;

import java.util.HashMap;
import java.util.Map;
/**
 * Person类
 * @author CSH
 * @date 2018年6月23日下午9:46:40
 */
class Person{

	private String name;
	private int age;
	
	private static Person person;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//获取单例
	public static Person getInstance(){

		if(Test01.map.get("Person")==null){
			person=new Person();
			Test01.map.put("Person", person);
		}
		if(Test01.map.get("Person")!=null){
			Object object=Test01.map.get("Person");
			if(object instanceof Person){
				person=(Person) object;
			}
		}
		return person;
		
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class Test01 {

	public static Map<String, Object> map=new HashMap<>();
	
	public static void main(String[] args) {

		for(int i=0;i<10;i++){//单例循环测试
			Person person=Person.getInstance();
			System.out.println("同一对象的hashCode："+person.hashCode());//hashCode相同，是同一对象。
		}
		
		System.out.println("不同对象的hashCode："+new Person("csh",22).hashCode());
		
		System.out.println("不同对象的hashCode："+new Person("csh2",18).hashCode());
	}

}
