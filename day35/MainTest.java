package com.java5200.date0622;

class Product {

	private String name;//��Ʒ����
	
	public Product(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "��Ʒ����=" + name;
	}
	
}

class Shop {

	private int nIndex=0;
	Product[] products=new Product[10];
	
	/**
	 * ������Ʒ
	 * @param product
	 */
	public synchronized void addProduct(Product product){
		
		while(nIndex==products.length){
			try {
				this.wait();//��Ʒ�������Ժ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();//���ѵȴ����������߿���ȡ��Ʒ��
		products[nIndex]=product;
		nIndex++;
	}
	
	/**
	 * ȡ�߲�Ʒ
	 * @return
	 */
	public synchronized Product getProduct(){
		
		while(nIndex==0){
			try {
				this.wait();//��Ʒ�ѿգ��Ժ��ȡ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();//���ѵȴ����������߿���������Ʒ��
		nIndex--;
		return products[nIndex];
	}
}

class Consumer01 implements Runnable {

	private Shop shop;
	
	public Consumer01(Shop inShop) {
		this.shop = inShop;
	}

	public void run() {

		for(int i=0;i<15;i++){
			Product product=shop.getProduct();
			System.out.println("�����ˣ�"+product);
			try {
				Thread.sleep((long) (Math.random()*2000));//���ѹ���ʱ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Producer02 implements Runnable {

	private Shop shop;
	
	public Producer02(Shop inShop) {
		this.shop = inShop;
	}

	public void run() {

		for(int i=0;i<15;i++){
			Product product=new Product("�ֻ�");
			shop.addProduct(product);
			System.out.println("�����ˣ�"+product);
			try {
				Thread.sleep((long) (Math.random()*2000));//��������ʱ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MainTest {

	public static void main(String[] args) {

		Shop shop=new Shop();
		Thread t1=new Thread(new Producer02(shop));
		t1.start();
		Thread t2=new Thread(new Consumer01(shop));
		t2.start();
	}

}
