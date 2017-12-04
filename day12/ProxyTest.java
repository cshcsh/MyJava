package com.java5200.date0530;

interface Network { // ����Network�ӿ�
	public void browse(); // ��������ĳ��󷽷�
}

class Real implements Network { // ��ʵ����������
	public void browse() { // ��д���󷽷�
		System.out.println("���������Ϣ");
	}
}

class Proxy implements Network { // ��������
	private Network network;

	public Proxy(Network network) { // ���ô������ʵ����
		this.network = network; // ���ô��������
	}

	public void check() { // �����������صĲ���
		System.out.println("����û��Ƿ�Ϸ�");
	}

	public void browse() {
		this.check(); // ����ͬʱ���ö�������ҵ����صĲ���
		this.network.browse(); // ������ʵ��������
	}
}

public class ProxyTest {

	public static void main(String[] args){
		
		Real real=new Real();
		Proxy proxy=new Proxy(real);
		proxy.browse();
	}
	
}