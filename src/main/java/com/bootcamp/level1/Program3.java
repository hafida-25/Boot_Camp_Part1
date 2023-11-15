package com.bootcamp.level1;

import java.util.Arrays;

public class Program3 {
	//Write a program to sort an array of objects in Java using the quicksort algorithm. 

	public static void main(String[] args) {
		int [] array = {50,34,201,47,54,34,65,89,45,21};
		Program3 program3 = new Program3();
		program3.sort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
		

	}
	public void sort(int[] array , int lowerBound,int upperBound) {
		if(lowerBound<upperBound) {
			int location =partition(array,lowerBound,upperBound);
			sort(array,lowerBound,location-1);
			sort(array,location+1,upperBound);
		}
	}
	
	
public int partition(int[] array, int lowerBound,int upperBound) {
	
	int pivot =array[lowerBound];
	int start =lowerBound;
	int end = upperBound;
	
	while (start<end) {
	
	while(array[start] <= pivot) {
		start++ ;
	}
	
	while(array[end]>pivot) {
		end--;
	}
	
	if(start<end) {
	swap(array,start,end);
	}
}
	
  swap(array,lowerBound,end);
return end;
}


public void swap(int[] array, int s , int e) {
	int temp;
	
	temp= array[s];
	array[s]=array[e];
	array[e]=temp;
	
	
}
}

