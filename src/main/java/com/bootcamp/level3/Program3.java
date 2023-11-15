package com.bootcamp.level3;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// Write a Java program to find the average of three numbers.
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c,average;
		
		System.out.println("enter the first number :");
		a = scanner.nextInt();
		
		System.out.println("enter the second  number :");
		b = scanner.nextInt();
	
		System.out.println("enter the thir1d number :");
		c = scanner.nextInt();
		
		
		average =(a+b+c)/3;
		
		System.out.println("the average of three number is :" +average);
		
		scanner.close();

	}

}
