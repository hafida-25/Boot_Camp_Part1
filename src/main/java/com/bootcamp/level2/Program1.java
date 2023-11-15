package com.bootcamp.level2;

import java.util.Scanner;

public class Program1 {
	
	
	//Write a Java program to find the factorial of a number using recursion.
	
	public static int factorial(int number) { // logic to calculate factorial of a number
		if(number==0) {
			return 1;
		}else {
			return number*factorial(number-1);
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner (System.in);//take input from user
		System.out.println("enter a number :");
		
		int number = scanner.nextInt();
		System.out.println("Factorail od a number is " +factorial(number));
		
	scanner.close();

	}

}
