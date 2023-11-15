package com.bootcamp.level3;

public class Program7 {

	public static void main(String[] args) {
		// Write a Java program to reverse a given string.

		String string = "hafedha";
		String reverse_string ="";
		for (int i =0 ;i<string.length();i++) {
			reverse_string = string.charAt(i)+reverse_string;
			
		}
		System.out.println("reversed string is : " +reverse_string );
		
	}

}
