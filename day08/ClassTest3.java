package com.java5200.date0526;

/*
 * ���һ������java�������� ִ�к�ʱ(����)���ڴ�����(KB)�Ĺ�����,�ڷ���ִ�к��ܷ������û�������ʱ���ڴ����ĵ����
 * ������������Ӧ��,�۲�ִ�����
 * (����ģʽ)
 */
interface Function {
	void fun();
}

class Test implements Function {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		String s = "hello";
		for (int i = 0; i < 1000; i++) {
			s += i;
		}
		// Runtime.getRuntime().gc();
		// Runtime.getRuntime();
	}

}

// ����
class Agent {
	public long currentTime() {
		return System.currentTimeMillis();// �����Ժ���Ϊ��λ�ĵ�ǰʱ��
	}

	public long currentStore() {
		return Runtime.getRuntime().freeMemory();// ���� Java ������еĿ����ڴ���
	}
}

public class ClassTest3 {
	private Agent agent = new Agent();

	public void function(Function fun) {
		long starttime = agent.currentTime();
		long startstore = agent.currentStore();
		fun.fun();// ���÷���
		long endtime = agent.currentTime();
		long endstore = agent.currentStore();
		System.out.println("��������ʱ�䣺" + (endtime - starttime) + "����");
		System.out.println("�����ڴ棺" + (startstore - endstore) / 1024 + "kb");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ClassTest3().function(new Test());
		Runtime.getRuntime().gc();

	}

}
