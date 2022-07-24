/*
	Initialize a character variable in a program and
	print 'Alphabhet' if the initialized value is an alphabhet,
	print 'Digit' if the initialized value is a number, and
	print 'Special Character', if the initialized value is anything else.
*/

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any value");
		char c = sc.next().charAt(0);
		
		if((c>='A' && c<='Z') || (c>='a' && c<='z'))
		{
			System.out.println("Alphabet");
		}
		
		else if(c>='0' && c<='9')
		{
			System.out.println("Number");
		}
		
		else 
			System.out.println("Special charcter");

	}

}
