package com.java5200.date0606;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

enum Color6 {
	RED, GREEN, BLUE; // ����ö�ٵ���������
}


public class EnumTest7 {
	
	public static void main(String[] args) {
		Set<Color6> t = new TreeSet<Color6>(); // ֻ�ܼ���Color����
		t.add(Color6.GREEN); // ������ɫ��ö�ٶ���
		t.add(Color6.BLUE); // ������ɫ��ö�ٶ���
		t.add(Color6.RED); // ���Ӻ�ɫ��ö�ٶ���
		Iterator<Color6> iter = t.iterator(); // ʹ�õ������
		while (iter.hasNext()) {
			System.out.print(iter.next() + "��");
		}
	}

}
