package com.java5200.date0608;

class Product {
	private int id;// ��Ʒ���
	private String name;// ��Ʒ����
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "��Ʒ [��Ʒ���=" + id + ",  ��Ʒ����=" + name + "]";
	}
}

class Shop {
	private int nIndex = 0;
	Product[] products = new Product[10];
	public synchronized void addProduct(Product product) {
		while (nIndex == products.length) {
			try {
				this.wait();// ��Ʒ�������Ժ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();// ���ѵȴ����������߿���ȡ��Ʒ��
		products[nIndex] = product;
		nIndex++;
	}
	public synchronized Product getProduct() {
		while (nIndex == 0) {
			try {
				this.wait();// ��Ʒ�ѿգ��Ժ��ȡ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();// ���ѵȴ����������߿���������Ʒ��
		nIndex--;
		return products[nIndex];
	}
}

class Consumer implements Runnable {
	private Shop shop;
	public Consumer(Shop inShop) {
		this.shop = inShop;
	}
	public void run() {
		for (int i = 0; i < 15; i++) {
			Product product = shop.getProduct();
			System.out.println("�����ˣ�" + product);
			try {
				Thread.sleep((long) (Math.random() * 2000));// ���ѹ���ʱ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Producer implements Runnable {
	private Shop shop;
	public Producer(Shop inShop) {
		this.shop = inShop;
	}
	public void run() {

		for (int i = 0; i < 15; i++) {
			Product product = new Product(i, "�ֻ�");
			shop.addProduct(product);
			System.out.println("�����ˣ�" + product);
			try {
				Thread.sleep((long) (Math.random() * 1000));// ��������ʱ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ConsumerProduer {

	public static void main(String[] args) {

		Shop shop = new Shop();
		Thread t1 = new Thread(new Producer(shop));
		t1.start();
		Thread t2 = new Thread(new Consumer(shop));
		t2.start();
	}

}
