package com.bootcamp.level3;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
	//Write a Java program to check if a given string is a palindrome or not.

		String string ="";
		String reverse_string ="";
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter a string : ");
		
		
		string =scanner.nextLine();
		
		int lenght = string.length();
		for(int i = lenght-1; i>=0 ;i--)
		
			reverse_string=reverse_string+string.charAt(i);
		
		if(string.equals(reverse_string))
			
			System.out.println(string+ " is a palindrome");
			else 
				System.out.println(string+" is not a palindrome");
		scanner.close();
	}


}
