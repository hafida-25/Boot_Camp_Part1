package com.bootcamp.level1;

import java.util.Stack;

public class Program5 {
	//Write a program to implement a queue using two stacks in Java.
	private Stack<Integer>stack1;
	private Stack<Integer>stack2;
	
	public Program5() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	public void enqueue(int data) {
		stack1.push(data);
	}
	
	public int dequeue() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return stack2.pop();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public static void main(String[] args) {
	Program5 queue = new Program5();
	 queue.enqueue(1);
	 queue.enqueue(2);
	 queue.enqueue(3);
	 
	 System.out.println(queue.dequeue());
	 System.out.println(queue.dequeue());
	 System.out.println(queue.dequeue());
	}

}
