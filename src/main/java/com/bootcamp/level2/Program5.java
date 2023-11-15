package com.bootcamp.level2;

public class Program5 {

	public static void main(String[] args) {
	//Write a Java program to find the second highest number in an array.
		int [] array = {1,156,80,32,13,20};
	
		int largestNumber=0;
		int secondLargestNumber=0;
		
		for( int i=0;i<array.length;i++){
			if(array[i]>largestNumber){
				secondLargestNumber=largestNumber;
				largestNumber=array[i];
				
			}
			else if (array[i]>secondLargestNumber && array[i]!=largestNumber) {
				secondLargestNumber=array[i];
				
			}
		}
		System.out.println("second largest number is :" +secondLargestNumber);

}
		
		

	}


