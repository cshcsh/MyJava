package com.java5200.date0605;

import java.text.DecimalFormat;

class FormatDemo {
	
	public FormatDemo() {
		super();
	}
	
	public void format1(String pattern, double value) {
		DecimalFormat df = null; // 声明一个DecimalFormat对象
		df = new DecimalFormat(pattern); // 实例化对象
		String str = df.format(value); // 格式化数字
		System.out.println("使用" + pattern + "格式化数字" + value + "：" + str);
	}
}
public class DecimalFormatTest {

	public static void main(String[] args) {
		FormatDemo demo = new FormatDemo();
		demo.format1("###,###.###", 111222.34567);
		demo.format1("000,000.000", 11222.34567);
		demo.format1("###,###.###￥", 111222.34567);
		demo.format1("000,000.000￥", 11222.34567);
		demo.format1("##.###%", 0.345678); // 使用百分数形式
		demo.format1("00.###%", 0.0345678); // 使用百分数形式
		demo.format1("###.###\u2030", 0.345678); // 使用千分数形式
	}
}
