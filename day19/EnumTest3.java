package com.java5200.date0606;

enum Color3 {
	RED("红色"), GREEN("绿色"), BLUE("兰色"); // 定义枚举的三个类型
	private Color3(String name){ // 定义构造方法
		this.setName(name) ; // 设置名字
	}
	private String name ; // 定义name属性
	public String getName() { // 取得name属性
		return name;
	}
	public void setName(String name) { // 设置name属性
		this.name = name;
	}
}

public class EnumTest3 {
	public static void main(String[] args) {
		for(Color3 c:Color3.values()){ //枚举.values()表示得到全部枚举的内容
			System.out.println(c.ordinal()
					+ " --> " + c.name()//枚举名字
					+ "(" + c.getName() + ")") ;// 输出枚举设置名字
		}
	}
}

