package com.java5200.date0612;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// add()��remove()������ʧ�ܵ�ʱ����׳��쳣(���Ƽ�)
		Queue<String> queue = new LinkedList<String>();
		// ���Ԫ��
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		for (String q : queue) {
			System.out.println(q);
		}
	}
}
