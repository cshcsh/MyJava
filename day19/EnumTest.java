package com.java5200.date0606;

class Color {
	public static final Color RED = new Color("红色"); // 定义第一个对象
	public static final Color GREEN = new Color("绿色"); // 定义第二个对象
	public static final Color BLUE = new Color("蓝色"); // 定义第三个对象
	private String name;

	private Color(String name) { // 构造方法私有化,同时设置颜色的名称
		this.setName(name); // 为颜色的名字赋值
	}

	public String getName() { // 取得颜色名称
		return this.name;
	}

	public void setName(String name) { // 设置颜色名称
		this.name = name;
	}

	public static Color getInstance(int i) { // 得到一个颜色,只能从固定的几个颜色中取得
		switch (i) {
		case 1: { // 返回红色对象
			return RED;
		}
		case 2: { // 返回绿色对象
			return GREEN;
		}
		case 3: { // 返回蓝色对象
			return BLUE;
		}
		default: {
			return null; // 错误的值
		}
		}
	}
}

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Color.getInstance(1).getName());
		//System.out.println(Color.RED + Color.GREEN);// 颜色相加
	}
}
