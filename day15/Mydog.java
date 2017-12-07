package com.java5200.date0602;

import java.util.Random;

abstract class Animals {

	private int weight;// 狗的体重

	public Animals(int weight) {
		super();
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//抽象狗咬狗方法
	public abstract void bite(Animals animals);
}

class Dog extends Animals {

	private String name;// 狗的名字

	public Dog(int weight, String name) {
		super(weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bite(Animals animals) {

		int w1 = this.getWeight();
		int w2 = animals.getWeight();
		while (w1 > 0 && w2 > 0) {

			boolean flag = new Random().nextBoolean();
			if (flag) {
				w1 = w1 - 5;
				if (w1 > 0) {
					System.out.println(this.getName() + " 体重：" + w1);
				} else {
					System.out.println(this.getName() + " is dead");
				}
			} else {
				w2 = w2 - 5;
				if (w2 > 0) {
					System.out.println(((Dog) animals).getName() + " 体重：" + w2);
				} else {
					System.out.println(((Dog) animals).getName() + " is dead");
				}

			}

		}
	}
}

/**
 * 狗咬狗
 * @author CSH
 * @date 2018年6月7日下午10:12:28
 */
public class Mydog {

	public static void main(String[] args) {

		Animals dog = new Dog(50, "Dog1");
		Animals dog2 = new Dog(50, "Dog2");
		dog.bite(dog2);
	}
}
