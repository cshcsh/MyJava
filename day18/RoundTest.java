package com.java5200.date0605;

import java.math.BigDecimal;

class MyMathRound {
	public static double round(double num, int scale) {
		BigDecimal bd = new BigDecimal(num);
		return bd.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP).doubleValue();// ROUND_HALF_UP是BigDecimal的一个常量,表示进行四舍五入的操作
	}

	public static BigDecimal round(String num, int scale) {
		BigDecimal bd = new BigDecimal(num);
		return bd.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP);
	}
}

public class RoundTest {
	public static void main(String[] args) {
		System.out.println("四舍五入：" + MyMathRound.round(88.56137, 2));
		System.out.println("四舍五入：" + MyMathRound.round(98.66637, 2));
		System.out.println("四舍五入：" + MyMathRound.round("99.76637", 3));
	}

}
