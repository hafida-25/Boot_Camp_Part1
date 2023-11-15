package com.bootcamp.level2;



public class Program9 {

	public static void main(String[] args) {
		
		//Write a Java program to implement binary search algorithm.
		
		int array[]= {11,14,16,29,25};
		
		
		int key=16;//key to be searched
		System.out.println("key to be searched= " +key);
		
		int first =0;  //set first to first index  (first index=0)
		
		int last=array.length-1;   // set last to last element in array
		
		int mid=(first+last)/2;   // calculate medium of the array
		
		while(first <=last) {
			if(array[mid] <key) {
				first=mid+1;
			}else if (array[mid] ==key) {
				System.out.println("element is found at  index:" +mid);
				break;
				
			}else {
				last=mid-1;
			}
		mid=(first+last)/2;
						
						
		}if (first>last) {
			System.out.println("element is not found ");
		}
		
		

	}

}
