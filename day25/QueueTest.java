package com.java5200.date0612;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// add()和remove()方法在失败的时候会抛出异常(不推荐)
		Queue<String> queue = new LinkedList<String>();
		// 添加元素
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
