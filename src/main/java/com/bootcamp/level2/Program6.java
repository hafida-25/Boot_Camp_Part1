package com.bootcamp.level2;

import java.util.Arrays;

public class Program6 {

	public static void main(String[] args) {
		//Write a Java program to implement bubble sort algorithm.
		
		int array[]= {23,65,20,11,25};
		
		System.out.println("Array befor sorting:"+Arrays.toString(array));
		
		int length =array.length;
		
		for (int i=0;i<length-1;i++)  // number of passes
		{
			for (int j=0;j<length-1;j++)  // iteration in each pass
			{
				if(array[j]>array[j+1]) {
					int temp =array[j];
					array[j]=array[j+1];
					array[j+1] =temp;
					
				}
			}
		}
		
		System.out.println("Array after sorting :" +Arrays.toString(array));
		

	}

}
