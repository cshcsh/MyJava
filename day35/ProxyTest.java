package com.java5200.date0622;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


interface Test{
	public void fun();
}

class TestImpl implements Test{

	@Override
	public void fun() {
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}

class MyInvocationHandler implements InvocationHandler{

	private Object obj;

	public MyInvocationHandler(Object obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = method.invoke(obj, args);
		long endTime = System.currentTimeMillis();
		System.out.println("ºÄÊ±£º" + (endTime - startTime));
		return result;
	}
	
}

public class ProxyTest {

	public static void main(String[] args) {

		Test test = new TestImpl();
		MyInvocationHandler handler = new MyInvocationHandler(test);
		Test t = (Test) Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(),handler);
		t.fun();
	}

}
