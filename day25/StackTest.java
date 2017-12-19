package com.java5200.date0612;

import java.util.Stack;

public class StackTest {

	public static void main(String args[]) {
		
		Stack<String> s = new Stack<String>();// 实例化Stack对象
		s.push("A"); // 入栈
		s.push("B"); // 入栈
		s.push("C"); // 入栈
		while(!s.empty()){
			System.out.print(s.pop() + "、") ; // 出栈
		}
	}
}
