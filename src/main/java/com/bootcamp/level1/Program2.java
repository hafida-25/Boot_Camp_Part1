package com.bootcamp.level1;

public class Program2 {
	
	int size;
	Node head,tail;
	
	public boolean isEmpty() {
		return (size==0);
	}
	public int size() {
		return size;
	}
	
	public void addFirst(Object data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
			tail=node;
		}else {
			node.next=head;
			head.previous=node;
			head=node;
		}
		size++;
		
	}
	
	public void addLast(Object data) {
		Node node=new Node(data);
		if(tail ==null) {
			head=node;
			tail=node;
		}else {
			tail.next =node;
			node.previous=tail;
			tail=node;
		}
		size++;
		}
	
	public void displayForward() {
		if(head== null) {
			System.out.println("Linked list is empty");
		}else {
			System.out.println("Forward traversal");
			Node currentNode =head;
			while (currentNode != null) {
				System.out.println(currentNode.data+" ");
				currentNode=currentNode.next;
			}
		}
	}
	
	public void displayBackward() {
		if(head== null) {
			System.out.println("Linked list is empty");
		}else {
			System.out.println("Backward traversal");
			Node currentNode =tail;
			while (currentNode != null) {
				System.out.println(currentNode.data+" ");
				currentNode=currentNode.previous;
			}
		}
		
	}
	
	
	private class Node {
		Object data;
		Node previous,next;
	
 
		private  Node(Object d) {
	 data =d;
	 previous =null;
	 next=null;
	 
 }
	}
	public static void main(String[] args) {
		// Write a program to implement a doubly-linked list in Java.
		
		Program2 list = new Program2();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst("Hello");
		list.addLast(12);
		list.displayForward();
		list.displayBackward();
		System.out.println("stack empty  :" + list.isEmpty());
		System.out.println("size :" +list.size());
		
		
		

	}

}
