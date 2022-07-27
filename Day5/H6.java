package com.ia.hand.tweentyJu;

/*
	6) Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students.
	The name of the students and marks in 3 subjects are taken from the user while executing the program.
	In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)

*/

import java.util.Scanner;

class NegativeValueException extends Exception{
	
	NegativeValueException(String str){
		System.out.println(str);
	}
	

}

class ValueOutOfRangeException extends Exception{
	
	ValueOutOfRangeException(String str){
		System.out.println(str);
	}
}


public class H6 {
	

	public static void main(String[] args) throws ValueOutOfRangeException, NegativeValueException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of two students : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int a1[] = new int[3];
		int a2[] = new int[3];
		
		int sum=0,sum1=0,sum2=0;
		double avg = 0.0;
		
		try {
			
			System.out.println("Enter marks for "+s1);
			for(int i=0;i<3;i++) {
				a1[i] = sc.nextInt();
				
				if(a1[i] > 100) 
					throw new ValueOutOfRangeException("Value is beyond marks i.e. 100");
				
				else if(a1[i] < 0)
					throw new NegativeValueException("You entered negative number ");
				
				else
					sum1+=a1[i];
			}

			System.out.println("Enter marks for "+s2);
			for(int i=0;i<3;i++) {
				a2[i] = sc.nextInt();
				
				if(a2[i] > 100) 
					throw new ValueOutOfRangeException("Value is beyond range");
				
				else if(a2[i] < 0)
					throw new NegativeValueException("You entered negative number ");
				
				else
					sum2+=a2[i];
			}
			
			avg = (sum1+sum2)/2;
			
			System.out.println("Average of two student is : "+avg);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}//main

}
