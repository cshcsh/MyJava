package com.java5200.date0531;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			StringBuffer stringBuffer=null;
			//stringBuffer=new StringBuffer("123");
			stringBuffer.append("abc");
			System.out.println(stringBuffer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			//e.getMessage();
		}
	}

}
