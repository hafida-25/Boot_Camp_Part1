package com.bootcamp.level3;

public class Program5 {

	public static void main(String[] args) {
		//Write a Java program to check if a given number is prime or not.
		
		int number=3;
		int count=0;
		
		if(number>1)
		{
			for (int i=1;i<=number;i++)
			{
				if(number%i == 0)
					count++;
				
			}
			if (count==2) {
				System.out.println("is prime number");
			}
		else {
			System.out.println("is not prime number");
		}

	}

	}
	}
