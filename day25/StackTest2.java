package com.java5200.date0612;

import java.util.Stack;

public class StackTest2 {
	
	public static void main(String args[]) {
		
		Stack<String> s = new Stack<String>();// ʵ����Stack����
		s.push("A"); // ��ջ
		s.push("B"); // ��ջ
		s.push("C"); // ��ջ
		System.out.print(s.pop() + "��") ; // ��ջ
		System.out.print(s.pop() + "��") ; // ��ջ
		System.out.print(s.pop() + "��") ; // ��ջ
		System.out.print(s.pop() + "��") ; // ��ջ,java.util.EmptyStackException
	}
}
