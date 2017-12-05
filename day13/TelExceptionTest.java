package com.java5200.date0531;

class TelException extends Exception {//电话号码必须是11位

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
			throw new TelException("电话号码不合理，必须是11位");//自定义的异常类对象通过throw抛出
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
			System.out.println("出错原因:" + e.getMessage());
		}
	}
}