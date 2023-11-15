package com.bootcamp.level1;

public class Program7 {
//Write a program to find the maximum subarray sum in an array of integers in Java.
	
	public static int maxSubarraySum(int[] array) {
		int size = array.length;
		int maxS= Integer.MIN_VALUE,maxEndingHere=0;
		for (int i=0;i<size;i++) {
			maxEndingHere = maxEndingHere+array[i];
			if (maxS < maxEndingHere)
				maxS =maxEndingHere;
			if(maxEndingHere<0)
				maxEndingHere=0;
		}
		return maxS;
	}
	public static void main(String[] args) {
		int[] array = {-4,6,-3,5,7,9,-3,8};
		System.out.println("Maximum subrray sum is :" + maxSubarraySum(array));
		

	}

}
