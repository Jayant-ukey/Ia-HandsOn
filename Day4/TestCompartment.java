package com.ia.hand.eighteenJu;

/*
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of 
them to print notice message that is suitable to the specific type of compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]

*/

import java.util.Random;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment{
	
	public String notice() {
		return "Inside FirstClass";
	}
	
}

class Ladies extends Compartment{
	
	public String notice() {
		return "Inside Ladies";
	}
	
}

class General extends Compartment{
	
	public String notice() {
		return "Inside General";
	}
	
}

class Luggage extends Compartment{
	public String notice() {
		return "Inside Luggage";
	}
}


public class TestCompartment {

	public static void main(String[] args) {
		
		Compartment a[] = new Compartment[10];
		Random rand = new Random();
		
		int i = rand.nextInt(5);
		
		System.out.println(i);
		
		if(i == 1) {
			a[0] = new Luggage();
	        System.out.println(a[0].notice());
		}
		
		else if(i == 2) {
			a[1] = new Ladies();
	        System.out.println(a[1].notice());
		}
			
		else if(i == 3) {
			a[2] = new General();
	        System.out.println(a[2].notice());
		}
		
		else if(i == 4) {
			a[3] = new FirstClass();
	        System.out.println(a[3].notice());
		}
		
		else
			System.out.println("Invalid");
		
	}
}


