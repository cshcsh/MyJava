package com.java5200.date0526;

/*
 * intern() 方法返回字符串对象的规范化表示形式。
 * 它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，
 * s.intern() == t.intern() 才为 true
 * 返回值：一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
 */
public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "atguigu";
		String s2 = "java";
		String s4 = "java";
		String s3 = new String("java");
		System.out.println(s2 == s3);
		//编译时，这两个"java"被认为是同一个对象保存到了常量池中；
		//运行时JVM则认为这两个变量赋的是同一个对象，所以返回true。
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s3));
		String s5 = "atguigujava";
		String s6 = (s1 + s2).intern();
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
	}
}
