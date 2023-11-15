package com.bootcamp.level3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		//Write a Java program to implement a simple calculator.
		
		double number1,number2;
		Scanner scanner = new Scanner(System.in); // take inputefrom the user
		
		System.out.println("enter the first number :");
		number1=scanner.nextDouble();//take the input
		
		System.out.println("Enter the second number :");
		number2=scanner.nextDouble();//take the input
		

		System.out.println("enter the operator (+,-,*,/): ");
		
		
		char operator = scanner.next().charAt(0);
		double result =0;
		
		switch(operator) {
		
		case'+':
			result =number1+number2;
			break;
			
		case'-':
			result = number1-number2;
			break;
			
		case'*':
			result = number1*number2;
			break;
			
		case'/':
			result=number1/number2;
			break;
			default:
				System.out.println(" you enter wrong input ");
				
		}
		System.out.println("the final result:" + number1+"" +operator + " "+number2 +"=" +result);
		
		scanner.close()	;
			
			
		
		}
	}


