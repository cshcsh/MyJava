package com.java5200.date0601;

class Node {

	private Object data;//��ǰ�ڵ�ֵ
	private Node next;//��һ�ڵ�
	
	public Node(Object data) {
		super();
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

class MyLinkedList{
	
	private Node head=null;//ͷ���
	private Node current=null;//��ǰ���
	
	public MyLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void add(Object data){
		Node node=new Node(data);
		if(head==null){
			head=node;
			current=node;
			node.setNext(null);
		}else{
			current.setNext(node);
			current=node;
		}
	}
	public void printNodeData(){
		
		Node node=head;
		while (node!=null) {
			System.out.println(node.getData());
			node=node.getNext();
		}
	}
}

public class MyLinkedListTest{
	
	public static void main(String[] args){
		
		MyLinkedList myLinkedList=new MyLinkedList();
		myLinkedList.add(0);
		myLinkedList.add(5);
		myLinkedList.add(4);
		myLinkedList.add(5);
		myLinkedList.add(9);
		myLinkedList.printNodeData();
	}
}
