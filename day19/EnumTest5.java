package com.java5200.date0606;

public class EnumTest5 {

	public static void main(String[] args) {
		Color4 c = Enum.valueOf(Color4.class, "BLUE");
		c.setName("��ɫ"); // ����һ�����������
		c.setName("��ɫ"); // ����һ����ȷ������
		System.out.println(c.getName());
	}
}
