package com.java5200.date0612;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ʹ��LinkedList��������ַ�������,ɾ������,�޸�����,�����������(���Ƚ��ȳ��ķ�ʽȡ��)
 * 
 * @author CSH
 * @date 2018��6��12������4:05:11
 */
public class QueueTest2 {

	public static void main(String[] args) {

		Queue<String> queue=new LinkedList<String>();
		//���
		queue.offer("abc");
		queue.offer("def");
		queue.offer("hig");
		//ɾ��
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
