package com.java5200.date0530;

interface Window { // ����window�ӿڣ���ʾ���ڲ���
	public void open(); // ���ڴ�

	public void close(); // ���ڹر�

	public void activited(); // ���ڻ

	public void min(); // ������С��

	public void max(); // �������
}

// ���������ʵ�ֽӿڣ��ڴ�������д�������������еķ�����Ϊ��
abstract class WindowAdapter implements Window {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activited() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void min() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void max() {
		// TODO Auto-generated method stub
		
	}
}

// ����ֱ�Ӽ̳�WindowAdapter�࣬��ѡ���ʵ����Ҫ�ķ���
class WindowImpl extends WindowAdapter {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("���ڴ򿪡�") ;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("���ڹرա�") ;
	}

	
}
public class AdapterTest {
	
	public static void main(String[] args){
		
		Window window=new WindowImpl();
		window.open();
		window.close();
	}
	
}