package com.java5200.date0615;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Subject { // ��������Subject�ӿ�
	public String say(String name, int age); // ������󷽷�say
}
class RealSubject implements Subject { // ��ʵʵ����
	public String say(String name, int age) { // ��дsay()����
		return "������" + name + ",���䣺" + age; // ������Ϣ
	}
}

class MyInvocationHandler implements InvocationHandler{
	private Object obj; // ��ʵ����

	public Object bind(Object obj) { // ����ʵ��������
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),  this);// ȡ�ô������
	}

	public Object invoke(Object proxy, Method method, Object[] args) { // ��̬���÷���
		Object temp = null;
		try {
			temp = method.invoke(this.obj, args);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ���÷���,������ʵ����Ͳ���
		return temp; // ���ط����ķ�����Ϣ
	}
}

public class DynaProxyTest {

	public static void main(String[] args) {
		// ʵ�������������
		MyInvocationHandler handler = new MyInvocationHandler();
		// �󶨶���
		Subject sub = (Subject) handler.bind(new RealSubject());
		String info = sub.say("���޼�", 30);
		// ͨ����̬������÷���
		System.out.println(info); // ��Ϣ���
	}
}
