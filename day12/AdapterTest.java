package com.java5200.date0530;

interface Window { // 定义window接口，表示窗口操作
	public void open(); // 窗口打开

	public void close(); // 窗口关闭

	public void activited(); // 窗口活动

	public void min(); // 窗口最小化

	public void max(); // 窗口最大化
}

// 定义抽象类实现接口，在此类中重写方法，但是所有的方法体为空
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

// 子类直接继承WindowAdapter类，有选择的实现需要的方法
class WindowImpl extends WindowAdapter {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("窗口打开。") ;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("窗口关闭。") ;
	}

	
}
public class AdapterTest {
	
	public static void main(String[] args){
		
		Window window=new WindowImpl();
		window.open();
		window.close();
	}
	
}