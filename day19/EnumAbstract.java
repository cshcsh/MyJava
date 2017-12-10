package com.java5200.date0606;

enum Color8 { // 枚举类实现接口
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
	public abstract String getColor(); // 定义抽象方法
}



public class EnumAbstract {

	public static void main(String[] args) {
		for (Color8 c : Color8.values()) { // foreach输出
			System.out.print(c.getColor() + "、"); // 输出
		}
	}
}
