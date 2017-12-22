package com.java5200.date0613;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 向HashMap与Hashtable中分别添加、删除、取出
 * 10000个对象(可以是字符串可以是自定义对象)
 * •分别记录操作HashMap与Hashtable的耗时和内存消耗
 * 
 * @author CSH
 * @date 2018年6月14日上午10:07:53
 */
class P{

	public P() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class Test07 {

	public static void main(String[] args) throws IOException {

		Runtime r = Runtime.getRuntime(); 
		r.gc();
		Map<Integer, P> map=null;
		long startMem = r.freeMemory(); 
		//long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map=new HashMap<>();
			//map.put(i, new P());
		}
		//long end=System.currentTimeMillis();
		long endMen = startMem - r.freeMemory();
		//System.out.println("HashMap添加耗时："+(end-start)+"\tHashMap添加消耗内存："+endMen);
		System.out.println("\tHashMap添加消耗内存："+endMen);
		/*r.gc();
		long startMem2 = r.freeMemory(); 
		long start2=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map.get(i);
		}
		long end2=System.currentTimeMillis();
		long endMen2 = startMem2 - r.freeMemory();
		System.out.println("HashMap取出耗时："+(end2-start2)+"\tHashMap取出消耗内存："+endMen2);
		
		r.gc();
		long startMem3 = r.freeMemory(); 
		long start3=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map.remove(i);
		}
		long end3=System.currentTimeMillis();
		long endMen3 = startMem3 - r.freeMemory();
		System.out.println("HashMap删除耗时："+(end3-start3)+"\tHashMap删除消耗内存："+endMen3);
		
		
		Map<Integer, String> map2=new Hashtable<>();
		r.gc();
		long startMem4 = r.freeMemory(); 
		long start4=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map2.put(i, "a");
		}
		long end4=System.currentTimeMillis();
		long endMen4 = startMem4 - r.freeMemory();
		System.out.println("Hashtable添加耗时："+(end4-start4)+"\tHashtable添加消耗内存："+endMen4);
		
		r.gc();
		long startMem5 = r.freeMemory(); 
		long start5=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map2.get(i);
		}
		long end5=System.currentTimeMillis();
		long endMen5 = startMem5 - r.freeMemory();
		System.out.println("Hashtable取出耗时："+(end5-start5)+"\tHashtable取出消耗内存："+endMen5);
		
		r.gc();
		long startMem6 = r.freeMemory(); 
		long start6=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			map2.remove(i);
		}
		long end6=System.currentTimeMillis();
		long endMen6 = startMem6 - r.freeMemory();
		System.out.println("Hashtable删除耗时："+(end6-start6)+"\tHashtable删除消耗内存："+endMen6);
		*/
		 
	}
	
}
