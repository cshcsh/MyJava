package com.java5200.date0606;

interface Print { // 定义Print接口
	public String getColor(); // 定义抽象方法
}

enum Color7 implements Print { // 枚举类实现接口
	RED { // 枚举对象实现抽象方法
		public String getColor() {
			return "红色";
		}
	},
	GREEN { // 枚举对象实现抽象方法
		public String getColor() {
			return "绿色";
		}
	},
	BLUE { // 枚举对象实现抽象方法
		public String getColor() {
			return "蓝色";
		}
	};
}



public class EnumInterface2 {

	public static void main(String[] args) {
		for (Color7 c : Color7.values()) { // foreach输出
			System.out.print(c.getColor() + "、"); // 输出
		}
	}
}
