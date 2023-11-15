package com.bootcamp.level1;

//Write a program to implement a stack using a linked list in Java.

public class Program4 {
	node top;

	
	// node class to defime linked list nodes
	class node{
		int data;
		node next;
	


	// function to create a new node with a given value 
	
	node(int data) {
		this.data=data;
		this.next=null;
	}
	}
	
	// function to push a new element to the stack
	
		 void push(int data) {
			 try {
			node newnode= new node(data);
			newnode.next=top;
			top=newnode;
			 }catch(NullPointerException e) {
			System.out.println("Stack is full");
			}
		 
			
		}
		

//function to pop the top element from the stack
	void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
			return;
		}
		top=top.next;
	}


	
	
	
// function to return the top element of the stack
	void peek() {
		if(top== null) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top of Stack =" +top.data);
		
	}
	 
	void display() {
		node currnode =top;
		if(top==null) {
			System.out.println("Stack is empty");
			return;
		}System.out.println("Stack elements: ");
		while(currnode!=null){
			System.out.println(currnode.data);
			currnode =currnode.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		Program4 stack = new Program4();
		stack.push(3); // add new element to the top of the stack
		stack.push(10);
		stack.push(25);
		stack.display(); // print element in the stack
		stack.pop(); // remove element from the top of the stack
		stack.display();
		stack.peek(); // examine element at the top without removing it 
		stack.pop();
		stack.display();
		stack.peek();
		
		

	}
}

	

