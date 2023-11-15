package com.bootcamp.level1;

import java.util.Arrays;

public class Program8 {
//Write a program to implement a merge sort algorithm in Java.
	
	public static void main(String[] args) {
		int[] array = {67,89,54,43,25,46,28,83,95,49};
		Program8 program8 = new Program8();
		program8.sort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));

	}
	
	public void sort(int[] array,int begin, int end) {
		if(begin<end) {
			int middle = (begin+end)/2;
			sort(array,begin,middle); // left array
			sort(array,middle+1,end);// right array
			marge(array,begin,middle,end);
		}
	}

	public void marge(int[]array,int begin,int middle,int end) {
		int leftArraySize = middle-begin+1;
		int rightArraySize = end-middle;
		int[]leftArray = new int [leftArraySize];
		int[] rightArray = new int[rightArraySize];
		
		for(int i =0;i<leftArraySize;i++) {
			leftArray[i] =array[begin+i];
		}
		for(int j=0 ;j<rightArraySize;j++) {
			rightArray[j] =array[middle+1+j];
		}
		int i=0;
		int j=0;
		int k=begin;
		while(i<leftArraySize && j<rightArraySize) {
			if(leftArray[i] < rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}else {
				array[k] = rightArray[j];
				j++;
				
			}
			k++;
		}
		while(i<leftArraySize) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<rightArraySize) {
			array[k] =rightArray[j];
			j++;
			k++;
		}
	}
}
