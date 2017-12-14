package com.java5200.date0608;

class Info { // ������Ϣ��
	private String name = "��С��"; // ��Ϣ����,ָ��Ĭ��ֵ
	private String content = "JAVA��ʦ"; // ��Ϣ����,ָ��Ĭ��ֵ

	public String getName() { // ȡ����Ϣ����
		return name; // ������Ϣ����
	}

	public void setName(String name) { // ������Ϣ����
		this.name = name; // ����name��������
	}

	public String getContent() { // ȡ����Ϣ����
		return content; // ������Ϣ����
	}

	public void setContent(String content) { // ������Ϣ����
		this.content = content; // ����content��������
	}
}

class Producer2 implements Runnable { // �����������߳�
	private Info info = null; // ����Info����

	public Producer2(Info info) { // ͨ�����췽������Info��������
		this.info = info; // Ϊinfo���Գ�ʼ��
	}

	public void run() { // ��дrun()����
		boolean flag = false; // ������λ
		for (int i = 0; i < 50; i++) { // ѭ��50��
			if (flag) { // ���Ϊtrue,�����õ�һ����Ϣ
				this.info.setName("��С��"); // ������Ϣ����
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // �����ӳ�,�����쳣
				this.info.setContent("JAVA��ʦ"); // ������Ϣ����
				flag = false; // �޸ı��λ
			} else { // ���Ϊfalse,�����õڶ�����Ϣ
				this.info.setName("chuanxi");// ������Ϣ����
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // �����ӳ�,�����쳣
				this.info.setContent("www.yuanrenhome.com");
				flag = true; // �޸ı��λ
			}
		}
	}
}

class Consumer2 implements Runnable { // �����������߳�
	private Info info = null; // ����Info����

	public Consumer2(Info info) { // ͨ�����췽������Info��������
		this.info = info; // Ϊinfo���Գ�ʼ��
	}

	public void run() { // ��дrun()����
		for (int i = 0; i < 50; i++) { // ѭ��50��
			try {
				Thread.sleep(100); // �����ӳ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.info.getName() + " --> " + this.info.getContent());// ȡ����Ϣ
		}
	}
}

public class PCerTest {

	public static void main(String[] args) {
		Info i = new Info(); // ʵ����Info����
		Producer2 pro = new Producer2(i); // ʵ����������,����Info����
		Consumer2 con = new Consumer2(i); // ʵ����������,����Info����
		new Thread(pro).start(); // �����������߳�
		new Thread(con).start(); // �����������߳�
	}

}
