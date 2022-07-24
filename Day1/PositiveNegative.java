/*
  Write a program to check if a given integer number is Positive, Negative, or Zero.
*/


import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int no = sc.nextInt();
		
		if(no > 0) {
			System.out.println("Positive No");
		}
		
		else if(no < 0) {
			System.out.println("Negative No");
		}
		
		else {
			System.out.println("Zero");
		}
	}

}
