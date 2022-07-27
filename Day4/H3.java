package com.ia.hand.eighteenJu;

/*
	Given a string, return a new string made of 'n' copies of the first 2 chars of the original string
	where 'n' is the length of the string.
	
	Example1)
	i/p:Hello
	o/p:HeHeHeHeHe
 */

import java.util.Scanner;

public class H3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.substring(0,2));
		}

	}

}
