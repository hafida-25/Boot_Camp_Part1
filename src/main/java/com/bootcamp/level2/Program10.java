package com.bootcamp.level2;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// Write a Java program to count the number of words in a given string.
		
		System.out.println("Enter the String:");
		Scanner scanner =new Scanner(System.in);
		String string = scanner.nextLine();
		
		
		int count =1;
		for(int i=0;i<string.length()-1;i++)
		{
			if((string.charAt(i)==' ') && (string.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in a string:" +count);
		scanner.close();

	}

}
