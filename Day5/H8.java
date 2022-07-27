package com.ia.hand.tweentyJu;

/*
	Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that 
	the age entered is >=18 and < 60.
	
	Display proper error messages.x
	
	The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
	
	(Hint : Create a user defined exception class for handling errors.)

*/

class AgeException extends Exception{
	AgeException(String msg){
		System.out.println(msg);
	}
}

public class H8 {
	
	public static void checkAge(int a)throws AgeException {
		if(!(a>=18 && a< 60))
			throw new AgeException("Age Should be in the range of 18 to 59");
		
		else {
			System.out.println("You are within age limit");
		}
	}

	public static void main(String[] args) {
		
		int age = Integer.parseInt(args[0]);
		
		try {
			checkAge(age);
		}

		catch(Exception e){
			System.out.println(e);
		}
	}

}
