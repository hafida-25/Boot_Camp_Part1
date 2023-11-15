package com.bootcamp.level2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		//Write a Java program to check if a given number is a palindrome or not.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number = scanner.nextInt();
		
		int original_number=number;
		int reverse =0;
		
		while(number!=0){
			reverse=reverse*10 + number%10;
			number=number/10;
			}
		if(original_number==reverse) {
			System.out.println(original_number+" is Palindrome Number");
		}else {
			System.out.println(original_number+" is not Palindrome Number");
		}
	}
	
		
	}
	

	

