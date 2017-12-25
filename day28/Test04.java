package com.java5200.date0615;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test04 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> c = Class.forName("com.java5200.date0615.Person11");
		Method fm = c.getMethod("fun", int[].class);
		int[] arr1 = (int[]) (Array.newInstance(int.class, 1));
		arr1[0] = 24232;
		fm.invoke(c.newInstance(), arr1);
		System.out.println("===========================");
		int[] arr2 = (int[]) Array.newInstance(int.class, 3);
		arr2[0] = 22222;
		arr2[1] = 33333;
		arr2[2] = 44444;
		fm.invoke(c.newInstance(), arr2);

	}

}
