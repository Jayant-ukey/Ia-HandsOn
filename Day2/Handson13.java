package com.ia.hand.foJ;

// Progam to check wheather it is in array or not

import java.util.Scanner;

public class Handson13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		
		int arr[] = {44,7,94,12};
		System.out.println("Enter any no to check wheather it is in array or not ");
		int n = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(n == arr[i])
			{
				System.out.println(i);
				flag = 1;
			}
			
		}
		
		if(flag == 0)
			System.out.println(-1);
	}
}
