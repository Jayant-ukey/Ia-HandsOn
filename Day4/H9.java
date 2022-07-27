package com.ia.hand.eighteenJu;

/*
Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

import java.util.Scanner;

public class H9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Strings ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		char c1[]= s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		int i=0,j=0,z=0;
		
		if(s1.length() == s2.length()) {
			
			j=s1.length();
			while(i<j) {
				
				System.out.print(c1[i]+""+c2[i]);
				i++;
			}
		}
		
		else {
			if(s1.length() > s2.length())
				j=s2.length();
			
			else
				j=s1.length();
			
			
			while(i<j) {
				
				System.out.print(c1[i]+""+c2[i]);
				i++;
			}
		
			
			if(s1.length() > s2.length()) {
				for(z=j;z<s1.length();z++) {
					System.out.print(c1[z]);
				}
			}
			
			else {
				for(z=j;z<s2.length();z++) {
					System.out.print(c1[z]);
				}
			}
		}

	}

}
