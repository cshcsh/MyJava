package com.java5200.date0615;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Subject { // 定义主题Subject接口
	public String say(String name, int age); // 定义抽象方法say
}
class RealSubject implements Subject { // 真实实现类
	public String say(String name, int age) { // 覆写say()方法
		return "姓名：" + name + ",年龄：" + age; // 返回信息
	}
}

class MyInvocationHandler implements InvocationHandler{
	private Object obj; // 真实主题

	public Object bind(Object obj) { // 绑定真实操作主题
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),  this);// 取得代理对象
	}

	public Object invoke(Object proxy, Method method, Object[] args) { // 动态调用方法
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
		} // 调用方法,传入真实主题和参数
		return temp; // 返回方法的返回信息
	}
}

public class DynaProxyTest {

	public static void main(String[] args) {
		// 实例化代理操作类
		MyInvocationHandler handler = new MyInvocationHandler();
		// 绑定对象
		Subject sub = (Subject) handler.bind(new RealSubject());
		String info = sub.say("张无忌", 30);
		// 通过动态代理调用方法
		System.out.println(info); // 信息输出
	}
}
