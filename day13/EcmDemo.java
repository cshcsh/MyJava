package com.java5200.date0531;

class MyEcDef extends Exception {// 输入参数是负数异常

	public MyEcDef(String message) {
		super(message);
	}

}

public class EcmDemo {

	public static void intoPers(float a, float b) throws MyEcDef {
		if (a < 0 || b < 0) {
			throw new MyEcDef("输入参数是负数");// 自定义的异常类对象通过throw抛出
		}
	}

	public static void main(String args[]) {
		
		float a = 0;
		float b = 0;

		try {
			a = Float.parseFloat(args[0]);
			b = Float.parseFloat(args[1]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();// 缺少命令行参数
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();// 数据类型不一致
		}

		EcmDemo t = new EcmDemo();

		try {
			t.intoPers(a, b);
		} catch (Exception e) {
			e.printStackTrace();// 输入负数
		}

		float c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();// 除0
		}finally {
			System.out.println(c);
		}
	}
}