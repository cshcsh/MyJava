package com.java5200.date0531;

class TelException extends Exception {//�绰���������11λ

	public TelException(String message) {
		super(message);
	}

}

public class TelExceptionTest {

	private String tel;
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) throws TelException {
		int n=tel.length();
		if (n!=11){
			throw new TelException("�绰���벻����������11λ");//�Զ�����쳣�����ͨ��throw�׳�
		}else{
			this.tel=tel;
		}
	}

	public static void main(String args[]) {
		TelExceptionTest t = new TelExceptionTest();
		try {
			t.setTel("1579771347399");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����ԭ��:" + e.getMessage());
		}
	}
}