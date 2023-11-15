package com.bootcamp.level3;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// Write a Java program to convert Fahrenheit to Celsius.
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("enter the fahrenheit value :");
		float fahrenheit = scanner.nextFloat();
		
		float celsius = (fahrenheit-32)*5/9;
		System.out.println("the celsius value is :" +celsius );
		scanner.close();
		

	}

}
