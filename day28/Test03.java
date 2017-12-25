package com.java5200.date0615;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface TestDao {
	public void fun();
}

class TestImpl implements TestDao {

	@Override
	public void fun() {
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}

class MyInvocationHandler2 implements InvocationHandler {
	private Object obj;

	public MyInvocationHandler2(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Runtime r = Runtime.getRuntime();
		long startTime = System.currentTimeMillis();
		long start = r.freeMemory();
		Object result = method.invoke(obj, args);
		long endTime = System.currentTimeMillis();
		long end = r.freeMemory();
		System.out.println("耗时：" + (endTime - startTime));
		System.out.println("消耗空间：" + (start - end));
		return result;
	}

}

public class Test03 {

	public static void main(String[] args) {
		TestDao test = new TestImpl();
		MyInvocationHandler2 handler = new MyInvocationHandler2(test);
		TestDao t = (TestDao) Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(),
				handler);
		t.fun();
	}

}
