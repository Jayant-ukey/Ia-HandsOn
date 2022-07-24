package com.ia.hand.foJ;

import java.util.Arrays;

public class Handson12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {44,7,94,12};
		
		Arrays.parallelSort(arr);
		
		System.out.println("Min Value : "+arr[0]);
		System.out.println("Max value : "+arr[arr.length-1]);

	}

}
