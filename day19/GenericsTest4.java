package com.java5200.date0606;

public class GenericsTest4 {

	public static void main(String[] args) {
		Info3<Integer> i1=new Info3<Integer>();//声明Integer的泛型对象
		Info3<Float> i2 =new Info3<Float>();//声明Integer的泛型对象
		i1.setVar(30) ; // 设置整数,自动装箱
		i2.setVar(30.1f) ; // 设置小数,自动装箱
		fun(i1) ; // 是数字,可以传递
		fun(i2) ; // 是数字,可以传递
		}

	// 接收Info对象,范围上限设置为Number,所以只能接收数字类型
	//•范围上限使用extends关键字声明,表示参数化的类可能是所指定的类型,或者是此类型的子类
	public static void fun(Info3<? extends Number> temp){
		System.out.print(temp + "、");
	}
}
