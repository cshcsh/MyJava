package com.java5200.date0606;

enum Color8 { // ö����ʵ�ֽӿ�
	RED { // ö�ٶ���ʵ�ֳ��󷽷�
		public String getColor() {
			return "��ɫ";
		}
	},
	GREEN { // ö�ٶ���ʵ�ֳ��󷽷�
		public String getColor() {
			return "��ɫ";
		}
	},
	BLUE { // ö�ٶ���ʵ�ֳ��󷽷�
		public String getColor() {
			return "��ɫ";
		}
	};
	public abstract String getColor(); // ������󷽷�
}



public class EnumAbstract {

	public static void main(String[] args) {
		for (Color8 c : Color8.values()) { // foreach���
			System.out.print(c.getColor() + "��"); // ���
		}
	}
}
