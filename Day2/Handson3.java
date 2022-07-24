package com.ia.hand.foJ;

//Write a program to check if a given number is prime or not.

import java.util.Scanner;

public class Handson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no to check wheather it is prime or not");
		int n = sc.nextInt();
		
		if(n==0 || n==1)
			flag = 1;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
			System.out.println(n+ " is a prime no");
		
		else
			System.out.println(n+" is not a prime no");

	}

}
