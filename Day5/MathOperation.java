package com.ia.hand.tweentyJu;

/*
	4) Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.
	Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.

*/

public class MathOperation {

	public static void main(String[] args) {
		
		try {
			int arr[] = new int[5];
			int sum =0;
			
			
			for(int i=0;i<5;i++) {
				int a = Integer.parseInt(args[i]);
				arr[i] = a;
				sum += arr[i];
			}
			
			System.out.println("Sum = "+sum);
			System.out.println("Average = "+(sum/5));

		}
		
		catch(ArithmeticException ob) {
			System.out.println("Exception : "+ob);
		}
		
		catch(NumberFormatException ob) {
			System.out.println("Exception : "+ob);
		}
		
		catch(Exception ob) {
			System.out.println("Main Exception : "+ob);
		}
	}

}
