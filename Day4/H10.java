package com.ia.hand.eighteenJu;

/*
	Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
	You may assume that n is between 0 and the length of the string, inclusive.
	
	Example1)
	i/p:Hello,3
	o/p:llollollo
*/

import java.util.Scanner;

public class H10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		System.out.print("Enter repitations : ");
		int n = sc.nextInt();
		
		int l = s.length();
		
		for(int i=0;i<n;i++) {
			System.out.print(s.substring(l-n));;
		}
		
	}

}
