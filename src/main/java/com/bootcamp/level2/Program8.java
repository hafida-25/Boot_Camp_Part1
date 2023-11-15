package com.bootcamp.level2;

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
		//Write a Java program to implement insertion sort algorithm.
		
		int array[]= {34,87,45,25,89};
		System.out.println("Array befor sorting:"+Arrays.toString(array));
		
		int length=array.length;
		
		for (int i =1;i<length;i++) {
			int temp = array[i];
			int j= i-1;
			while (j>=0 && array[j] >temp) {
				array[j+1]=array[j];
				j--;
				
				}
		array[j+1]=temp;
		}
		
		System.out.println("Array after sorting:"+Arrays.toString(array));
	
	}

}
