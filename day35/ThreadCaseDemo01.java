package com.java5200.date0622;

class Info { // ������Ϣ��
	private String name = "��С��"; // ��Ϣ����,ָ��Ĭ��ֵ
	private String content = "JAVA��ʦ"; // ��Ϣ����,ָ��Ĭ��ֵ
	private boolean flag = false; // ���ñ�־λ

	public synchronized void set(String name, String content) throws InterruptedException {// ������Ϣ���Ƽ�����
		if (!flag) { // ��־λΪfalse,����������
			this.wait(); // �ȴ�������ȡ��,�����쳣
		}
		this.setName(name); // ������Ϣ����
		Thread.sleep(300); // �����ӳ�,�����쳣
		this.setContent(content); // ������Ϣ����
		flag = false; // �޸ı�־λ,��ʾ����ȡ��
		this.notify(); // ���ѵȴ��߳�
	}

	public synchronized void get() throws InterruptedException { // ȡ����Ϣ����
		if (flag) { // ��־λΪtrue,������ȡ��
			this.wait(); // �ȴ�����������,�����쳣
		}
		Thread.sleep(300); // �����ӳ�,�����쳣
		System.out.println(this.getName() + " --> " + this.getContent()); // �����Ϣ
		flag = true; // �޸ı�־λΪtrue,��ʾ��������
		this.notify(); // ���ѵȴ��߳�
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

class Producer implements Runnable { // �����������߳�
	private Info info = null; // ����Info����

	public Producer(Info info) { // ͨ�����췽������
		this.info = info; // Ϊinfo���Գ�ʼ��
	}

	public void run() { // ��дrun()����
		boolean flag = false; // ������λ
		for (int i = 0; i < 50; i++) { // ѭ��50��
			if (flag) { // ���Ϊtrue,�����õ�һ����Ϣ
				try {
					this.info.set("��С��", "JAVA��ʦ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // ������Ϣ
				flag = false; // �޸ı��λ
			} else { // ���Ϊfalse,�����õڶ�����Ϣ
				try {
					this.info.set("chuanxi", "www.yuanrenhome.com");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag = true; // �޸ı��λ
			}
		}
	}
}

class Consumer implements Runnable { // �����������߳�
	private Info info = null; // ����Info����

	public Consumer(Info info) { // ͨ�����췽������Info��������
		this.info = info; // Ϊinfo���Գ�ʼ��
	}

	public void run() { // ��дrun()����
		for (int i = 0; i < 50; i++) { // ѭ��50��
			try {
				Thread.sleep(100); // �����ӳ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				this.info.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // ȡ����Ϣ
		}
	}
}

public class ThreadCaseDemo01 {

	public static void main(String[] args) {
		Info i = new Info(); // ʵ����Info����
		Producer pro = new Producer(i); // ʵ����������,����Info����
		Consumer con = new Consumer(i); // ʵ����������,����Info����
		new Thread(pro).start(); // �����������߳�
		new Thread(con).start(); // �����������߳�
	}
}
