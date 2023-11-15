package com.bootcamp.level2;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		// Write a Java program to implement selection sort algorithm.
		
		int array[]= {25,11,3,96,94,20,17};
		System.out.println("Array befor sorting: "+Arrays.toString(array));
		
		int length=array.length;
		
	
            for (int i=0;i<length-1;i++) {
			int minimum_index=i;
			for(int j=i;j<length;j++) {
				if(array[minimum_index]> array[j])
					minimum_index=j;
			}
			int temp = array[minimum_index];
			array[minimum_index]=array[i];
			array[i]=temp;
		}
		System.out.println("Array after sorting :"+Arrays.toString(array));
		
		}

	}


