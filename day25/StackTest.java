package com.java5200.date0612;

import java.util.Stack;

public class StackTest {

	public static void main(String args[]) {
		
		Stack<String> s = new Stack<String>();// ʵ����Stack����
		s.push("A"); // ��ջ
		s.push("B"); // ��ջ
		s.push("C"); // ��ջ
		while(!s.empty()){
			System.out.print(s.pop() + "��") ; // ��ջ
		}
	}
}
