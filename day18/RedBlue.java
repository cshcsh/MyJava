package com.java5200.date0605;

import java.util.Arrays;
import java.util.Random;

/**
 * 双色球，蓝球1-16,红球1-33,考虑重复,排序一下
 * 
 * @author CSH
 * @date 2018年6月11日上午10:58:58
 */
public class RedBlue {

	public static boolean beBoolean(int[] a,int n){
		boolean b=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==n){
				b=true;
			}
		}
		return b;
	}
	
	public static void RedBlue() {
		Random random=new Random();
		int[] a =new int[6];
		int n,j=0;
		while (j<6) {// 随机六个红球，不重复
			n =random.nextInt(33) + 1;//可能重复
			if(!beBoolean(a,n)){
				a[j] = n;
				j++;
			}
		}
		Arrays.sort(a);// 排序
		System.out.print("蓝球：" + (new Random().nextInt(16) + 1) + " ");// 随机蓝球
		System.out.print("红球：");
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RedBlue();
	}

}
