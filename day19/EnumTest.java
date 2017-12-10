package com.java5200.date0606;

class Color {
	public static final Color RED = new Color("��ɫ"); // �����һ������
	public static final Color GREEN = new Color("��ɫ"); // ����ڶ�������
	public static final Color BLUE = new Color("��ɫ"); // �������������
	private String name;

	private Color(String name) { // ���췽��˽�л�,ͬʱ������ɫ������
		this.setName(name); // Ϊ��ɫ�����ָ�ֵ
	}

	public String getName() { // ȡ����ɫ����
		return this.name;
	}

	public void setName(String name) { // ������ɫ����
		this.name = name;
	}

	public static Color getInstance(int i) { // �õ�һ����ɫ,ֻ�ܴӹ̶��ļ�����ɫ��ȡ��
		switch (i) {
		case 1: { // ���غ�ɫ����
			return RED;
		}
		case 2: { // ������ɫ����
			return GREEN;
		}
		case 3: { // ������ɫ����
			return BLUE;
		}
		default: {
			return null; // �����ֵ
		}
		}
	}
}

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Color.getInstance(1).getName());
		//System.out.println(Color.RED + Color.GREEN);// ��ɫ���
	}
}
