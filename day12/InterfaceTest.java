package com.java5200.date0530;

interface USB { // ����USB�ӿ�
	
	public void start(); // USB�豸��ʼ����
	public void stop(); // USB�豸��������
}

class Computer {
	
	public static void plugin(USB usb) { // ֻҪ��USB���豸�Ͷ�������˵ط�����
		usb.start(); // ��USB�豸��ʼ����
		System.out.println("======= USB �豸���� =======");
		usb.stop(); // ��USB�豸ֹͣ����
	}
}

class Flash implements USB { // U��
	
	public void start() { // ��дstart()����
		System.out.println("U�̿�ʼ������");
	}

	public void stop() { // ��дstop()����
		System.out.println("U��ֹͣ������");
	}
}

class Print implements USB { // ��ӡ��
	
	public void start() { // ��дstart()����
		System.out.println("��ӡ����ʼ������");
	}

	public void stop() { // ��дstop()����
		System.out.println("��ӡ��ֹͣ������");
	}
}

public class InterfaceTest {
	
	public static void main(String[] args){
		
		Computer computer=new Computer();
		USB usb=new Flash();
		computer.plugin(usb);
	}
	
}