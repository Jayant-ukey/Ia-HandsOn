package com.ia.hand.eighteenJu;

/*
	Given two strings a and b, return a new string, following the rules given below.
	If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
	Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
	
	Example1)
	i/p:abcXY123XYijk,XY
	o/p:c13i
	
	Example2)
	i/p:XY123XY,XY
	o/p:13
	
	Example3)
	i/p:XY1XY,XY
	o/p:11 

*/

import java.util.Scanner;

public class H11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] ss = str.split(",");
		
		String s1 = ss[0];
		String s2 = ss[1];
		
		

	}

}
