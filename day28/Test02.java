package com.java5200.date0615;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Person1 {
	public void setName(String name);

	public void setAge(int age);
}

class PersonImpl implements Person1 {
	private String name;
	private int age;

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

}

class PersonProxy implements InvocationHandler {
	private Object obj;

	public PersonProxy(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		BufferedWriter bw = new BufferedWriter(new FileWriter("test02.txt", true));
		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = s.format(date);
		bw.write("时间：" + str + "；方法名称：" + method.getName() + "\n参数：" + args[0]);
		bw.newLine();
		bw.flush();
		bw.close();
		System.out.println();
		Object temp = method.invoke(this.obj, args);
		return temp;
	}

}

public class Test02 {

	public static void main(String[] args) {
		Person1 per = new PersonImpl();
		PersonProxy handler = new PersonProxy(per);
		Person1 person = (Person1) Proxy.newProxyInstance(per.getClass().getClassLoader(),
				per.getClass().getInterfaces(), handler);
		person.setName("csh");
		person.setAge(20);
	}

}
