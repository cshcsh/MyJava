package com.java5200.date0606;

class Notepad<K, V> { // �˴�ָ��������������
	private K key; // �˱������������ⲿ����
	private V value; // �˱������������ⲿ����
	
	public Notepad(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
};

public class PointTest4 {

	public static void main(String[] args){
		Notepad<String,Integer> notepad=new Notepad<String,Integer>("43y",9);//ָ�������������
		String string=notepad.getKey();
		int num=notepad.getValue();
		System.out.println("x�������ǣ�" + string);
		System.out.println("y�������ǣ�" + num);
	}
}
