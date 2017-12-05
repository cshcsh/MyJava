package com.java5200.date0531;

class MyEcDef extends Exception {// ��������Ǹ����쳣

	public MyEcDef(String message) {
		super(message);
	}

}

public class EcmDemo {

	public static void intoPers(float a, float b) throws MyEcDef {
		if (a < 0 || b < 0) {
			throw new MyEcDef("��������Ǹ���");// �Զ�����쳣�����ͨ��throw�׳�
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
			e.printStackTrace();// ȱ�������в���
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();// �������Ͳ�һ��
		}

		EcmDemo t = new EcmDemo();

		try {
			t.intoPers(a, b);
		} catch (Exception e) {
			e.printStackTrace();// ���븺��
		}

		float c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();// ��0
		}finally {
			System.out.println(c);
		}
	}
}