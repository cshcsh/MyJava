package com.java5200.date0531;

class MyException extends Exception {

	private static final long serialVersionUID = 1L;// ���к�

	private int idnumber;

	public MyException(String message, int id) {
		super(message);
		this.idnumber = id;
	}

	public int getId() {
		return idnumber;
	}
}

public class MyExceptionTest {

	public void regist(int num) throws MyException {
		if (num < 0)
			throw new MyException("����Ϊ��ֵ,������", 3);
		else
			System.out.println("�Ǽ�����" + num );
	}

	public void manager() {
		try {
			regist(-100);
		} catch (MyException e) {
			System.out.println("�Ǽ�ʧ��,��������" + e.getId());
		}
		System.out.println("���εǼǲ�������");
	}

	public static void main(String args[]) {
		MyExceptionTest t = new MyExceptionTest();
		t.manager();
	}
}
