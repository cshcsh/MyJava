package com.java5200.date0606;

public class EnumSwitch {

	public static void main(String[] args) {
		for (Color2 c : Color2.values()) { // ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			print(c);
		}
	}
	
	public static void print(Color2 color) {
		switch (color) { // �ж�ÿ����ɫ
		case RED: { // ֱ���ж�ö������
			System.out.println("����ɫ");
			break;
		}
		case GREEN: { // ֱ���ж�ö������
			System.out.println("����ɫ");
			break;
		}
		case BLUE: { // ֱ���ж�ö������
			System.out.println("����ɫ");
			break;
		}
		default: { // δ֪����
			System.out.println("δ֪��ɫ");
			break;
		}
		}
	}
}
