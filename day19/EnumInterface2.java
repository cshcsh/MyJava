package com.java5200.date0606;

interface Print { // ����Print�ӿ�
	public String getColor(); // ������󷽷�
}

enum Color7 implements Print { // ö����ʵ�ֽӿ�
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
}



public class EnumInterface2 {

	public static void main(String[] args) {
		for (Color7 c : Color7.values()) { // foreach���
			System.out.print(c.getColor() + "��"); // ���
		}
	}
}
