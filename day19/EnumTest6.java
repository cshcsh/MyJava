package com.java5200.date0606;

public class EnumTest6 {
	
	public static void main(String[] args) {
		// ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
		for (Color2 c : Color2.values()) {
			System.out.println(c.ordinal() + " --> " + c.name());
		}
	}
}
