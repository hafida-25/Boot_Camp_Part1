package com.bootcamp.level3;

import java.util.Random;

public class Program10 {

	public static void main(String[] args) {
		// Write a Java program to generate a random number between 1 and 100.
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(101);
		
		System.out.println("Randon number between 1 to 100 : " +randomNumber);

	}

}
