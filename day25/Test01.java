package com.java5200.date0612;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ʹ��ArrayList��������ַ�������,ɾ������,�޸�����,�����������
 * 1,���� 2,get() 3,foreach
 * @author CSH
 * @date 2018��6��12������3:00:48
 */
public class Test01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("string1");
		list.add("  string2");
		list.add("66");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		//�����ٵ�������
		/*while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}*/
		System.out.println("----------------");
		list.set(0, "123456");
		list.remove(2);
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			String string = iterator2.next();
			System.out.println(string);
		}
	}

}
