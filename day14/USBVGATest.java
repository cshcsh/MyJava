package com.java5200.date0601;

interface IO{
	
	public void input();//抽象输入方法
	public void output();//抽象输出方法
}

interface USB extends IO{
	
	public static final int NUM=4;//针脚数（4个）
}

class USBImpl implements USB{

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("USB input");
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("USB output");
	}
	
	public void printNum(){
		
		System.out.println(NUM);
	}
	
}

interface VGA extends IO{
	
	public static final int NUM=15;//针脚数（15个）
}

class VGAImpl implements VGA{

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("VGA input");
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("VGA output");
	}
	
	public void printNum(){
		
		System.out.println(NUM);
	}
	
}

public class USBVGATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USBImpl usbImpl=new USBImpl();
		usbImpl.input();
		usbImpl.output();
		usbImpl.printNum();
		
		VGAImpl vgaImpl=new VGAImpl();
		vgaImpl.input();
		vgaImpl.output();
		vgaImpl.printNum();
	}

}
