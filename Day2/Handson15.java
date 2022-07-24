package com.ia.hand.foJ;

import java.util.Arrays;
import java.util.Scanner;

public class Handson15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of an array");
	int s = sc.nextInt();
	
	int arr[] = new int[s];
	
	System.out.println("Enter the elements in an array");
	
	for(int i=0;i<s;i++) {
		arr[i]= sc.nextInt();
	}
	
	Arrays.sort(arr);
	
	System.out.println("Smallest 2 no are : "+arr[0]+", "+arr[1]);
	System.out.println("Largest 2 no are : "+arr[s-2]+", "+arr[s-1]);
	
	}

}
