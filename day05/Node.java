package com.java5200.date0523;

public class Node{

	private Node data;
	private Node next;

	public Node(){
		
	}

	public Node(Node data,Node next){
		this.data=data;
		this.next=next;
	}

	public Node getData(){
		return data;
	}
	public void setData(Node data){
		this.data=data;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node next){
		this.next=next;
	}
}