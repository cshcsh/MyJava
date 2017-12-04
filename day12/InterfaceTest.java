package com.java5200.date0530;

interface USB { // 定义USB接口
	
	public void start(); // USB设备开始工作
	public void stop(); // USB设备结束工作
}

class Computer {
	
	public static void plugin(USB usb) { // 只要是USB的设备就都可以向此地方插入
		usb.start(); // 让USB设备开始工作
		System.out.println("======= USB 设备工作 =======");
		usb.stop(); // 让USB设备停止工作
	}
}

class Flash implements USB { // U盘
	
	public void start() { // 重写start()方法
		System.out.println("U盘开始工作。");
	}

	public void stop() { // 重写stop()方法
		System.out.println("U盘停止工作。");
	}
}

class Print implements USB { // 打印机
	
	public void start() { // 重写start()方法
		System.out.println("打印机开始工作。");
	}

	public void stop() { // 重写stop()方法
		System.out.println("打印机停止工作。");
	}
}

public class InterfaceTest {
	
	public static void main(String[] args){
		
		Computer computer=new Computer();
		USB usb=new Flash();
		computer.plugin(usb);
	}
	
}