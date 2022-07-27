package com.ia.hand.tweentyJu;

/*
 * Write a Program with a division method which receives two integer numbers and
 *  performs the division operation.
*/


public class H5 {
	
	int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		H5 h = new H5();
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println("Division of "+a+"/"+b+" = "+h.div(a, b));
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
		
		catch(Exception e) {
			System.out.println("Main Exception : "+e);
		}
		
		
	}

}
