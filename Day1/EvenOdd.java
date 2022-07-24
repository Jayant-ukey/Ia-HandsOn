/*
  Write a program to check if a given integer number is odd or even.
*/

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer value");
		int n = sc.nextInt();
		
		if(n%2 == 0)
			System.out.println(n+ " is an even No");
		
		else
			System.out.println(n+" is an odd no");

	}

}
