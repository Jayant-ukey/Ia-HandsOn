package com.ia.hand.tweentoneJu;

import java.util.Iterator;
import java.util.Vector;

/*
 *Implement the assignment 1 using Vector 
 */

public class H5 {

	public static void main(String[] args) {
		
		Vector<String> ob = new Vector<>();
		
		ob.add("January");
		ob.add("February");
		ob.add("March");
		ob.add("April");
		ob.add("May");
		ob.add("June");
		ob.add("July");
		ob.add("Augest");
		ob.add("September");
		ob.add("October");
		ob.add("November");
		ob.add("December");
		
		Iterator itr = ob.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
