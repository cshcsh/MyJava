package com.java5200.date0606;

/**
 * ����һ��Person ��,Person ����Ҫ��ž������Ϣ��
	һ���˿����и��ָ�������Ϣ�����磺��ϵ��ʽ��
	������Ϣ�ȣ�,���Դ���Ϣ���Ե����;Ϳ���ͨ����
	�ͽ�������,֮��ֻҪ�����Ӧ����Ϣ�༴��
 * @author CSH
 * @date 2018��6��6������10:54:51
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
