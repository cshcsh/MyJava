package com.java5200.date0611;

import java.util.Random;

interface Const{
	public static final int RAND_CONST=new Random().nextInt();//���ǳ���
}

public class ConstTest {

	public static void main(String[] args) {
		System.out.println(Const.RAND_CONST);
	}

}
