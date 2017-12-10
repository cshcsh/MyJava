package com.java5200.date0606;

public class EnumSwitch {

	public static void main(String[] args) {
		for (Color2 c : Color2.values()) { // 枚举.values()表示得到全部枚举的内容
			print(c);
		}
	}
	
	public static void print(Color2 color) {
		switch (color) { // 判断每个颜色
		case RED: { // 直接判断枚举内容
			System.out.println("红颜色");
			break;
		}
		case GREEN: { // 直接判断枚举内容
			System.out.println("绿颜色");
			break;
		}
		case BLUE: { // 直接判断枚举内容
			System.out.println("蓝颜色");
			break;
		}
		default: { // 未知内容
			System.out.println("未知颜色");
			break;
		}
		}
	}
}
