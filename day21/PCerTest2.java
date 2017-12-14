package com.java5200.date0608;

class Info2 { // ������Ϣ��
	private String name = "��С��"; // ��Ϣ����,ָ��Ĭ��ֵ
	private String content = "JAVA��ʦ"; // ��Ϣ����,ָ��Ĭ��ֵ

	public synchronized void set(String name, String content) {// ������Ϣ���Ƽ�����
		this.setName(name); // ������Ϣ����
		try {
			Thread.sleep(300); // �����ӳ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content); // ������Ϣ����
	}

	public synchronized void get() { // ȡ����Ϣ����
		try {
			Thread.sleep(300); // �����ӳ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " --> " + this.getContent()); // �����Ϣ
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

class Producer3 implements Runnable { // �����������߳�
	private Info2 info = null; // ����Info����

	public Producer3(Info2 info2) { // ͨ�����췽������
		this.info = info2; // Ϊinfo���Գ�ʼ��
	}

	public void run() { // ��дrun()����
		boolean flag = false; // ������λ
		for (int i = 0; i < 50; i++) { // ѭ��50��
			if (flag) { // ���Ϊtrue,�����õ�һ����Ϣ
				this.info.set("��С��", "JAVA��ʦ"); // ������Ϣ
				flag = false; // �޸ı��λ
			} else { // ���Ϊfalse,�����õڶ�����Ϣ
				this.info.set("chuanxi", "www.yuanrenhome.com");
				flag = true; // �޸ı��λ
			}
		}
	}
}

class Consumer3 implements Runnable { // �����������߳�
	private Info2 info = null; // ����Info����

	public Consumer3(Info2 info) { // ͨ�����췽������Info��������
		this.info = info; // Ϊinfo���Գ�ʼ��
	}

	public void run() { // ��дrun()����
		for (int i = 0; i < 50; i++) { // ѭ��50��
			try {
				Thread.sleep(100); // �����ӳ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get(); // ȡ����Ϣ
		}
	}
}

public class PCerTest2 {

	public static void main(String[] args) {
		Info2 i = new Info2(); // ʵ����Info����
		Producer3 pro = new Producer3(i); // ʵ����������,����Info����
		Consumer3 con = new Consumer3(i); // ʵ����������,����Info����
		new Thread(pro).start(); // �����������߳�
		new Thread(con).start(); // �����������߳�
	}
}
