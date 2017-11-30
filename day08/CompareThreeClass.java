package com.java5200.date0526;

//�Ƚ�StringBuffer StringBulider
public class CompareThreeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "";
		long startTime = 0L;
		long endTime = 0L;
		StringBuffer buffer = new StringBuffer("");
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			buffer.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer��ִ��ʱ�䣺" + (endTime - startTime));
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder��ִ��ʱ�䣺" + (endTime - startTime));
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String��ִ��ʱ�䣺" + (endTime - startTime));
	}

}
