package com.java5200.date0613;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Test05 {

	@Test
	public void add() {
		Collection<String> collection=new ArrayList<String>();
		collection.add("a");
		collection.add("b");
		collection.add("c");
		Collections.addAll(collection,"d","e");
		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void reverse() {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		Collections.reverse(list);
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void find() {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		int n=Collections.binarySearch(list, "e");
		System.out.println("ÄÚÈÝÎ»ÖÃ£º"+n);
	}
	
	@Test
	public void replace() {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		Collections.replaceAll(list, "a", "aaa");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void sort() {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("e");
		list.add("d");
		Collections.sort(list);
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void swap() {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		Collections.swap(list, 2, 3);;
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
