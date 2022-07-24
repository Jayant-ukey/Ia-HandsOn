package com.ia.hand.foJ;

//Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class Handson12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {44,7,94,12};
		int max=arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Min Value : "+min);
		System.out.println("Max Value : "+max);
	}

}
