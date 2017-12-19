package com.java5200.date0612;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用LinkedList集合添加字符串数据,删除数据,修改数据,输出所有数据(以先进先出的方式取出)
 * 
 * @author CSH
 * @date 2018年6月12日下午4:05:11
 */
public class QueueTest2 {

	public static void main(String[] args) {

		Queue<String> queue=new LinkedList<String>();
		//添加
		queue.offer("abc");
		queue.offer("def");
		queue.offer("hig");
		//删除
		queue.poll();
		for(String s:queue){
			System.out.println(s+" ");
		}
		/*Iterator<String> iterator=queue.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
	}

}
