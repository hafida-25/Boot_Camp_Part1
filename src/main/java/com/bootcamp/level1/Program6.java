package com.bootcamp.level1;

public class Program6 {
//Write a program to find the longest common subsequence of two strings in Java.
	public static void main(String[] args) {
		
		String string1 ="ABADC";
		String string2 ="BAFCE";
		
		int length1 = string1.length();
		int length2 = string2.length();
		int[][] lcs = new int[length1+1][length2+1];
		
		for(int i =0 ;i<=length1 ;i++) {
			for (int j=0 ;j<=length2;j++) {
				if(i==0 || j==0) {
					lcs[i][j]=0;
				}else if (string1.charAt(i-1) == string2.charAt(j-1)) {
					lcs[i][j]=lcs[i-1][j-1]+1;
				}else {
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
						
				
				}
			}
		}
		System.out.println("length of Longet commun subsequence is :" +lcs[length1][length2]);

	}

}
