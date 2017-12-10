package com.java5200.date0606;

/**
 * 定义一个Person 类,Person 类中要存放具体的信息。
	一个人可能有各种各样的信息（例如：联系方式、
	基本信息等）,所以此信息属性的类型就可以通过泛
	型进行声明,之后只要设计相应的信息类即可
 * @author CSH
 * @date 2018年6月6日上午10:54:51
 * @param <T>
 */

class Person<T>{
	private String name;
	private Integer tel;
	private T info;
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public Person(String name, Integer tel, T info) {
		super();
		this.name = name;
		this.tel = tel;
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", tel=" + tel + ", info=" + info + "]";
	}
	
	
}
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person<String> person=new Person<String>("csh",5,"cshsdggfh");
		System.out.println(person);
	}

}
