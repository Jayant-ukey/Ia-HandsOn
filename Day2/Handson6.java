package com.ia.hand.foJ;

//Write a program to print the sum of all the digits of a given number.

import java.util.Scanner;

public class Handson6 {

	public static void main(String[] args) {
		
		int t,sum=0,rem;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no : ");
		int n = sc.nextInt();
		
		int d = n;
		
		while(d != 0) {
			rem = d%10;
			sum = sum + rem;
			d = d/10;
		}
		
		System.out.println("Sum of all Digits : "+sum);
	}

}
