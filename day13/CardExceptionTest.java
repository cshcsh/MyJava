package com.java5200.date0531;

class CardException extends Exception {

	public CardException(String message) {
		super(message);
	}

}

public class CardExceptionTest {

	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setId(String id) throws CardException {
		char[] a=id.toCharArray();
		boolean b=true;
		for(int i=0;i<a.length;i++){
			if(a[i]=='0'||a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9'){
				b=false;
			}
		}
		if ((a.length<12||a.length>21)||b){
			throw new CardException("银行卡号只能由12到21个0至9的数字组成");//自定义的异常类对象通过throw抛出
		}else{
			this.id=id;
		}
	}

	public void setPassword(String password) throws CardException {
		char[] a=password.toCharArray();
		boolean b=true;
		for(int i=0;i<a.length;i++){
			if(a[i]=='0'||a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9'){
				b=false;
			}
		}
		if (a.length!=6||b){
			throw new CardException("密码只能有6位,每一位也是有0-9的数字组成");//自定义的异常类对象通过throw抛出
		}else{
			this.password=password;
		}
	}

	public static void main(String args[]) {
		CardExceptionTest t = new CardExceptionTest();
		try {
			t.setId("1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			t.setPassword("qwerty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}