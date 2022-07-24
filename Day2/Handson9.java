package com.ia.hand.foJ;

//Program to check whether the number is palindrome or not

import java.util.Scanner;

public class Handson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int d,rem,re=0;
		
		System.out.print("Enter any no : ");
		int n  = sc.nextInt();
		
		d = n;
		
		while(d != 0) {
			rem = d%10;
			re = re*10+rem;
			d = d/10;
		}
		
		if(n == re)
			System.out.println(n+" is a palindrome");
		
		else
			System.out.println(n+" is not a palindrome");
			

	}

}
