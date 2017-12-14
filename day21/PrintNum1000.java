package com.java5200.date0608;

public class PrintNum1000 {

	private static int i = 1;

	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
				while (i <= 1000) {
					synchronized (this) {
						if (i % 2 == 1) {
							System.out.println("thread1  " + i++);
						} else {
							this.notify();
							try {
								this.wait(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

				}
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				while (i <= 1000) {
					synchronized (this) {
						if (i % 2 == 0) {
							System.out.println("thread2  " + i++);
						} else {
							this.notify();
							try {
								this.wait(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

				}
			}
		};
		thread1.start();
		thread2.start();
	}
}