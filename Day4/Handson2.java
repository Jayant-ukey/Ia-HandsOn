package com.ia.hand.eighteenJu;

/* 
	Write a java program that will concatenate 2 strings and return the result.
	The result should be in lowercase.
	
	Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

	Example1)
	i/p:Sachin,Tendulkar
	o/p:sachin tendulkar
	
	Example2)
	i/p:Mark,kate
	o/p:markate

*/

import java.util.Scanner;

public class Handson2 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		String s = "Mark,kate";
		s = s.toLowerCase();
		int i1=0,i2=0;
		char a[] = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == ',') {
				i1= i-1;
				i2= i+1;
			}
		}
		
		if(a[i1] == a[i2]) {
			for(int i=0;i<a.length;i++) {
				if(i==i1 || i==(i1+1)) {
					continue;
				}
				else
					System.out.print(a[i]);
			}
		}

		else {
			System.out.print(s.replaceAll(","," "));
		}
	}

}
