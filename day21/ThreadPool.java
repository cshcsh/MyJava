package com.java5200.date0608;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		// ����5���̶��߳�
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			final int count = i;
			// �̶߳���
			Runnable rab = new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName() + ":" + count);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			service.submit(rab);// �ύRunnable����
		}
		service.shutdown();
	}
}
