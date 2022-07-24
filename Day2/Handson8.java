package com.ia.hand.foJ;

//Write a program to reverse a given number and print

import java.util.Scanner;

public class Handson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i,rem;
		System.out.print("Enter any no : ");
		int n = sc.nextInt();
		i=n;
		
		while(i != 0) {
			rem= i%10;
			System.out.print(rem);
			i=i/10;
			
		}

	}

}
