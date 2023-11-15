package com.bootcamp.level1;

public class Program9 {
	//Write a program to implement a binary search algorithm for a rotated sorted array in Java.

	public static void main(String[] args) {
		int[] array = {6,9,5,2,8,2,4};
		int target=5;
		System.out.println("target found at index:" +binarySearch(array,target));

	}
	
	
public static int binarySearch(int[] array,int target) {
	int start =0;
	int end = array.length -1;
	
	while (start<= end) {
		int mid = start+(end - start)/2;
		if(array[mid] == target) {
			return mid;
		}
		if(array[start] <= array[mid]) {
			if(target>= array[start] && target<array[mid]) {
				end =mid-1;
				}else {
					start=mid+1;
				}
		}else {
			if(target> array[mid] && target <= array[end]) {
				start =mid+1;
				}else {
					end=mid-1;
				}
			
		}
	}
	return -1;
	
}
}
