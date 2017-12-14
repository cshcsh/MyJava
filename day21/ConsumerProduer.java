package com.java5200.date0608;

class Product {
	private int id;// 产品编号
	private String name;// 产品名称
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "产品 [产品编号=" + id + ",  产品名称=" + name + "]";
	}
}

class Shop {
	private int nIndex = 0;
	Product[] products = new Product[10];
	public synchronized void addProduct(Product product) {
		while (nIndex == products.length) {
			try {
				this.wait();// 产品已满，稍后生产
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();// 唤醒等待区的消费者可以取产品了
		products[nIndex] = product;
		nIndex++;
	}
	public synchronized Product getProduct() {
		while (nIndex == 0) {
			try {
				this.wait();// 产品已空，稍后获取
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();// 唤醒等待区的生产者可以生产产品了
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
			System.out.println("消费了：" + product);
			try {
				Thread.sleep((long) (Math.random() * 2000));// 消费过程时间
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
			Product product = new Product(i, "手机");
			shop.addProduct(product);
			System.out.println("生产了：" + product);
			try {
				Thread.sleep((long) (Math.random() * 1000));// 生产过程时间
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
