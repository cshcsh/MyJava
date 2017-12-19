package com.java5200.date0612;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * �����ʹ��Iterator���ʱ,�����Լ�������ɾ������,����������ʱ�Ĵ���
 * 
 * @author CSH
 * @date 2018��6��12������5:40:42
 */
public class IteratorTest {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>(); // ʵ����List�ӿ�
		all.add("hello"); // ����Ԫ��
		all.add("_"); // ����Ԫ��
		all.add("world"); // ����Ԫ��
		Iterator<String> iter = all.iterator(); // ֱ��ʵ����Iterator�ӿ�
		while (iter.hasNext()) {
			String str = iter.next(); // ȡ������
			if ("_".equals(str)) { // �ж������Ƿ��ǡ�_��
				//all.remove(str); // ɾ����ǰԪ��,ʹ�ü���ɾ��
				iter.remove();
			} else {
				System.out.print(str + "��"); // ���Ԫ������
			}
		}
		System.out.println("\nɾ��֮��ļ��ϣ�" + all); // �����������,����toString()����
	}
}
