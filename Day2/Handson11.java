package com.ia.hand.foJ;

//Write a program to initialize an integer array and print the sum and average of the array.

public class Handson11 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		int sum=0;
		float avg = 0.0f;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println("Sum : "+sum+" and avg : "+avg);

	}

}
