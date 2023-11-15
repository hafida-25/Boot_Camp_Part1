package com.bootcamp.level2;

public class Program4 {

	public static void main(String[] args) {
		//Write a Java program to reverse a given string without using any built-in functions.
		
	String name ="HAFEDHA";
	String reverse = "";
	
	int length =name.length();//length of the name 
	for (int i=length-1;i>=0;i--) {
		reverse = reverse+name.charAt(i);
	}
	System.out.println("Reversed string is :" +reverse);
	

	}

}
