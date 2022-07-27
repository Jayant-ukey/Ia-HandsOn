package com.ia.hand.eighteenJu;

/*
	Write a java program that will return the first half of the string, if the length of the string is even.
	It should return null for odd length string.
	
	Example1)
	i/p:TomCat
	o/p:Tom
	
	Example2)
	i/p:Apron
	o/p:null
 */

import java.util.Scanner;

public class H4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		if(str.length() %2 == 0)
		{
			System.out.print(str.substring(0,str.length()/2));
		}
		
		else
			System.out.println("null");
	}

}
