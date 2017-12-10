package com.java5200.date0606;

class Notepad<K, V> { // 此处指定两个泛型类型
	private K key; // 此变量的类型由外部决定
	private V value; // 此变量的类型由外部决定
	
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
		Notepad<String,Integer> notepad=new Notepad<String,Integer>("43y",9);//指定多个泛型类型
		String string=notepad.getKey();
		int num=notepad.getValue();
		System.out.println("x的坐标是：" + string);
		System.out.println("y的坐标是：" + num);
	}
}
