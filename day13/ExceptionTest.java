package com.java5200.date0531;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5,y=0,z;
		try {
			z=x/y;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("Ö´ÐÐÍê³É");
		}
	}

}
