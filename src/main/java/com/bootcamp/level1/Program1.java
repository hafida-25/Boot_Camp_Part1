package com.bootcamp.level1;

//Write a program to implement a binary search tree in Java.


	
	//create class node that represent a node in the binary search tree with an intger value 
	 class Node{

		int data;
		Node left; //left child node
		Node right; // right child node
		
	//
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
		
	}
	
	
	// create class binary search tree
	 class BinarySearchTree {
		
		Node root;
		
		public BinarySearchTree() {
			root=null;
		}
		
		// insert method 
		public void insert(int data) {
			root=insertRec(root,data);
		}
		
		
		
		public Node insertRec(Node root,int data) {
			if(root==null) {
				root=new Node(data);
				return root;
			}
			if(data<root.data) {
				root.left=insertRec(root.left,data);
			}else if(data>root.data) {
				root.right=insertRec(root.right,data);
			}
			return root;
			
		}

		
		
		//search method 
		public Node search(Node root,int data) {
			
			if(root==null || root.data ==data) {
				return root; 
			}
			
			if(data<root.data) {
				return search(root.left,data);
			
			}
			return search(root.right,data);
		}
 
		 // inorder method used to to traverse the binary search tree in order and print the value of node
		public void inorder() {
			
			inorderRec(root);
		}
		
		public void inorderRec(Node root) {
			if(root!= null ) {
				inorderRec(root.left);
				System.out.println(root.data+" ");
				inorderRec(root.right);
			}
			
		}
		
		
	}
	
	
	
	
	public class Program1 {
	public static void main(String[] args) {
		
		
		// Binary search Tree object 
		BinarySearchTree  binarysearchtree = new BinarySearchTree();
		
		binarysearchtree.insert(8);
		binarysearchtree.insert(3);
		binarysearchtree.insert(5);
		binarysearchtree.insert(10);
		binarysearchtree.insert(4);
		binarysearchtree.insert(7);
		binarysearchtree.insert(2);
		binarysearchtree.insert(17);
		binarysearchtree.insert(13);
		
		System.out.println("Inorder traversal :");
		 binarysearchtree.inorder();
		 
		 
		 System.out.println(" searching for 10:");
		Node result = binarysearchtree.search(binarysearchtree.root, 10);
		 if (result!= null) {
			 System.out.println("found" + result.data);
		 }else {
			 System.out.println("Not found");
			 
		 }
	}
	

}
