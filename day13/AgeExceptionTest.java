package com.java5200.date0531;

class AgeException extends Exception {

	public AgeException(String message) {
		super(message);
	}

}

public class AgeExceptionTest {

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age < 0 || age > 100){
			throw new AgeException("���䲻����");//�Զ�����쳣�����ͨ��throw�׳�
		}else{
			this.age=age;
		}
	}

	public static void main(String args[]) {
		AgeExceptionTest t = new AgeExceptionTest();
		try {
			t.setAge(1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����ԭ��:" + e.getMessage());
		}
	}
}