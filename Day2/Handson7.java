package com.ia.hand.foJ;

// Printing star pattern

import java.util.Scanner;

public class Handson7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Floyds : ");
		int n = sc.nextInt();
		
		System.out.println("\nUsing for loop");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Using while loop
		System.out.println("\nUsing while loop ");
		
		int i=0,j=0;
		
		while(i<n) {
			while(j<=i) {
				System.out.print("* ");	
				j++;
			}
			System.out.println();
			j=0;
			i++;
		}

	}

}
