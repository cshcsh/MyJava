package com.java5200.date0605;

import java.util.Random;

public class RandomTest {

	public static void main(String args[]) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(100) + "\t");
		}
	}
}
